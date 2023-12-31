package com.sist.main;

import java.net.URLEncoder;

/*
 *    1. 객체지향 프로그램 => Application, Web Application
 *                       ------------ ----------------
 *                                      | 캡슐화,인터페이스
 *                                      => 연산자 , 제어문 , 메소드
 *                                      => 데이터베이스 연동
 *                                        --------------
 *        = 코드의 재사용이 높다 ( 기존의 코드를 변경, 추가 )
 *        = 코드 관리가 용이하다 ( 구조적 프로그램 => 메소드로 기능별 구분 )
 *        = 이미 사용중인 프로그램 이용 ( 뛰어난 신뢰성 )
 *        = 대규모 프로젝트에 주로 사용
 *         -------------
 *          | Model 1 => 홈페이지 , 소규모 회사
 *           --------- 통으로 프로그램 제작 (개인)
 *            Model 2(O) => 공기업 , 금융권
 *           --------- Front , Back , DataBase ==> MVC
 *           Spring (MVC) => Front (MVC =>Vuex,Redux)
 *                                            -------
 *                                               |React-Query
 *           => 한개의 서버에서 작업 => 서버 점검 시에 서비스 중단
 *             -----------------
 *              | 여러 개의 서버로 나눠서 작업 (MSA)
 *                => Spring Cloud
 *                => 데이터분석 => 지능형웹
 *                   추천 시스템
 *                 new Vue({
 *                 })
 *                 
 *        = 클래스의 구성
 *               => 추상화
 *          ---- 공통적인 데이터 , 기능을 모아서 저장 => 사용
 *               -----------  -----
 *               멤버변수        메소드
 *                 |
 *                사람 : 이름 ,나이 , 키 , 성별 ...
 *                ----------------------------
 *                사물을 단순화 시키는 작업 => 추상화 작업 => 구체화 시키는 작업 => 프로그램
 *                => 한개의 클래스로 동작하는 것이 아니다.
 *                   여러개의 클래스를 연관관계를 맺어주는 것
 *                   행위자 <===> 처리
 *                   사람        자판기
 *                   사용자,관리자  <===> 웹
 *                   -------------------
 *                   행위자(Actor)
 *        ------------------------------------------
 *          --- 개발자마다 생각하는 데이터가 다르다.
 *          --- 맛집에 들어가는 데이터 추출
 *          1) 설계에 필요한 데이터 설계 (벤치마킹) =>멤버변수
 *          2) 기능 ( 메뉴 , 버튼 ) => 메소드 => 멤버메소드
 *          3) 변수에 대한 초기값 선언 => 생성자
 *        ------------------------------------------
 *        클래스를 메모리에 저장
 *          클래스명 변수명 = new 클래스명();
 *                           --------- 생성자
 *        -------------------------------------------
 *        재사용 / 데이터 변질 및 손실 / 변경이 쉽게 ... (객체지향) => 유지보수
 *        ----   --------------   ---------------------
 *        |상속,포함  | 캡슐화          |다형성(오버라이딩,오버로딩)
 *        
 *       *** 멤버변수
 *           ------
 *            | 따로 사용 => 인스턴스 변수
 *            | 한개만 사용 => 정적 변수(static)
 *            ---------------------------- 데이터베이스 (정규화)
 *              => 값 => 취미
 *                     영화, 낚시, 쇼핑 => JOIN
 *       -----------------------------------------------
 *         클래스의 구성 요소 => 5장
 *           class A
 *           {
 *             데이터 선언 => 데이터의 손실, 변질 (은닉화) => private
 *               멤버 변수 : new를 이용할 때마다 따로 저장되는 공간 생성
 *               정적 변수 : 한개만 생성 => 공유 (static)
 *               => private 데이터형 변수명;
 *                 => 읽기 / 쓰기
 *                   ----------
 *                   Getter / Setter
 *                 => 은닉화 vs 캡슐화
 *                 => 정적변수 vs 인스턴스변수의 사용처
 *            ------------------
 *             데이터 초기화
 *               생성자 => 여러 개 사용 가능(오버로딩)*** 기능 추가시 사용
 *                                    -------- 메소드명 동일, 매개변수의 개수 및 데이터형이 다르다., 리턴형과 관계가 없다.
 *                 1) 특징
 *                    = 클래스명과 동일
 *                    = 리턴형이 존재하지 않음
 *                 2) 역할
 *                    = 멤버변수 초기화
 *                    = 메모리 저장 시 호출되는 메소드
 *                    ** 생성자는 필요시에만 사용
 *                        => 생성자가 없는 경우 자동으로 default 생성자 생성
 *                                                ------- 매개변수 X
 *               초기화 블록 : 컴파일러에서 자동으로 호출
 *                 = 인스턴스 블록
 *                   {
 *                       멤버변수, 정적변수 => 초기화 가능
 *                       ------ 생성자 => 생성자를 반드시 호출해야 저장
 *                       멤버메소드, 정적 메소드
 *                   }
 *                 = 정적 블록(static) => MyBatis
 *                   static
 *                   {
 *                      정적변수, 정적 메소드만 사용이 가능
 *                      ------ 자동 초기화
 *                   }
 *            ------------------
 *             데이터 활용
 *               메소드 ===> 다른 클래스와 통신 (연결) => public
 *               ----
 *               1) 종류
 *                  = 멤버 메소드
 *                    [접근지정어] 리턴형 메소드명(매개변수(parameter))
 *                    {
 *                      ---- 기능
 *                    }
 *                  = 정적 메소드 ==> 암호화/복호화
 *                    [접근지정어] static 리턴형 메소드명(매개변수(parameter))
 *                    {
 *                      ---- 기능
 *                      ==> 멤버변수를 활용하지 않는 경우 (공통으로 적용하는 기술)
 *                    }
 *                    ==> 윈도우 : 모든 클래스에서 적용 => 이미지 크기 조절 
 *                    ==> 웹 : 한글변환 => ISO-8859_1(ASC) ==> UTF-8
 *                      URLEncoder.encode(문자)
 *                      URLEncoder.decode(이진문자)
 *                  = 종단 메소드 : 오버라이딩이 안되는 메소드 => 사용빈도가 없음
 *                     [접근지정어] final 리턴형 메소드명(매개변수(parameter))
 *                     {
 *                     }
 *                  = 추상 메소드 : 구현이 안된 메소드 => 선언만 되는 메소드
 *                                설계용
 *                                => 추상클래스 / 인터페이스
 *                                => 여러개의 클래스를 한 개의 이름으로 묶어서 처리
 *                                  ------------------------------------
 *                                   데이터 여러개 => 한개의 이름으로 제어
 *                                                배열
 *                                   여러개의 클래스 => 인터페이스
 *                                                     |
 *                                                  결합성을 낮게 만들어준다.
 *                                                  -----
 *                                                   클래스를 수정 => 다른 클래스에 영향을 얼마나 미치는가?
 *                     [접근지정어] abstract 리턴형 메소드명(매개변수(parameter)) 
 *                     {
 *                     }
 *           }
 *         객체지향 3대 특성 => 6장
 *         => 
 *            캡슐화 : private 변수 => 읽기/쓰기 메소드
 *            상속 : 기존의 기능을 사용
 *                  extends : 확장
 *                  => 예외 : static , 생성자 , 초기화블록 , private은 접근 불가
 *                  => final 클래스는 상속할 수 없다.
 *            다형성 : 변경 / 추가
 *                  => 오버라이딩 / 오버로딩
 *            --------------------------------
 *            재사용 : 변경 (상속) , 있는 그대로 (포함)
 *                                       ------ 멤버변수로 사용
 *                                              ------
 *                                              | 기본형 , 배열 , 클래스 , 열거형 , 인터페이스
 *                                                                           --------
 *                                                                           |데이터베이스 연결
 *                                                           Connection
 *                                                         ---------------
 *                                                          |     |      |
 *                                                       Oracle  MySql MSSQL
 *                                                              
 *         클래스의 종류 => 7장
 *           = 추상클래스
 *             public abstract class className
 *             {
 *             }
 *           = 인터페이스 => 추상클래스의 일종
 *           public interface interface명
 *           {
 *              //상수형 변수
 *              //선언만된 메소드 ==> 윈도우 : 버튼 , 마우스 , 키보드
 *           }
 *           ---------------------------- 미완성된 클래스
 *                                        ----------
 *                                        |new를 이용해 메모리 할당이 안된다.
 *                                        |상속을 내려서 구현 후 사용
 *           = 내부클래스 : Thread , 네트워크, 데이터분석
 *                                       --------
 *             = 멤버클래스
 *               class A =>네트워크 서버 => 접속시 처리 윈도우
 *               {
 *                 데이터 => 접속자 ip 저장
 *                 class B =>통신서버 => 접속인하고 통신 쓰레드
 *                 {
 *                   데이터
 *                 }
 *               }
 *             = 익명클래스
 *               class A
 *               {
 *                 B b = new B();
 *                 {
 *                    void display(){
 *                    }
 *                 }
 *               }
 *               class B
 *               {
 *                 void display(){
 *                 }
 *               }
 *         사전에 에러 방지 => 8장
 *          1) 직접 처리
 *             try ~ catch
 *          2) 간접 처리
 *             메소드() throws 예외처리
 *          3) 임의발생 => 테스트
 *          4) 사용자 정의 예외처리
 *        ------------------ 기본문법
 *         라이브러리 => 조립 => 9~15장
 *          => String , IO, Collection ==> SQL => Network
 *                     
 * */
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
// 오버라이딩(재정의) => 기본 (상속) => 속도 (상속(X)) => 익명의 클래스를 이용하면 재정의가 가능하다.
public class MainClass2 extends JFrame{
	//포함 클래스 JTable
	JTable table;//모양
	DefaultTableModel model;//데이터 테이블 제어
	// 초기화
	public MainClass2() {
		String[] col = {"번호","이름","성별","주소","전화번호"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row,col)
		{
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		//배치
		add("Center",js);
		String[] data = {"1","홍길동","남자","서울","010-1111-1111"};
		for(int i = 0; i<10;i++) {
			model.addRow(data);
		}
		setSize(640,480);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MainClass2();
	}
}
