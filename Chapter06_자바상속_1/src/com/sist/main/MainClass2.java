package com.sist.main;
class A{
	int a=10,b=20;
	A(){
		System.out.println("생성자 호출 A");
	}
	void aaa() {
		System.out.println("A : aaa Call");
	}
}
class B extends A{
	int a=100,b=200;
	int c,d;
	B(){
		System.out.println("생성자 호출 B");
	}
	void aaa() {//오버라이딩 => 상속받은 메소드 변경
		System.out.println("B:aaa() Call");
	}
	void bbb() {
		System.out.println("B : bbb Call");
	}
}
//B클래스는 A클래스 상속
//A클래스는 슈퍼클래스고 B클래스는 서브클래스라 A클래스에서 B클래스를 불러올 수 없다.
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();//B클래스 변수나 메소드 사용 불가
		System.out.println("a=>"+a.a);
		System.out.println("b=>"+a.b);
//		System.out.println("c=>"+a.c);
//		System.out.println("d=>"+a.d);
		a.aaa();
		B b = new B();//A호출 후 B 호출
		// b => a,b,c,d,aaa,bbb 사용 가능
		System.out.println("a=> "+b.a);
		System.out.println("b=> "+b.b);
		System.out.println("c=> "+b.c);
		System.out.println("d=> "+b.d);
		b.aaa();
		b.bbb();
		// A> B => 클래스의 크기 ==> 범위 (상속을 내린 클래스가 항상 크다)
		/*
		 * A a = new B();
		 * B b = new A(); ==> 오류
		 * */
		
		A aa = new B();
		// aa => a,b,aaa() 접근 가능
		System.out.println("aa.a =>"+aa.a);
		System.out.println("aa.b =>"+aa.b);
//		System.out.println("aa.c =>"+aa.c);
		aa.aaa();
		//멤버변수 => A aa() 10 / 20
		//메소드 호출 => new B() 생성자 B클래스 호출
//		aa.bbb();
		
		B bb = (B)aa;//상위클래스 => 하위클래스로 받을 경우 형변환
		//----------- 가장 많이 등장
		System.out.println("bb.a =>"+bb.a);
		System.out.println("bb.b =>"+bb.b);
		System.out.println("bb.c =>"+bb.c);
		System.out.println("bb.d =>"+bb.d);
		bb.aaa();
		bb.bbb();
		B cc = (B) new A();//오류발생
		/*
		 *  상속 : 하위클래스로 접근하는 것이 기본
		 *       ------------------------
		 *       class A
		 *       class B extends A
		 *       B b = new B();
		 *        = static , private , 생성자 , 초기화블록
		 *        = 상위클래스는 공통적으로 사용하는 메소드 , 변수
		 *       A => 여러개를 한개의 클래스로 제어
		 * */
		
		/*
		 *  학생                회사원
		 *  ---               ------
		 *  학번                사번
		 *  ------------------------
		 *  이름                이름
		 *  나이                나이
		 *  ------------------------
		 *  학년                연차
		 *  
		 *  --------------------------
		 *  먹는다()             먹는다()
		 *  잠잔다()             잠잔다()
		 *  --------------------------
		 *  공부한다()            업무한다()
		 *  
		 *        사람
		 *        ---------
		 *        이름
		 *        나이
		 *        먹는다()
		 *        잠잔다()
		 *        ---------
		 *      |           |
		 *     학생         회사원
		 *     학번         사번
		 *     학년         연차
		 *     공부한다()    업무한다()
		 *     --------------------> 반복 제거
		 *     *** 단일 상속만 가능
		 *     
		 *     상위(슈퍼) 클래스는 하위(서브) 클래스가 가지고 있는 변수, 메소드 사용 불가능
		 *     하위(서브) 클래스는 상위(슈퍼) 클래스가 내려준 변수, 메소드를 사용 할 수 있다.
		 *                   => 변수 (static) 상속은 아니고 사용이 가능
		 *                   => 메모리 할당이 되있기 떄문에 공용으로 사용 가능
		 *     객체 생성
		 *     하위(서브) 클래스로 객체 생성
		 *     class A
		 *     class B extends A
		 *     
		 *     => B b = new B();
		 *     => A a = new A(); => 여러 개의 클래스를 한개로 묶어서 사용
		 *     => A a = new B();
		 *        B cc = (B)a;
		 *        
		 *     class 동물
		 *     class 사람 extends 동물
		 *     class 개 extends 동물
		 *     class 소 extends 동물
		 *     class 말 extends 동물
		 *     class 돼지 extends 동물
		 *     
		 *     ----------------------
		 *     
		 *     동물 animal = new 사람();
		 *     
		 *     animal = new 개();
		 *     
		 *     animal = new 소();
		 * */

	}

}
