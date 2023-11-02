package com.sist.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

import com.sist.common.Function;

public class Server implements Runnable{
	private Vector<Client> waitVc = new Vector<Client>();
	private ServerSocket ss;
	private final int PORT = 8080;
	
	public Server(){
		try {
			ss = new ServerSocket(PORT);
			
			System.out.println("접속 대기 중..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true){
				Socket s = ss.accept();
				
				Client client = new Client(s);
				client.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	class Client extends Thread{
		String id,name,sex,pos;
		Socket s;
		BufferedReader in; // 요청받은 경우
		OutputStream out; // 응답하는 경우
		
		public Client(Socket s) {
			this.s = s;
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void run() {
			try {
				while(true) {
					String msg = in.readLine();
					
					StringTokenizer st = new StringTokenizer(msg,"|");
					int Protocol = Integer.parseInt(st.nextToken());
					switch(Protocol) {
						case Function.LOGIN:{
							id = st.nextToken();
							name = st.nextToken();
							sex = st.nextToken();
							pos = "대기실";
							
							// 접속되어 있는 사람들에게 전송
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							messageAll(Function.WAITCHAT+"|[알림 →] "+name+"님 입장하셨습니다.");
							// waitVc => 저장
							waitVc.add(this);
							// Login창을 닫고 , main을 보여준다.
							messageTo(Function.MYLOG+"|"+id);
							// 접속자 명단을 보낸다.
							for(Client client:waitVc) {
								messageTo(Function.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex+"|"+client.pos);
							}
							// 개설된 방을 전송 ==> (X)
						}
						break;
						case Function.WAITCHAT:{
							String data = st.nextToken();
							messageAll(Function.WAITCHAT+"|["+name+"]"+data);
						}
						break;
						case Function.EXIT:{
							messageAll(Function.WAITCHAT+"|[알림 →]"+name+"님이 퇴장하셨습니다.");
							messageAll(Function.EXIT+"|"+id);
							//아이디 테이블 제거
							for(int i = 0; i<waitVc.size();i++) {
								Client client = waitVc.get(i);
								if(client.id.equals(id)) {
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(i);
									try {
										// 송수신 종료
										in.close();
										out.close();
									} catch (Exception e) {
										// TODO: handle exception
									}
									break;
								}
							}
						}
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 처리 방식 => 2개 
		// 1. 접속자 전체로 전송 => 로그인(먼저 로그인 사람) / 나가기(남아있는 사람 처리) / 채팅
		public synchronized void messageAll(String msg) {
			//synchronized ==> 동기화
			try {
				for(Client client:waitVc) {
					client.messageTo(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// 2. 로그인 , 나가기 
		public synchronized void messageTo(String msg) {
			try {
				out.write((msg+"\n").getBytes());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public static void main(String[] args) {
			Server server = new Server();
			new Thread(server).start();
		}
		
		
	}

}
