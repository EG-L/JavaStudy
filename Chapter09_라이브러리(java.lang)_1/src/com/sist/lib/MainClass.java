package com.sist.lib;
/*
 *     java.lang  /  java.util / java.text / java.io
 *     java.net  / java.sql
 *     -------------------------- 표준 자바 (SE) => javax (웹, 윈도우)
 *            JDK 1.0                            JDK 1.2
 *         => java.lang => 보통 패키지가 다르면 import를 사용해서 클래스를 가지고 온다.
 *                         (java.lang은 생략이 가능)
 *            ---------
 *             Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object상속을 받는다)
 *                      = 모든 데이터형을 받을 수 있는 클래스
 *                      = 모든 데이터형을 모아서 관리
 *                      = Obejct[] obj = {"",'',10,10.5,new A()};
 *                        ---------------------------------------
 *                             | 자바스크립트(배열=>Object이기 때문에 ...)
 *                      = 기능만 가지고 있다 (메소드)
 *                      = 주요 기능
 *                        1) toString() : 자주 사용되는 메소드 , 객체를 문자열화
 *                           => 오버라이딩이 가장 많이 되는 메소드
 *                           => 기본 출력 : 객체 주소 값 
 *                           => 객체 출력할 때 toString()이 생략이 되고 있다.
 *                           => String toString() => 원형
 *                        2) clone() : 객체를 복제해서 새로운 객체 생성
 *                           => 스프링에서 주로 사용
 *                              ----
 *                              |싱긆톤 (한개의 객체만 생성해서 재사용하는 방식)
 *                                     ----- 필요시에는 여러개 생성이 가능 (clone)
 *                              | 응용 => JSP에서 (웹) => 알고리즘이 필요 없다.
 *                              | 스프링 => 디자인 패턴 / 알고리즘
 *                             => Object clone() throws CloneSupportedException
 *                                -------1. 예외처리, 2. 형변환을 한다.
 *                             => 1. 원형 (리턴형, 메소드명, 매개변수)
 *                                2. 사용처
 *                                3. 70~80% 이미 만들어져 있다. (라이브러리)
 *                                   20~30% 사용자 정의 => 라이브러리 + 사용자 정의 클래스 (조립식)
 *                                   => 라이브러리 중심으로 프로그램 구현 => CBD
 *                                   => 프로그래머 VS 개발자
 *                                     ---------  ------
 *                                        |          ㄴ 없는 것을 만들어가는 사람 (C, C++)
 *                                     이미 있는것을 조립 (자바 , C#)
 *                                   => Python / C/C++ / Java / C#
 *                                   => Java   / C/C++ / Python / C#
 *                                   => 특성
 *                                      => 미국, 유럽 => 아키텍쳐
 *                                      => 인도 => 구현
 *                                      => 일본 => 무선 발전
 *                                      => 한국 => 유선 발전 => 웹사이트(자바)
 *                        3) finalize() : 소멸자 ( 객체 메모리 해제시에 자동 호출 )
 *                                        => 멀티미디어 (스트리밍 서비스)
 *                                        => 멜론 / 지니뮤직 / OTT
 *                                        => 아프리카 TV
 *                                 protected void finalize()
 *                        4) equals() : 객체 비교 시에 주로 사용
 *                          ---------- String에서 오버라이딩이 된 메소드를 주로 사용
 *                                 boolean equals(Object obj)
 *                                         ------
 *                                         
 *                                         ==  : 주소값 비교 , 실제 주소 저장 값
 *                                         equals : 객체가 가지고 있는 데이터가 같은지 여부
 *                                         
 *                                  문자열은 문자열 자체가 주소
 *                                        ---------
 *                                        | 문자열이 같은 경우에는 같은 주소
 *                                        | 문자열이 같지만 다른 주소 저장시에는 new를 이용
 *             String : 문자열을 저장하는 데이터형 / 클래스형
 *                     ----------- 기능을 사용할 수 있다.
 *                     비교 
 *                     ---
 *                      = equals => 같은 문자열인지 확인
 *                        => 로그인, 아이디 중복체크
 *                        => 아이디 찾기 , 비밀번호 찾기
 *                        => 상세보기
 *                        => 원형
 *                           boolean equals(String s)
 *                        => 같은 문자열은 같은 주소를 가지고 있다.
 *                           new를 이용하면 다른 주소에 저장이 된다.
 *                      = startsWith / endsWith
 *                        => 원형
 *                        ***boolean startsWith(String s)
 *                          => s로 시작하는 문자열
 *                          => 자동완성기 => 대소문자 구분
 *                        boolean endsWith(Strign s)
 *                          => s로 끝나는 문자열
 *                          => 사용빈도가 거의 없음
 *                      = Contains : 문자열 포함 여부
 *                        => 자바스크립트도 동일
 *                        ** boolean contains(String s)
 *                         => 문자열 중에 s가 포함되었는가?
 *                         => 가장 많이 사용 되는 메소드
 *                     => 문자열 분리
 *                       = split() => 원하는 문자별로 분리
 *                         String[] split(",") => 크롤링 
 *                                 ------------
 *                                 | 정규표현식 이용
 *                          정규표현식은 =>
 *                             기호 ==> \\기호
 *                             -------------
 *                              = ^ => ^A => A로 시작하는 모든 문자열
 *                                    startsWith , A%(오라클)  
 *                              = $ => A$ => A로 끝나는 모든 문자열
 *                                    <img src^="http|https">
 *                                    <img src$="jpg|png|gif">
 *                                    <img src*="aaa"> => aaa가 포함된 모든 문자열
 *                                    => 오라클 / JavaScript / CSS
 *                              = + => A+ => A로 시작 => 1개 이상 문자열
 *                              = * => A* => A로 시작 => 0개 이상 문자열
 *                              = | => A|B => A 또는 B
 *                              = [] => 문자의 범위
 *                                [A-Z] => 대문자 전체 
 *                                ^[A-Z] => 대문자로 시작한 전체 문자열
 *                                [a-z]
 *                                [0-9]
 *                                [가-힣] 
 *                              = {} => 문자의 개수
 *                                {3} => 3글자 , {1,3} => 1글자~3글자
 *                             211.238.142.1 ....
 *                             [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *                             = . 임의의 한 글자
 *                             = .. 임의의 두 글자
 *                       
 *                       = subString : 문자를 자른다.
 *                         String substring(int s)
 *                         => String s = "Hello Java"
 *                                        0123456789 => 문자열의 시작은 0번부터
 *                            s.substring(6) => "Java"
 *                         => s.substring(1,4) => "ell" => 1번부터 4번전까지 자른다.
 *                         String substring(int s, int e) =>s~e-1
 *                                                ------제어
 *                         => 화면이 길어지면 ... 사용
 *                      => 변환
 *                        replace
 *                         => String replace(char c1, char c2)
 *                                             old      new
 *                                   replace('A','B')
 *                                   
 *                         => String replace(String s1, String s2)
 *                                   replace("파이썬","자바")
 *                        replaceAll => 정규식
 *                     => 문자 위치 찾기
 *                        => indexof => 앞에서 부터 찾기
 *                        => lastindexof => 뒤에서 부터 찾기
 *                        int indexof(char c)
 *                        int indexof(String s)
 *                        int lastindexof(char c)
 *                        int lastindexof(String s)
 *                     => String s = "Hello Java";
 *                               => char[]를 쉽게 제어가 가능하게 만든 클래스
 *                               Hello Java
 *                               0123456789
 *                               
 *                               s.indexof('a') => 7
 *                               s.lastindexof('a') => 9
 *                               =============> 경로명 / 웹사이트 주소
 *                     => 기타
 *                        length() : 문자의 개수
 *                        int length()
 *                        trim() : 좌우 공백 제거
 *                        String trim() => 사용자 입력이 있는 경우
 *                        valueof : 모든 데이터형을 문자열로 반환
 *                        ==> static String valueOf(int a)
 *                           => 모든 데이터형이 오버로딩
 *                           => String.valueof(10) => "10"
 *                        char charAt(int index)
 *                        => 한글자씩 잘라서 문자로 변환
 *                        Strng concat(String s) => 문자열 결합
 *                             ------- +
 *             StringBuffer : 보완 (String을 보완)
 *                => 문자열 결합 (최적화) => append()
 *             Wrapper : 기본타입의 데이터를 객체로 저장로 저장
 *                       ------ 쉽게 사용할 수 있게 만들기 위해 기능 첨부한 클래스화
 *                       ------------------------
 *                       정수형 => 317page
 *                         **byte      => Byte
 *                         short     => Short
 *                         **int       => Integer
 *                         **long      => Long
 *                       실수형
 *                         float     => Float
 *                         **double    => Double
 *                       논리형
 *                         **boolean   => Boolean
 *                       문자형
 *                         char      => Character
 *                       -------------------------
 *                       웹
 *                       주소 => 유일하게 서버와 연결
 *                       => 사용자가 값을 서버로 전송
 *                          URL주소?page=10
 *                                -------- String page = "10"
 *                                               -------------
 *                                                int로 변경 후에 사용
 *                                              int a = Integer.parseInt(page);
 *                                              NUMBER , VARCHAR , DATE ...
 *                                              
 *                      => 박싱 / 언박싱
 *                      Integer i = 10;//박싱
 *                      int j = i; // 언박싱
 *                      -------------------- 호환이 된다.
 *             System
 *               println() : 화면 출력  ****웹
 *               --------------------
 *               gc() : 메모리 회수 요청
 *               exit() : 프로그램 종료
 *               -------------------- Application
 *             Math
 *               random() : 임의의 난수 발생 => double 0.0~0.99 사이의 숫자
 *               ceil() : 올림함수 => double  ceil(double d)
 *               ----- 게시판
 *               ===> Math는 모든 메소드가 static으로 되어 있다.
 *               Math.ceil()...
 *             Thread : 한 개의 프로그램안에서 여러개의 프로그램을 동시에 실행
 *             ------ 게임 (시분할)
 *              | 서버는 여러명이 접속시에 따로 동작할 수 있게 만들어줌
 * */
