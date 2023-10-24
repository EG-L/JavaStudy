package com.sist.lib;
/*
 *   StringTokenizer
 * */
import java.io.FileReader;
import java.util.*;
public class MainClass_5 {
	public static void main(String[] args) {
		String data = "red|blue|green|black|white|yellow|pink|cyan|magenta";
		//
		StringTokenizer st = new StringTokenizer(data,"|");
		int k = st.countTokens();
		for(int i = 0; i<k;i++) {
			System.out.println(st.nextToken());
		}
		System.out.println("=======================");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
//		String color = st.nextToken();
//		String color2 = st.nextToken();
//		String color3 = st.nextToken();
//		System.out.println(st.countTokens());
		//st.nextToken 개수를 벗어나면 오류를 발생 
		/*
		 *   hasMoreTokens
		 *   1)cursor
		 *   ----------------
		 *     -> before First
		 *   ----------------
		 *    red => st.nextToken() ==> true
		 *   ----------------
		 *    blue => st.nextToken() ==> true
		 *   ----------------
		 *    green => st.nextToken() ==> true
		 *   ----------------
		 *    -> after Last ==> st.nextToken ==> false => 종료
		 *   ----------------
		 * */
	}
}
