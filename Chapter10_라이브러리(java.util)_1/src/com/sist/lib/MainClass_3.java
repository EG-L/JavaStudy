package com.sist.lib;
/*
 *   Random => 임의의 수를 추출할 때 사용
 *            ---------자바 JVM에서
 *            => Math.random() => double
 *   => nextInt(int bound)
 *             -----------
 *                100 ==> 0~99 + 1
 * */

import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개 출력
		Random r = new Random();
//		for(int i = 0; i<10;i++) {
//			char c = (char)(r.nextInt(26)+65);
//			System.out.println(c);
//		}
//		for(int i = 0; i<6;i++) {
//			int lotto = r.nextInt(45)+1;//1~45
//			System.out.println(lotto);
//		}
		int day = r.nextInt(7)+7;
		Set s = new HashSet();
		for(int i =0;i<day;i++) {
			int rr = r.nextInt(31)+1;
			System.out.print(rr+" ");
			s.add(rr);
			
		}
		System.out.println("\n"+s);
		

	}

}
