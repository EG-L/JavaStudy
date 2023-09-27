/*
 *   문자열
 *   -----
 *     length() => 문자이 갯수
 *     substring() => 문자 자르기
 *     intdexOf() , lastIndexOf() => 문자열 인덱스 찾기
 *     contains() => 포함
 *     startsWith()
 *     valueOf() => 문자열 전환
 *     replace() =>
 *     split() =>
 *     -------------------------------------------
 * */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URLEncoder;
public class 문자열_1{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		
		Elements title = doc.select("table.list-wrap a.title");
//		System.out.println(title);
		
		Elements singer = doc.select("table.list-wrap a.artist");
//		System.out.println(singer);
		
		Elements album = doc.select("table.list-wrap a.albumtitle");
//		System.out.println(album);
		System.out.println("================================");
		
		for(int i =0;i<title.size();i++) {
			System.out.println("순위 :" +(i+1));
			System.out.println("곡명 : "+title.get(i).text());
			System.out.println("가수명 : "+singer.get(i).text());
			System.out.println("앨범 : "+album.get(i).text());
			System.out.println("================================");
			String msg = (i+1)+"|"+title.get(i).text()+"|"+singer.get(i).text()+"|"+album.get(i).text()+"|"+youtubeData(title.get(i).text());
			System.out.println(msg);
		}
	}
	static String youtubeData(String title) {
		String keys = "";
		try {
			String url = "https://www.youtube.com/results?search_query="+URLEncoder.encode(title,"UTF-8");
			Document doc = Jsoup.connect(url).get();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m = p.matcher(doc.toString());
			while(m.find()) {
				String s = m.group();
				keys=s.substring(s.indexOf("=")+1,s.indexOf("\""));
				break;
			}
		}
		catch(Exception e) {}
		return keys;
	}

}
