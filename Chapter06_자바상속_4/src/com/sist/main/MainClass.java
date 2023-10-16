package com.sist.main;
/*
 *    1. 상속
 *      => 멤버변수 , ****메소드(기능 => 상속)
 *        -------
 *          | 접근지정어 (private, default(패키지가 다른 경우 사용할 수 없다.))
 *          => 메소드를 재사용하거나 변경해서 사용 (기능)
 *          => 객체 지향 관련 => 메소드
 *          => 라이브러리는 변수가 없다 => 메소드
 *                      ---- | 상수(CONST)
 *                      
 *      => 형식
 *         단일 상속만 가능
 *         class SubClass extends SuperClass{
 *                        ------- 기존의 클래스를 확장(수정,추가)
 *             SuperClass가 가지고 있는 모든 메소드 사용이 가능
 *             => 변경해서 사용이 가능 ( 오버 라이딩 )
 *         }
 *      => 호출
 *         class A
 *         class B extends A
 *              ---       ---
 *              sub      super => Super > Sub
 *              상속을 내리는 클래스가 상속받는 클래스보다 크다.
 *         *** 모든 클래스의 상위 클래스는 Object
 *             => 자바에서 지원하는 라이브러리의 메소드 => Object를 리턴한다.
 *             
 *         => 확장 (클래스 사용시에는 확장된 클래스를 사용한다)
 *         A a = new A(); => 활용
 *         B b = new B(); // 기본
 *         A a = new B(); // 특별한 경우에 사용
 *                          => A로부터 상속을 받은 클래스를 묶어서 
 *         --------------
 *               | 카페 => 게시판
 *               *** 상위 클래스는 하위 클래스에 있는 변수 / 메소드를 접근 o
 *            B b = new B();
 *            A a = new B();
 *            
 *            class A
 *            {
 *            ------------------
 *                int a,b;
 *                void aaa(){}
 *                void bbb(){}
 *            ------------------
 *            }
 *            class B extends A{
 *            ------------------------------
 *                int c,d;
 *                ----------- 메모리 상에만 배치
 *                int a,b;    
 *                -----------
 *                void aaa(){} => 변경 시 
 *                void bbb(){} => 변경 시
 *                -----------
 *                void ccc(){}
 *                -----------
 *            ------------------------------
 *            }
 *            
 *            A a = new A();
 *            B b = new B();
 *            A c = new B(); => A가 가지고 있는 변수
 *                           => B에서 오버라이딩된 메소드 호출
 *              - c는 접근 불가능 : 변수 (c,d)
 *                               메소드 (ccc())
 *            
 *            클래스 객체명
 *            ---------- => 객체는 클래스에 있는 변수, 메소드만 사용한다.
 *            A a => A클래스에 정의된 변수, 메소드
 *            
 *            상위클래스 = 하위클래스
 *            -------   --------
 *              |          |
 *             변수        메소드   ==> 메소드는 상위 클래스에 있는 것만 가능
 * */
class A{
	int a = 10,b = 20;
	void aaa() {System.out.println("A:aaa() Call..");}
	void bbb() {System.out.println("A:bbb() Call..");}
}
class B extends A{
	int a= 100, b = 200 , c = 300, d = 400;
	void aaa() {System.out.println("B:aaa() Call..");}
	void bbb() {System.out.println("B:bbb() Call..");}
	void ccc() {System.out.println("B:ccc() Call..");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("a.a ="+a.a);
		System.out.println("a.b ="+a.b);
		a.aaa();
		a.bbb();
		B b= new B();
		//==> 가장 많이 사용
		System.out.println("b.a ="+b.a);
		System.out.println("b.b ="+b.b);
		System.out.println("b.c ="+b.c);
		System.out.println("b.d ="+b.d);
		b.aaa();
		b.bbb();
		b.ccc();
		A c = new B();
		// ==> 인터페이스 (클래스 여러개를 묶어서 사용 ) => 30%
		System.out.println("c.a ="+c.a);
		System.out.println("c.b ="+c.b);
		c.aaa();
		c.bbb();
		// 멤버변수는 반드시 클래스 , 메소드

	}

}
