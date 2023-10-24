package com.sist.lib;
import java.util.*;
//332page => date / Calendar java.text , java.net
/*
 *    날짜 관련(시간 포함)
 *    ---------------
 *    Date => 기능 없음 ( 날짜 저장 )
 *                     -------- 오라클 호환성 
 *    Calendar : Date에 없는 기능을 보완
 *               => 요일 , 마지막 날짜
 *               => 달력 (예약)
 *               => 월 , 요일 => 1부터 
 *                 ---- 0 번부터
 *    
 *    => Date : 일반 클래스
 *             Date date = new Date()
 *       Calendar : 추상 클래스
 *             Calendar cal  Calendar.getInstance();
 *             => getInstance() , newInstance()
 *               ------------------------------
 *                 => 싱클턴 
 *    
 * */
import java.util.*;

class A{
	static A a;
	public static A newInstance() {
		if(a==null) {
			a = new A();
		}
		return a;
	}
}
public class MainClass_4 {
	public static void main(String[] args) {
//		A aa = new A();
//		A bb = new A();
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
		
//		A aa = A.newInstance();
//		A bb = A.newInstance();
//		A cc = A.newInstance();
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
//		System.out.println("cc="+cc);
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24) :");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		//날짜 입력 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strWeek = {"","일","월","화","수","목","금","토"};
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"년도"+month+"월"+day+"일은 "+strWeek[week]+"요일 입니다.");
		System.out.println(month+"월의 마지막 날은 "+lastday+"입니다.");
	}
}
