package com.sist.music;

import java.io.FileReader;
import java.util.StringTokenizer;

//뮤직을 제어하는 프로그램
public class MusicManager {
	private static Music[] musics = null;
	//접속하는 모든 유저에게 공유 -> 목록 => static
	//초기화 ==> 클래스블록에서는 초기화가 불가
	/*
	 *    1) 인스턴스 블록 : 인스턴스, static
	 *    2) static 블록 : static => 인스턴스를 초기화 (객체 생성)
	 *    3) 생성자 : 인스턴스 , static
	 *    
	 *    예외처리 종류 ( 예외 : java.io,java.net,java.sql)
	 *                              ------------------
	 *                               | 웹(네트워크)
	 *    = 예외복구
	 *     try
	 *     {
	 *        => 정상 수행, 예외가 발생되는 소스
	 *           -------
	 *     }
	 *     catch(예외클래스)
	 *     {
	 *        예외발생시 복구
	 *        => 예외의 위치
	 *           =>getMessage()
	 *           =>printStackTrace()
	 *           =>디버깅 확인 ==> 수정
	 *     }
	 *    = 예외회피 (예외 떠맡기기)
	 *      => 라이브러리에서 많이 사용 => 개발자
	 *      => 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작
	 *         method() throws 예외 ... (순서가 없다)
	 *      => 처리 방법은 throws 이용 , try~catch
	 *    = 임의의 발생
	 *      => throw new 예외처리생성자()
	 *    = 사용자 정의 예외처리
	 *      => class myException extends Exception
	 *         {
	 *         }
	 * */
	public MusicManager(){
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\javaDev\\genie.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			StringTokenizer st = new StringTokenizer(sb.toString(),"\n");
			musics = new Music[st.countTokens()];
			int k = 0;
			while(st.hasMoreTokens()) {
				musics[k] = new Music();
				StringTokenizer st1 = new StringTokenizer(st.nextToken(),"|");
				String rank = st1.nextToken();
				rank = rank.replaceAll("\\uFEFF","");
				musics[k].setRank(Integer.parseInt(rank));
				musics[k].setTitle(st1.nextToken());
				musics[k].setArtist(st1.nextToken());
				musics[k].setAlbum(st1.nextToken());
				musics[k].setKey(st1.nextToken());
				
				k++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			}
			catch(Exception e) {}
		}
	}
	
	public Music[] musicAllData() {
		return musics;
	}
}
