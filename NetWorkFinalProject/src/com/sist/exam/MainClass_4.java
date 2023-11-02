package com.sist.exam;

public class MainClass_4 /*implements Runnable*/{
	public void run() {
		System.out.println("run call..");
	}
	public static void main(String[] args) {
//		Runnable r=()->{
//			System.out.println("Run call..");
//		};
//		Thread t = new Thread(r);
//		t.start();
//		
//		MainClass_4 m = new MainClass_4();
//		Thread t = new Thread(m);
//		t.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run call..");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		/*
		 *    function aaa(){} => implements
		 *    let aaa = function(){}
		 *    let aaa = ()=>{} => 
		 *    메소드는 메소드명이 주소
		 * */
	}
}
