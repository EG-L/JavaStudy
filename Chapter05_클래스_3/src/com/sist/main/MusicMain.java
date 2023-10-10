package com.sist.main;
import java.io.*;//입출력(파일)
import java.util.*;//Scanner
//일반 데이터형
class Music{
	int rank;
	String title;
	String artist;
	String album;
	String key;
}
// 데이터형을 모아서 관리
class MusicData{
	//사용자 정의 데이터형 = 기본형처럼 사용이 가능
	// String[]
	Music[] music = new Music[49];
	// 초기화
	{
		try//예외처리 => 예러를 미리 방지 => check, uncheck
		{//1. 초기화 블록 2. 생성자 초기화블록 => 자동 생성
			FileReader fr = new FileReader("C:\\javaDev\\genie.txt");
			String data = "";
			int i = 0;//1글자 => 정수형 => char
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close();
//			System.out.println(data);
			String[] datas = data.split("\n");
			i = 0;
			for(String s:datas) {
				String[] ss = s.split("\\|");
				music[i] = new Music();
				try {
					music[i].rank = Integer.parseInt(ss[0]);
				}
				catch(Exception ex) {}
				if(ss[0].equals("47")) continue;
				music[i].title = ss[1];
				music[i].artist = ss[2];
				music[i].album = ss[3];
				music[i].key = ss[4];
				i++;
			}
		}
		catch(Exception ex) {}
	}
}
// 제어
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicData md = new MusicData();
		System.out.println("==================뮤직 탑 50 위=====================");
		for(int i = 0; i<md.music.length;i++) {
			System.out.println("순위 :"+md.music[i].rank);
			System.out.println("곡명 :"+md.music[i].title);
			System.out.println("가수명 :"+md.music[i].artist);
			System.out.println("앨범 :"+md.music[i].album);
			System.out.println("동영상 키 :"+md.music[i].key);
			System.out.println("=======================================");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("동영상 선택 :(1~50=>47번 제외):");
		int mno = sc.nextInt();
		Music mm = md.music[mno-1];
		System.out.println("======== 상세보기 ========");
		System.out.println("순위 :"+mm.rank);
		System.out.println("곡명 :"+mm.title);
		System.out.println("가수명 :"+mm.artist);
		System.out.println("앨범 :"+mm.album);
		
		System.out.println("동영상을 실행할까요?(y|n) :");
		char c = sc.next().charAt(0);
		if(c=='y' || c=='Y') {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+"http://youtube.com/embed/"+mm.key);
			}
			catch(Exception ex) {}
		}
		else {
			System.out.println("프로그램 종료");
		}
		
	}

}
