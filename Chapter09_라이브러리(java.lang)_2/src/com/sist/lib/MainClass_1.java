package com.sist.lib;
/*
 *    Wrapper : 기본데이터형을 클래스화 
 *      => 기본 데이터형에 기능을 부여해서 쉽게 사용할 수 있게 만듬
 *      int ==> Integer
 *      long ==> Long
 *      double ==> Double
 *      boolean ==> Boolean
 *      ------------------- 웹에서 주로 사용
 *      
 *      => 웹/윈도우 => 모든 데이터값 문자열
 *                   ----------------
 *                   문자열을 정수, 실수, 논리형
 *      => Double.parseDoble("4.5") => 4.5
 *      => Integer.parseInt("10") => 10
 *      => Boolean.parseBoolean("true") => true
 *                ---------------------
 *                 HTML => checkbox
 *      => 제네릭 사용 시 => 데이터형을 통일
 *         ---- 메소드 => 리턴형 , 매개변수
 *                      ------------- Object
 *         <Integer> => 클래스 <int> (X) <Integer> (O)
 *         ---------
 *         배열 => 저장 (클래스) => Object
 *         
 *         class Box<T> ==> T(Object)
 *         {
 *             T t = new T();
 *             void setT(T t){
 *             }
 *             T getT()
 *             {
 *                return T;
 *             }
 *         }
 *         
 *         Box<String>
 *         --------------------------------
 *         *** 박싱 / 언박싱
 *         Integer i = 10; // 박싱
 *         int a = i; // 언박싱
 * */

import java.util.*;
public class MainClass_1 {
	void aaa(Integer i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		for(int i = 0; i<list.size();i++) {
//			System.out.println(list.toArray()[i]);
//		}
		MainClass_1 a = new MainClass_1();
		a.aaa(15);
		Integer i = 10;
		int j = i;
		System.out.println(i);

	}

}
