package com.sist.main;
/*
 *     => 객체 지향
 *        ------
 *           데이터 손실 방지 : 캡슐화 ( 변수(private) 은닉화 )
 *                                 ----------- 저장 / 읽기 (Getter / Setter)
 *                                 ----------- HTML(Jsoup)
 *           재사용 : 상속 / 포함(***)
 *                         
 *           수정 / 추가 : 유지보수
 *           --------- 다형성(오버라이딩,오버로딩)
 *           
 *        상속 : 재사용
 *        --- 상위(슈퍼) 클래스 : 상속을 내리는 클래스 => 공통적으로 사용하는 내용(변수, 메소드)
 *            하위(서브) 클래스 : 상속을 받는 클래스 => 재사용 => 확장 (extends)
 *            -------- 하위 클래스 (확장)
 *               | 여러개의 하위 클래스를 묶어서 사용 => 상위 클래스를 이용
 *               | 단일 상속 , 키워드(extends)
 *              --> 그대로 사용 ( 포함 ) 				/ 변경 후 사용 ( 상속 )
 *                  ---------------   				-----------------
 *                  class Window                   class Window extends JFrame
 *                  {                              {
 *                    JFrame fr = new JFrame()     }
 *                  }
 *                  =>new를 이용하지 않아도 메모리 할당 가능(리플렉션)
 *                  
 *       사용법
 *         class A
 *         class B extends A
 *         
 *         ------------------
 *         
 *         class A
 *         class C extends A => A,C 기능
 *         class B extends C => A,C,B 기능
 *         => 상속을 받은 클래스가 메모리는 크다.
 *         => 클래스 크기는 슈퍼 클래스로 갈수록 크다.(범위) => 공통 기반 , 구체화
 *         
 *                생물
 *                 |
 *              ---       ---
 *              |            |
 *             동물          식물
 *              |
 *         -----------
 *         |    |    |
 *        포유류 양서류 조류
 *         |    |    |
 *     --------
 *     |   |  |
 *    인간  소  개
 *     |
 *   -----
 *   |   |
 *  남자  여자
 *   |
 * ----
 * |   
 * 홍길동
 *        class A
 *        class B extends A => A>B ==> is-a
 *        
 *        class A
 *        class B
 *        {
 *          A a = new A();  ==> B>A ==> has-a
 *        } 
 *    
 *    상속 => static : 상속은 존재하지 않지만 공통으로 사용 가능(메모리할당)
 *           private : 상속은 가능 => 접근 불가능
 *           ---------
 *           생성자
 *           초기화 블록 ==> 예외
 *           ---------
 *           
 *    ==> 메모리 할당
 *        여러개를 묶어서 사용 => 상위 클래스로 메모리 할당
 *        확장된 클래스로 메모리 할당
 *        ---------
 *        class A
 *        class B extends A
 *        
 *        => B b = new B(); 기본
 * */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