import java.util.*;
import java.io.*;
public class MainClass {
	public static void main(String[] args) {
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s = new String("Hello");//새로운 메모리 공간에 Hello 저장
//		//주소가 같은 지 확인 ==> ==
//		System.out.println(s1==s2);
//		System.out.println(s1==s);
//		
//		// 실제 저장된 데이터가 같은 지 ==> equals
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s));
//		
//		// 대소문자 구분없이 비교
//		
//		System.out.println(s1.equalsIgnoreCase(s));
		
		// 대소문자 구분 비교 equals : 로그인
//		String data = "홍길동|김나박이|이순신|강감찬|을지문덕";
//		String[] names = data.split("\\|");
//		for(String name:names) {
//			System.out.println(name);
//		}
		// => 다중 검색 => N(Name) S(Subject) C(Content)
//		String data = "NSC";
//		String[] ss = data.split("");
//		for(String s : ss) {
//			System.out.println(s);
//		}
//		System.out.println(data.substring(1, data.indexOf('C')));
//		String[] data= {"a.png","a.jpg","c.gif","d.java","e.java","f.zip"};
//		for(String s : data) {
////			if(s.contains("java")) {
////				System.out.println(s);
////			}
//			String ss = s.substring(s.lastIndexOf(".")+1);
//			if(ss.equals("png")||ss.equals("jpg")||ss.equals("gif")) {
//				System.out.println(s);
//			}
//		}
//		try {
//			//컴파일러에 알려만 준다 => 통과 요청 => CheckException
//			//에러시 복구가 어렵다 , 예외회피, 선언 => throws
//			//=> 솟 코딩을 자유롭게 한다.
//			// 에러발생 시 => 복구 ==> try~catch
//			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
//			StringBuffer sb = new StringBuffer();
//			int a= 0;
//			while((a=fr.read())!=-1) {
//				sb.append((char)a);
//			}
//			fr.close();
//			System.out.println(sb.toString());
//			
//		}catch(Exception e) {}
//		Character s = 'a';
//		char d = s;
//		System.out.println(d);
		try {
			List<String> list = new ArrayList();
			list.add("Hello");
			list.add("Java");
			for(String s : list) {
				System.out.println(s);
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
