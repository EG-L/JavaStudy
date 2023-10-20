package com.sist.exception;
/*
 *  => 캡슐화 : private변수 / 읽기쓰기 메소드 추가
 *                         ----- Getter/Setter
 *     재사용
 *       상속(is-a) / 포함(has-a)
 *     다형성
 *       오버라이딩(수정-modify) / 오버로딩(추가-new)
 *  --------------------------------------------
 *  클래스의 종류
 *  ----------
 *   ------------ 미완성 클래스 (미완성 => 메소드 구현이 안 된 상태)
 *          => 단점 : 메모리 할당이 불가능 (new)
 *          => 상속을 내려서 구현 후에 사용 => 오버라이딩
 *          => 관련된 클래스를 한개의 객체명으로 관리
 *   = 추상 클래스 : 단일 상속, 멤버변수, 생성자, 구현된 메소드 , 구현이 안된 메소드
 *   = 인터페이스 : 다중 상속, 상수만 사용이 가능, 구현이 안된 메소드 중심
 *              => 구현된 메소드 : default / static
 *   ------------
 *    => 상속
 *       class    ====>   class
 *                extends
 *       interface == >   interface
 *                extends
 *       interface == >   class
 *                 implements
 *       class    =====>  interface
 *              이건 안됨
 *   ------------------------------------------
 *   class A
 *   class C
 *   class B extends A,C ==> 다중상속 오류
 *   
 *   class A
 *   class C extends A
 *   class B extends C
 *   ------------------> 정상 수행 코드
 *   
 *   interface A
 *   interface B extends A
 *   interface C extends B
 *   interface C extends A,B ==> 가장 많이 사용
 *   ----------------------다중 상속
 *   
 *   class A
 *   interface B
 *   interface C
 *   class D extends A implements B,C
 *   ---------------------------------
 *   
 *   interface A
 *   interface B
 *   class C implements A,B
 *   
 *   interface ==> Container 역할 , Controller 역할
 *                      |             |
 *                  묶어주는 역할      찾기, 제어
 *                --------------------------------
 *                |Spring
 *               => 소프트웨어 
 *  
 * */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
