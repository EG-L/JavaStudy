package com.sist.main;
/*
 *     인터페이스
 *      기본문법)
 *             변수는 사용할 수 없다 ( 상수만 가능 )
 *             int i; ==> 오류
 *             int I = 10; ==> 생략된 것이 있다
 *             ---------- public static final int I = 10;
 *                        -------------------
 *                        => static final int i = 10;
 *                           //상수
 *                           final int i = 10;
 *                           //상수형 변수
 *                           int i  10;
 *                           //변수
 *             메소드
 *               구현이 안된 메소드 : 구현내용이 여러개인 경우
 *                (public abstract) void display();
 *               구현이 된 메소드 : 공통으로 사용되는 부분 정의
 *                default void display();
 *                 => 새로운 기능 추가
 *             상속 : => 인터페이스도 클래스다
 *                     ----------------- 상속시 상위 클래스다.
 *                      extends
 *                      implements
 *                      ----------- 상속
 *             다중상속 => ,로 구분
 *             
 *             interface =====> interface
 *                       extends
 *             interface =====> class
 *                       implements
 *             
 *             class A
 *             interface B
 *             interface C
 *             class D
 *             class D extends A implements B,C
 *                    ---------  ----------
 *                     확장         구현
 *             {
 *             }
 * */
//interface A{
//	int B = 10;
//	void aaa();
//	public default void ccc() {}
//	public static void ddd() {}
//}
//class B implements A{
//	public void aaa() {
//		
//	}
//}
interface A{
	void aaa();
}
interface B extends A{
	void bbb();
}

class C implements B{
	public void aaa() {
		System.out.println("aaa() Call..");
	}
	public void bbb() {
		System.out.println("bbb() Call..");
	}
}


public class MainClass2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new C();
//		b.aaa();
//		b.bbb();
		
		

	}

}
