package com.sist.music;

import com.sist.music.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager mm = new MusicManager();
		Music[] music = mm.musicAllData();
		for(Music m:music) {
			System.out.println(m.getRank()+"."+m.getTitle());
		}

	}

}
