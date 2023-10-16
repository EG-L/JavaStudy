package com.sist.main2;
//변수,메소드 오버라이딩 => 덮어쓰다.
/*
 * 오버라이딩
 * -------
 * 1) 메소드명이 동일
 * 2) 상속
 * 3) 매개변수가 동일 
 * 4) 리턴형도 동일
 * 5) 축소는 불가능 , 확대는 가능 (접근지정어) private < default < protected < public
 *    --------- -----------
 * */
class Super{
	int number = 10;
	void display() {
		System.out.println("Super Display Call..");
	}
}
class Sub extends Super{// Super를 확장해서 새로운 클래스를 만든다.
	int number = 20;
	void display() {
		System.out.println("Sub Display Call..");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super su = new Super();
		System.out.println("super.number ="+su.number);
		//*****
		su.display();
		Sub sb = new Sub();
		System.out.println("Sub.numver ="+sb.number);
		//*****
		sb.display();
		Super su1 = new Sub();
		System.out.println("super.number ="+su1.number);
		su1.display();
		//클래스 선언에 따라서 해당 데이터를 제어
		//Super생성 => Super에 있는 변수
		
		/*
		 *     멤버변수 : 선언된 클래스형
		 *       Super s ===> Super가 가지고 있는 변수
		 *       Sub s ===> Sub가 가지고 있는 변수
		 *     메소드
		 *       new Super() ==> Super가 가지고 있는 메소드
		 *       new Sub() ==> Sub가 가지고 있는 메소드
		 *       -----------------------------------
		 *       동적 바인딩
		 *         생성자에 따라서 메소드 주소값이 변경
		 *         생성자에 따라서 메소드 변경, 변수는 변경이 안된다.
		 *       ----------------------- 메소드는 생성자 타입
		 * */

	}

}
