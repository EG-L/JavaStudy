package com.sist.music;
import java.util.Scanner;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("선택(Genie(1), 멜론(2)) :");
		int select = sc.nextInt();
		// 상위 클래스로 => 하위 클래스를 제어
		GenieMusicSystem gms = null;
		if(select==1) {
			gms = new GenieMusicSystem();
		}
		else {
			gms = new MelonMusicSystem();
		}
		//1. 전체 목록 가져오기
		System.out.println(gms.title);
		Music[] m = gms.musicAllData();
		for(Music mm:m) {
			System.out.println(mm.getMno()+"."+mm.getTitle());
		}
		//2. 검색
		System.out.println("================================");
		System.out.println("가수명 입력 :");
		String artist = sc.next();
		Music[] findData = gms.musicartistFindData(artist);
		for(Music mm:findData) {
			System.out.println(mm.getTitle()+"("+mm.getArtist()+")");
		}

	}

}
