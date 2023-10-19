package com.sist.main;
/*
 *   interface
 *   ---------
 *     => 서로 다른 클래스를 연결해서 사용
 *     => 결합성이 낮은 프로그램
 *     => 개발자가 같은 메소드를 사용 => 표준화
 *     => 관련된 클래스를 묶어서 한개의 이름으로 관리
 *        --------------------------------
 *           Model => 형식 ==> interface
 *     class A
 *     class B
 *     class C
 *      {new A(),new B(), new C()}
 *      
 *     class A
 *     class B extends A
 *     
 *     A a = new A(); => A만 호출
 *     B b = new B(); => B,A 호출
 *     A a = new B(); => A에 있는 변수, B에 있는 오버라이딩된 메소드 호출
 *     
 *     
 *     --------
 *     
 *     interface I => aaa() ==> 클래스마다 콩통으로 적용되는 메소드만 선언
 *     class A implements I
 *            aaa() bbb()
 *     class B implements I
 *     class C implements I
 *     
 *     I i = new A();
 *    ----   ------- i에 존재하는 메소드중에 A에서 오버라이딩한 메소드 호출
 *     I i = new B();
 *     
 *     I i = new C();
 *     
 *     상위클래스 객체명 = new 하위클래스();
 *     
 *     => 접근 : 변수는 상위클래스에 있는 변수만
 *              메소드는 상위클래스 오버라이딩
 *     => 인터페이스를 통해서 클래스 접근
 *        ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적이다.
 *     interface A
 *     {
 *        void aaa();
 *        void bbb();
 *     }
 *     class B implements A
 *     {
 *        public void aaa(){}
 *        public void bbb(){}
 *        void ccc(){}
 *     }
 *     
 *     A a = new B(); ==> 가급적이면 사용하지 않는다.
 *    ---- => aaa(), bbb()
 *     
 * */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
