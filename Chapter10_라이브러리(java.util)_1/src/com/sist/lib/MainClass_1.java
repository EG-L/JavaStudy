package com.sist.lib;

/*
 *    1. java.util
 *       => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *       => 반드시 import를 사용한다.
 *       1) 날짜
 *          Date/Calendar ==> Date에 없는 기능 확장 Calendar
 *              ---------- 예약
 *       2) 문자열 분해
 *          StringTokenizer
 *       3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *          ------ 컬렉션(*****)
 *                ------ 가변형 (크기 결정 X)
 *          표준화 (모든 개발자가 동일하게 사용)
 *          => CRUD => 읽기 / 쓰기 / 수정 / 삭제
 *             Collection => interface
 *                |
 *      ----------------------------------
 *      interface Collection{
 *           List => 데이터의 중복 허용  순서 O ( index 이용 )  => 데이터베이스 사용 시에 주로 사용(***) 
 *           Set => 데이터의 중복 허용 X, 순서 X 
 *           Map => Key,Value값 존재 , 순서 X, 데이터의 중복 허용 => 클래스 관리(스프링, 웹)
 *      }
 *      
 *      List
 *      ----
 *        | List를 구현한 클래스
 *      ---------------------------Stack
 *      |              |        |
 *     ArrayList     Vector   LinkedList
 *     ***                      |
 *                             Queue
 *      ArrayList : 오라클(데이터베이스) 내의 데이터 저장 시 주로 사용
 *                  --------------------------------------
 *                            | 브라우저
 *                   => 데이터베이스 관련 => 비동기 방식(async)
 *      Vector     : 동기방식 (sync) => 네트워크 사용자 정보 저장=>IP, PORT
 *          ***Vector의 단점 보완 ArrayList
 *      LinkedList : C호환 => 수정 , 삭제 , 추가 용이
 *      *** 메소드 동일   
 *      Set
 *      ----
 *        | Set을 구현한 클래스
 *      -----------------------
 *      |                     |
 *   HashSet              TreeSet
 *   ***
 *      Map
 *      ---
 *        |Map을 구현한 클래스
 *      ------------------------
 *      |                      |
 *   HashMap                 HashTable
 *   ***
 *   
 *   Random : 임의의 난수 발생
 *   
 * */
import java.util.*;
public class MainClass_1{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("심청스");
		list.add("김나박이");
		
		for(String name:list) {
			System.out.println(name);
		}
	}
}
