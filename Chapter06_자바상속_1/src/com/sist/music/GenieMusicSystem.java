package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;
import java.sql.*;
/*
 * GenieMusicSystem
 *        |
 * MelonMusicSystem
 * 
 * => 접근지정어
 *   ---------
 *   default => 패키지가 동일한 경우 접근 가능
 *   private => Getter / Setter => 접근 가능
 *   protected => 패키지가 동일 / 상속을 받은 경우 다른 패키지에서 접근 가능
 *   public => 공개
 *   기본 => 모든 데이터는 은닉화
 * */
public class GenieMusicSystem {
	
	protected Music[] musics = new Music[50];
	protected String title = "지니뮤직 Top 50";
	//=> 생성자 , 초기화 블록
	{//외부 데이터를 읽어 온다 => 값을 초기화
	 // --------- 크롤링, 파일, 오라클 ... => 구현
	/*
	 *    초기화 블록
	 *    => 인스턴스 블록 {} => 인스턴스 변수 , 스태틱 변수 사용 가능
	 *    => 정적 블록(static) static{} => 스태틱 변수만 사용 가능
	 *    => --------------------------- 자동 인식( 호출 X ) => 자동으로 메모리 할당
	 *    => 상속의 예외 조건
	 *    try ~ catch => 프로그램의 비정상 종료 방지
	 *                => 에러를 사전에 방지
	 *    try{
	 *       // 정상적으로 수행하는 문장
	 *       // 지금까지 코딩했던 모든 문장
	 *    }
	 *    catch(Exception ex){에러 처리}
	 *    => 에러를 무시하고 다음 문장을 수행한다.
	 *    network , 파일 , 오라클 연동 ==> 예외처리를 반드시 한다.
	 *    =>  수정이 가능한 에러만 가능
	 *        메모리 부족 (X)
	 *        
	 *        에러 / 예외처리
	 *        10/0
	 * */
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//HTML을 저장하는 공간 , HTML을 읽어서 데이터 추출
			//데이터 저장 => HTML , JSON, XML => 데이터 추출 방법이 다르다.
			/*
			 *    HTML => tag/attribute
			 *            <a class = "aaa"></a> => MarkUp Language
			 *            -- ------------- ----
			 *            tag  attribute   tag
			 *    태그를 읽는 방법
			 *    Element => Tag
			 *    같은 태그 여러 개를 읽는 경우
			 *    Elements
			 *    
			 *    ==> 구분자
			 *        id ==> 태그명#ID명칭 => 중복이 없는 경우
			 *        class => 태그명.클래스명 => 중복이 많은 경우
			 *    <table id="aaa"> => table#aaa
			 *    <table class ="bbb"> => table.bbb
			 * */
			Elements title = doc.select("");
			
			Elements artist = doc.select("");
			
			Elements album = doc.select("");
			
		}
		catch(Exception ex) {}
	}

}
