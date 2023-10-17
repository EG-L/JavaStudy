package com.sist.main;
//=> 패키지 ( 관련된 클래스를 모아서 관리 )
//다른 패키지인 경우 => import 이용하여 클래스 불러오기
/*
 *     import 패키지명.클래스명;
 *     import 패키지명.*;
 *     import static 패키지명.클래스명.메소드명
 *     import static 패키지명.클래스명.*
 *     
 *     => 사용자 정의 패키지도 import를 이용
 * */
import static java.lang.Math.random;
//Math(static) , String(valueof),
//static 메소드인 경우에만 가능
import static java.lang.System.out;
import static java.lang.String.valueOf;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(random()*100)+1;
		out.println(a);

	}

}
