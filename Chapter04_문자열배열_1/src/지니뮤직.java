/*
 *  1. equals : (==) => boolean
 *                     --------- if문에서 사용
 *                      equals() => 같으면
 *                      !equals() => 같지 않으면
 *  
 *  2. contains : 포함된 단어 찾기 => boolean
 *  3. startsWith : 시작 문자열이 같을 때 => boolean
 *  4. endsWith : 마지막 문자열이 같을 때 => boolean
 *  ------------------------------------------- 검색
 * */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 지니뮤직 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String url = "";
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. Top50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트로트");
			System.out.println("6. JAZZ");
			System.out.println("7. 클래식");
			System.out.println("8. CONTAINS");
			System.out.println("9. STARTSWITH");
			System.out.println("10. ENDSWITH");
			System.out.println("11. 종료");
			System.out.println("===============");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			if(menu==11) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				url="https://www.genie.co.kr/chart/top200";
			}
			else if(menu==2) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0100";
			}
			else if(menu==3) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0200";
			}
			else if(menu==4) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0300";
			}
			else if(menu==5) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0107";
			}
			else if(menu==6) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0500";
			}
			else if(menu==7) {
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0600";
			}
			System.out.print("검색어 입력 : ");
			String msg = sc.next();
			
			Document doc = Jsoup.connect(url).get(); // doc <<= html 저장
			Elements title = doc.select("table.list-wrap a.title");//Elements >> tag
			for(int i =0;i<title.size();i++) {
				String name = title.get(i).text();
//				if(name.contains(msg)) {
//				if(name.startsWith(msg)) {
//				if(name.endsWith(msg)) {
				if(name.equalsIgnoreCase(msg)) {//equalsIgnoreCase 대소문자 구분 없이
					System.out.println((i+1)+"."+name);
					Thread.sleep(500);
				}
			}
			
			
		}

	}

}
