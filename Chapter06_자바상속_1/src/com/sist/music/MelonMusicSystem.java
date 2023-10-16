package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//상속 제외 => 초기화 블록, static, 생성자, private
public class MelonMusicSystem extends GenieMusicSystem{
	
	{
		GenieMusicSystem.title = "멜론 뮤직 탑 50";
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 노래 제목, 가수명, 앨범
			Elements title = doc.select("tr.lst50 div.wrap div.wrap_song_info div.rank01");
			
			Elements artist = doc.select("tr.lst50 div.wrap div.wrap_song_info div.rank02 span.checkEllipsis");
			//td.info
			Elements album = doc.select("tr.lst50 div.wrap div.wrap_song_info div.rank03");
			
			for(int i = 0; i<musics.length;i++) {
				musics[i] = new Music();
				musics[i].setMno(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setArtist(artist.get(i).text());
				musics[i].setAlbum(album.get(i).text());
			}
		}
		catch(Exception ex) {}
	}

}
