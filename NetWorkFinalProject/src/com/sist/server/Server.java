package com.sist.server;
/*
 *   서버
 *   ---
 *     접속 담당 ==> 1개만 사용
 *     통신 담당 (요청 => 응답) ==> 클라이언트 접속자 수만큼 사용
 *     ------- 쓰레드
 *     
 *     
 *     서버
 *       => 서버구동 ServerSocket
 *                 bind() ==> 개통 (ip,port) => 유심
 *       => 대기 (클라이언트 접근) => listen()
 *       => 접속 처리 => accept() => 발신자 정보 확인
 *          => 메모리에 저장
 *          => 쓰레드를 클라이언트마다 생성 => 따로 통신
 *          => 기능별 (Function)
 *             쓰레드 => 사용자 요청 => 처리 결과 응답
 *          
 * */
import java.net.*;
import java.io.*;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class Server implements Runnable{
	// 클라이언트 정보 저장 => id, name, sex, ip, port
	private Vector<Client> waitVc = new Vector<Client>();
	private ServerSocket ss;
	private final int PORT = 8080;
	
	//서버 가동 ==> 한번만 실행 가능
	public Server(){
		try {
			ss = new ServerSocket(PORT); // IP 자동 인식
			   
			//bind() => listen()
			//50명 default (backlog 증가 시 추가)
			System.out.println("Server Start..");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//접속시 처리
	public void run() {
		try {
			while(true) {
				//클라이언트 정보 얻기 => Socket(ip,port)
				Socket s = ss.accept(); // 발신자 정보 수신
				
				Client client = new Client(s);
				client.start();//통신시작
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		
	}
	
	//통신 담당 => 따로 작동 => 쓰레드
	class Client extends Thread{
		String id,name,sex,pos;
		Socket s;
		// 클라이언트 요청 / 응답
		BufferedReader in; // 요청받은 경우
		OutputStream out; // 응답하는 경우
		public Client(Socket s) {
			this.s = s;//클라이언트 컴퓨터
			//서버는 클라이언트 정보 / 클라이언트는 서버정보를 가지고 있어야 된다.
			// PORT 연결선 => 서버는 고정 포트 , Client는 동적할당 => 중복X
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//                                            ------------------ 클라이언트 요청 값 읽기
				out = s.getOutputStream();
				//   --------------------- 클라이언트 읽을 수 있게 메모리에 저장
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//요청 => 응답
		public void run() {
			
		}
		// 처리 방식 => 2개 
		// 1. 접속자 전체로 전송 => 로그인(먼저 로그인 사람) / 나가기(남아있는 사람 처리) / 채팅
		public synchronized void messageAll(String msg) {
			//synchronized ==> 동기화
		}
		// 2. 로그인 , 나가기 
		public synchronized void messageTo(String msg) {
			
		}
	}
}
