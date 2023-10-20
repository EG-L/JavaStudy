package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선택적인 부분 ==> 오류 발생 시 제외 ==> 크롤링
		try {
			for(int i = 1;i<10;i++) {
				try {
					int j = (int)(Math.random()*3);
					System.out.println("j ="+j+", i ="+i+",i/j="+(i/j));
				}
				catch(Exception e) {
					
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

}
