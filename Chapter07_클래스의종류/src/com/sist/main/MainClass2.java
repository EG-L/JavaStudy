package com.sist.main;
/*
 *   클래스의 종류
 *     => 사용자 정의 일반 클래스
 *        --------
 *          |
 *           = 데이터형(여러개의 변수를 모아 한번에 저장)
 *             =====> ~VO (Value Object) => Spring
 *                    ~DTO (Data Transfer Object) => MyBatis
 *                     => 웹 => JSP(~Bean)
 *           = 액션 클래스 : 데이터형 클래스를 제어 => 메소드 
 *             =====> ~DAO => 오라클 연결 처리
 *                    ~Manager => 파일입출력 , 크롤링, openAPI
 *                    ~Service => DAO 여러 개를 묶어서 관리
 *                           DAO : 게시판
 *                           DAO : 댓글
 *                    ~Controller => 자바에서 브라우저 연동
 *                    -----------------------------------
 *                    ~RestController => 자바 => 자바스크립트
 *                                          JSON
 *                    -----------------------------------
 *   1) 추상 클래스 => 단일상속
 *      = 주목적
 *        관련된 클래스를 모아서 관리 (서로 다른 클래스를 연결해서 사용)
 *      = 미완성 클래스 (메소드를 구현하지 않는 경우) => 선언
 *        => new를 이용해서 메모리 할당 할 수 없다.
 *        => 사용시에는 반드시 상속을 내려서 구현 후에 사용한다.
 *                        ----
 *                         | 오버라이딩 기법 사용
 *      = 단일 상속만 가능
 *      = 선언만 한 메소드 존재할 수 있다.
 *      = 인스턴스메소드, 인스턴스 변수 사용이 가능
 *      = 형식)
 *         public abstract class ClassName
 *                --------
 *         {
 *            ----------------
 *             변수영역
 *            ----------------
 *             메소드 => 구현
 *               public void display(){};
 *            ----------------
 *             메소드 => 선언 => 없을 수 있다.
 *               public abstract void display();
 *               =>상속을 받은 클래스는 반드시 구현해야한다.
 *               =>구현이 안된 경우
 *                 버튼 => 디폴트가 불가능 (용도가 많다)
 *                 마우스
 *                 키보드
 *            ----------------  
 *         }
 *         
 *         public abstract class A
 *         public class B extends A
 *         {
 *         
 *         }
 *         => A a = new B();
 *           --------------- 구현된 클래스를 이용해서 메모리 할당
 *           
 *         ** 추상 클래스 => 공통성을 가지고 있는 클래스 => 요구사항 분석
 *            예)
 *               게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기
 *               묻고답하기 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 답변하기
 *               댓글게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 *               후기게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 *               
 *               1) 공통으로 가진 메소드 찾기
 *                 => 문제풀이
 *               2) 추상메소드 (구현이 안된 메소드)
 *                 => 클래스를 묶어서 한 개의 이름으로 제어
 *                 => 설계 => 프로그램에 맞게 구현
 *                          ----------------
 *                 => 추상클래스 => 모든 게시판 제어
 *             => 추상 클래스 확인
 *               1) 선언된 클래스와 생성자가 다른 경우
 *                 ---------------------------
 *               2) 메모리 할당 시 메소드 이용
 *               List list = new ArrayList();
 *   2) 인터페이스 => 추상클래스의 일종 => 다중 상속
 *   3) 내부클래스 
 *   
 *   ==> 버튼 , 마우스 , 키보드 ==> 디폴트가 존재하지 않는다.
 *      -------------------- 구현되지 않음
 *      abstract class ActionListener
 *      {
 *          버튼클릭();
 *          더블클릭();
 *      }
 *      abstract class MouseListener
 *      {
 *          마우스클릭_Left();
 *          마우스클릭_Right();
 *      }
 *      abstract class KeyListener
 *      {
 *          키보드클릭();
 *          키보드Up();
 *      }
 *      
 *      게임 제작
 *      class Game1 extends ActionListener
 *      class Game2 extends MouseListener
 *      class Game3 extends KeyListener
 *      
 *      class Game4 extends Game1
 *      class Game5 extends Game4
 *      
 *      class Game implements ActionListener,MouseListener,KeyListener
 *      => 추상 클래스 보완 
 *        1) 다중 상속
 *        2) 구현이 안된 메소드만 사용이 가능
 *        3) 변수 대신에 상수 사용
 *        4) 기본 => 다른 클래스에 영향이 없게 만든다.
 *        
 * */
//추상클래스
import java.util.*;
abstract class 도형{
	//선 , 도형, 삼각형 , 원 ...
	public abstract void draw();//추상 메소드
	public void select()
	{
		System.out.println("검정색으로 사용한다.");
	}
}
class 선 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
		
	}
	
}
class 사각형 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
class 원 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	public void select() {
		System.out.println("빨간색을 사용한다.");
	}
}
class 삼각형 extends 도형{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다.");
	}
	public void select() {
		System.out.println("파란색을 사용한다.");
	}
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("도형 선택 :");
		
		int mode = sc.nextInt();
		
		도형[] a = {new 원(),new 사각형(),new 선(),new 삼각형()};
		a[mode-1].draw();
		a[mode-1].select();
//		도형 a = null;
//		if(mode==1) {
//			a = new 원();
//		}
//		else if(mode ==2) {
//			a = new 사각형();
//		}
//		else if(mode == 3) {
//			a = new 선();
//		}
//		else {
//			a = new 삼각형();
//		}
//		a.draw();
//		a.select();
//		if(mode==1) {
//			원 a = new 원();
//			a.draw();
//			a.select();
//		}
//		else if(mode==2) {
//			사각형 a = new 사각형();
//			a.draw();
//			a.select();
//		}
//		else if(mode==3) {
//			선 a = new 선();
//			a.draw();
//			a.select();
//		}
//		else {
//			삼각형 a = new 삼각형();
//			a.draw();
//			a.select();
//		}

	}

}
