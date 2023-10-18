package com.sist.main;
/*
 *     추상클래스 => 확장 (보완) => 인터페이스
 *     인터페이스
 *     --------
 *      1. 추상클래스의 일종 => 인터페이스도 클래스
 *         구분) 클래스 / 인터페이스
 *             -----   -------
 *              |단일 상속 |다중 상속
 *      2. 인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있다.
 *                  ---------------
 *                   |인터페이스에 메소드 추가 시 문제 발생
 *                   |jdk 1.8 => 구현 메소드를 사용하게 만듬
 *                               ---------
 *                               default / static
 *         => 소프트웨어 공학 : 인터페이스는 고정을 해야 한다.
 *      3. 형식(247page)
 *         public interface interface명
 *         {
 *             ------------------------
 *              변수
 *               => 상수형변수 
 *               int a; ==> 오류 나는 코드
 *               int A = 10;
 *               -----------
 *                 추가 => (public static final) int A = 10;
 *                       -------------------- 생략 가능
 *             ------------------------
 *              구현이 안된 메소드
 *                void display(); ==> 구현 내용이 많은 경우
 *                => 프로그램에 맞게 구현해서 사용
 *                => public abstract void display();
 *                   ---------------- 생략 가능
 *                   *** 인터페이스는 모든 메소드가 public이어야 한다.
 *             ------------------------
 *              구현이 된 메소드
 *              default void aaa(){
 *              
 *              }
 *              => (public) default void aaa()
 *              static void bbb(){
 *              
 *              }
 *              => (public) static void bbb()
 *             ------------------------
 *              생성자가 존재하지 않는다.(추상 클래스는 생성자가 있다)
 *             ------------------------
 *         }
 *         인터페이스는 모든 접근지정어가 public (변수,메소드)
 *         변수 => 반드시 명시적 초기화를 한다
 *         int a; => int A = 10;
 *         
 *         상속
 *         ---
 *          implement => 구현해서 사용
 *          -----------------------
 *          interface ======> interface
 *          interface A
 *          interface B (extends) A
 *          interface ======> class
 *          interface A
 *          class B implements A
 *          class     ======> interface
 *          class A
 *          interface B (오류) A ==> 오류
 *          
 *          interface A
 *          interface B extends A => A,B
 *          interface C extends B => A,B,C
 *          --------------------------------
 *          interface D extends A,B => A,B,D
 *                             ----- 여러개를 동시에 받을 수 있음
 *                                   ,로 구분한다.
 *          interface A
 *          interface B
 *          class C implements A,B ==> 다중 상속
 *          
 *          interface A
 *          interface B
 *          class C
 *          class D extends C implements A,B
 *               ------------ --------------
 *                class 상속    interface 상속
 *          => 윈도우 
 *          => 인터페이스에 설정된 모든 것(메소드, 변수)
 *             public만 사용이 가능 => public을 설정하지 않으면 자동 추가
 *          => 인터페이스 사용
 *             => 윈도우 이벤트 처리
 *             => 사용자 정의 => 클래스 관리 ( 스프링 : 클래스 찾기(DL) )
 *                ---------------------
 *                  | => 인터페이스 대신 어노테이션으로 변경
 *                                  ---------
 *          => 설계
 *             1. 개발기간이 단축
 *                예)
 *                    예약
 *                    ---
 *                    로그인
 *                    맛집선택
 *                    예약일 선택
 *                    예약시간 선택
 *                    인원 확인
 *                    계약금
 *                    => 좌석선택
 *             2. 인터페이스 => 표준화
 *             3. 서로 다른 클래스 연결해 주는 역할 ( 스프링 )
 *          
 * */
//interface A{
//	int A = 10;
//	void disp();
//}
//class B implements A{
//	public void disp() {
//		
//	}
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MainClass3 extends JFrame implements ActionListener,MouseListener,KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
