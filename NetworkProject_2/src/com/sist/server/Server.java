package com.sist.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

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
		
		public Client(Socket s) {
			this.s = s;
			
		}
	}

}
