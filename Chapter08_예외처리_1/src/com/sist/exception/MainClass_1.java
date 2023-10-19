package com.sist.exception;
/*
 *     8장 => 예외처리
 *           ------- 에러 => 사전에 에러를 방지하는 목적
 *                       => 비정상 종료를 방지하고 정상상태 유지
 *                       => 예외처리 => 에러 발생 시 에러를 건너띤다.
 *     에러 발생
 *     -------
 *      = 사용자 (잘못된 입력) => 유효성 검사 => javasript
 *                        => if
 *      = 개발자 (실수) => 배열 인덱스, 정수변환... 형변환
 *      -----------------
 *      1) 사전에 차단 (조건문) => 예외처리
 *      2) 예외처리
 *        --------
 *           = 에러(Error) : 소스 상에서 수정이 불가능한 에러
 *                          메모리 저장 공간 부족
 *           = 예외(Exception) : 소스상에서 수정이 가능한 에러
 *             예) 파일경로명 IP, 0으로 나눈다.
 *                배열 인덱스 위치
 *                int[] arr = new int[2];
 *                arr[2] = 10; <<= 에러
 *       ==> 예외처리 방법
 *           ---------
 *           = 예외 복구 => try~catch
 *           = 예외 회피 => throws
 *           = 임의 발생 => throw
 *           = 지원하지 않는 예외 : 사용자 정의 예외처리
 *       ==> 예외의 종류 (상속도)
 *                   Object : 모든 클래스의 상위 클래스
 *                   ------
 *                      |
 *                   Throwable : 예외의 최상위 클래스
 *                      |
 *          ---------------------------
 *          |                          |
 *         Error                     Exception
 *         -----                     ---------
 *         처리가 불가능                   처리가 가능 (소스 변경)
 *         메모리 부족                    => 0으로 나누는 경우
 *         윈도우 충돌                    => 배열 인덱스범위를 벗어나는 경우
 *         톰캣이 작동이 안됨               => 형변환, 파일명 ... IP
 *         오라클 연결이 안됨               
 *         -------------
 *               
 *               Exception : 예외처리의 최상위 클래스
 *               ---------
 *                   |
 *     ----------------------------------
 *     |                                |
 *   CheckException              UnCheckException
 *   => 컴파일시에 예외처리 확인        => 확인이 없기때문에 필요시
 *   => 라이브러리 중에 반드시 예외처리
 *   => java.io
 *      => 파일명이 틀린 경우
 *      => FileNotFoundException
 *      => IOException
 *   => java.net
 *      => URL 주소 , IP가 틀린 경우
 *      => MalFormedURLException
 *   => java.sql
 *      => 오라클 URL : SQLException
 *         Jdbc:oracle:thin:@localhost:1521:XE
 *                                     ----
 *                                       |
 *                                     연결포트
 *                                     
 *   => 충돌 => Thread InterruptedException
 *   => ClassNotFoundException
 *   
 *   UnCheckException
 *   ----------------
 *    RuntimeException => 예외를 확인 할 수 없다.
 *    ----------------
 *       | 실행시 에러
 *         예) 1~100사이의 정수 입력 ..
 *       NumberFormatException : 문자열로 받아서 정수로 변경 시
 *            => 웹에서 가장 많이 발생 
 *            => http://localhost/main/main.jsp?page=10
 *            => 웹에서는 데이터 전송 => URL을 이용해서 전송
 *               자바는 메소드의 매개변수를 이용해서 전송
 *       ArrayIndexOfOutBoundsException : 배열의 범위를 벗어날 경우
 *       NulPointerException : 주소값이 없는 경우
 *       
 *       ArithmeticException : 0으로 나누는 경우
 *       
 *       ==> 에러 예상 :
 *            문자열로 정수를 받아서 배열에 저장 후 나누기를 한다.
 *            ---------       ----------- -----
 *       ==> 사전에 에러 방지 => 예측
 *       
 *       classCastException : 형변환 문제
 * */
import javax.swing.*;
class A{
	public void aaa() {
		System.out.println("A:aaa()");
	}
}
class B extends A{
	public void aaa() {
		System.out.println("B:aaa()");
	}
}
public class MainClass_1 extends JFrame{
	JButton b1,b2;
	public MainClass_1() {
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		add("North",b2);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		System.out.println(Integer.parseInt("10"));
//		int[] arr = new int[2];
//		System.out.println(arr[2]);
		new MainClass_1();
		
	}

}
