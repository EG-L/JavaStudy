/*
 *    연산자
 *    ---- 메소드(기능수행)
 *    증감 연산자 : 반복문에서 주로 사용(++,--)
 *    부정 연산자 : 반대 효과
 *    형변환 연산자 : 클래스 형변환
 *    -------------------------------
 *    산술 연산자 : +(문자열 결합)
 *               %(년도 계산  , 페이지 계산)
 *    비교 연산자 : 반복문 , 조건문
 *    논리 연산자 : 기간 , 범위 ==> &&
 *    대입 연산자 : =, +=
 *    -------------------------------
 *    
 * */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;
public class 연산자정의 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = sc.next();//
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("a.title");
		Elements artist = doc.select("a.artist");
		for(int i=0;i<50;i++) {
//			System.out.println(title.get(i).text());
//			System.out.println(artist.get(i).text());
			if(title.get(i).text().contains(fd)) {
				System.out.printf("%s(%s)\n",title.get(i).text(),artist.get(i).text());
			}
		}

	}

}
