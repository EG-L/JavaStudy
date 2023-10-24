package com.sist.lib;
import java.text.*;
import java.util.*;
//날짜 변환
public class MainClass_2 {
	public static void main(String[] args) {
		//현재 시스템의 시간을 읽어 온다.
		//Date
		Date date = new Date();
		System.out.println(date); //데이터베이스 호환 (오라클)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		/*
		 *  년도 : y => yyy => yy => yyyy
		 *  월 : M => MM(01)
		 *      1~12
		 *  일 : d => dd
		 *  시간 : h => hh
		 *  분 : m => mm
		 *  초 : s => ss
		 * */
		System.out.println(sdf.format(date));
	}
}
