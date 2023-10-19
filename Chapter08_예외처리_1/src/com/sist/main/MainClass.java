package com.sist.main;
/*
 *     7장 정리
 *     ------- JSP , Spring , Spring-Boot => 기본 자바
 *            => HTML/CSS/JavaScript
 *            => 데이터 저장 => Oracle / MySQL
 *            ------------------------------ 데이터 분석 (Python)
 *     *** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 *                  ------- 강제화
 *          interface I
 *          {
 *             void aaa();
 *             void bbb();
 *             void ccc();
 *          }
 *          class A implements I
 *          {
 *             void aaa(){};
 *             void bbb(){};
 *             void ccc(){};
 *             void ddd(){};
 *          }
 *          class B implements I
 *          {
 *             void aaa(){};
 *             void bbb(){};
 *             void ccc(){};
 *             void eee(){};
 *          }
 *          class C implements I
 *          {
 *             void aaa(){};
 *             void bbb(){};
 *             void ccc(){};
 *             void kkk(){};
 *          }
 *          인터페이스로 관리할 수 없다. ==>
 *          I i = new A(); => I를 가지고 A가 가지고 있는 메소드를 제어
 *            => 접근을 할 수 없는 메소드
 *            aaa() , bbb() , ccc() => 접근 가능
 *            ddd() => 접근 불가능
 *          I i = new B(); => I를 가지고 B가 가지고 있는 메소드를 제어
 *          I i = new C(); => I를 가지고 C가 가지고 있는 메소드를 제어
 *          ===> A,B,C가 유형이 같은 경우 한 개의 이름을 제어
 *               목적 => 서로 다른 클래스 묶어서 관리
 *                      ------------ 관련
 *                   => 관리(소스 코딩이 간결)
 *                   => 인터페이스의 메소드
 *                   예)
 *                          DriverManager
 *                               |
 *                   ------------------------------
 *                        |     |     |    |     |
 *                       오라클 MySQL MSSQL DB2 SQLLITE ...
 *                     VARCHAR2 VARCHAR
 *                     CLOB     TEXT
 *                     NUMBER   INT / DOUBLE
 *                   => SQL => ANSI(표준화)
 *                   
 *                   컬렉션(CRUD)
 *                   Collection
 *                       |
 *                   ---------------------
 *                   |
 *                  List
 *                   |
 *                ----------------------------------------------
 *                |          |          |           |          |
 *              ArrayList  Vector    LinkedList    Stack     Queue
 *     1) 인터페이스 VS 추상클래스
 *       ---------------------------------------------------
 *                   인터페이스                  추상클래스
 *       ---------------------------------------------------
 *       구현된메소드    선언된 메소드              선언된 메소드 / 구현된 메소드
 *                  public void display();
 *                  
 *                 JDK 1.8 =>
 *                      구현된 메소드 사용
 *                      = default
 *                        (접근지정어가 아니다)
 *                      public default void display();
 *                      = static
 *                       => 접근시에 반드시 인터페이스명으로만 접근
 *       ---------------------------------------------------
 *       인스턴스변수   사용할 수 없다              사용이 가능
 *                   => 공용                  private 변수 가능
 *                   => 상수형변수만 사용이 가능
 *                   => public (only)
 *                   => openjdk
 *                      jdk => 1.9(private가 사용 가능)
 *                       => C/C++ => exe
 *                       => 오라클에서 필요한 것(윈도우창)
 *       ---------------------------------------------------
 *       생성자        생성자가 없다              생성자가 있다
 *       ---------------------------------------------------
 *       접근범위       모든 내용 공개             한정한다 (모든 접근지정어 사용 가능)
 *                    => 메소드 , 변수
 *       ---------------------------------------------------
 *       상속          다중 상속                단일 상속
 *                    implements             extends
 *                    interface => interface
 *                              |
 *                              extends
 *                    interface => class
 *                              |
 *                              implements
 *                    => 사용자 정의, 라이브러리
 *                       => 단일 상속이 중심이다.
 *                    => 윈도우 : 여러개 받는 경우가 있다.
 *       ---------------------------------------------------
 *       ** 공통점 : new를 이용해서 메모리 할당이 불가능하다.
 *               => 상속을 내려 상속받은 클래스가 구현해서 사용
 *       ** 목적 : 서로 다른 클래스를 연결해서 사용이 가능
 *                관련된 클래스를 모아서 사용할 때 주로 사용
 *       ---------------------------------------------------
 *       인터페이스의 구성요소
 *       public interface interface명
 *       {
 *           ------------------------
 *           상수 : 반드시 초기값 설정 (명시적으로 설정)
 *           int A = 10;
 *                   --
 *            (public static final) int A = 10;
 *            => 컴파일 시 접근지정어/제어어 추가
 *           ------------------------
 *           구현이 안된 메소드 : 프로그램에 맞게 구현
 *           => 개발자가 알아서 구현
 *           (public abstract) void display();
 *           ------------------------
 *           구현이 된 메소드 : 
 *           => 공통으로 사용되는 부분
 *              => 필요시마다 변경 사용
 *            (public) default void method(){}
 *                    ---------
 *                    접근지정어가 아니라 구현된 메소드 표현
 *            (public) static void method(){}
 *            ==> 인터페이스명.메소드명() 사용 가능
 *           ------------------------
 *       }
 *       **** 만약에 기능 추가가 있는 경우에는 default를 이용한다.
 *                                    ---------
 * */
import java.util.*;
interface I{
	//public 생략 가능 => 컴파일시 자동 생성
	static void display() {
		System.out.println("I:Display() Call..");
	};
}
class A{
	public static void aaa() {
		System.out.println("A:aaa() Call..");
	}
}
class B extends A{
	//상속
	public void bbb() {
		A.aaa();
		aaa();
	}
}
class C implements I{
	//구현(상속)     --> class(단일상속) , interface(다중상속)
	public void ccc() {
		//display(); ==> 오류
		I.display();//인터페이스의 static 메소드 => 인터페이스명으로만 접근 가능
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		
		System.out.println(list.get(0).toString());
		
	}

}
