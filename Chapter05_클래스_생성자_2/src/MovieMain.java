import java.util.*;
import java.io.*;
//사용자 정의 데이터형

class Movie{
	int rank;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}
class MovieSystem{
	static Movie[] mv = new Movie[1938];
	//1. 초기화
	MovieSystem() {
		try {
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int number = 0;//char => fr.read() => 한글자 정수
			StringBuffer data = new StringBuffer();//버퍼에 쌓는다.
			while((number=fr.read())!=-1) {
				data.append((char)number);//append로 포함
			}
			fr.close();
			String[] s = data.toString().split("\n");
			for(int i = 0; i<s.length;i++) {
				String[] ss = s[i].split("\\|");
				mv[i] = new Movie();
				try {
					mv[i].rank = Integer.parseInt(ss[0]);
				}
				catch(Exception ex) {}
				mv[i].title = ss[1];
				mv[i].genre = ss[2];
				mv[i].poster = ss[3];
				mv[i].actor = ss[4];
				mv[i].regdate = ss[5];
				mv[i].grade = ss[6];
				mv[i].director = ss[7];
			}
		}catch(Exception ex) {}
	
		
	}
	//2. 목록 출력
	void list() {
		for(Movie m :mv) {
			System.out.println(m.rank+"."+m.title);
		}
	}
	//3. 상세보기
	void detail(int mno) {
		// 배열 => 인덱스 => 구분자는 필요없다. => rank
		Movie m = mv[mno-1];
		System.out.println("============ 영화 상세 내용 ============");
		System.out.println("영화명 :"+m.title);
		System.out.println("감독 :"+m.director);
		System.out.println("출연 :"+m.actor);
		System.out.println("장르 :"+m.genre);
		System.out.println("등급 :"+m.grade);
		System.out.println("개봉일 :"+m.regdate);
		System.out.println("순위 :"+m.rank);
		System.out.println("====================================");
	}
	//4. 영화명 찾기
	void movieNameFind(String title) {
		System.out.println("======= 검색 결과 =======");
		for(Movie m:mv) {
			if(m.title.contains(title)) {
				System.out.println("영화명 :"+m.title);
			}
		}
		System.out.println("======================");
	}
	//5. 출연으로 찾기
	void movieActorFind(String actor) {
		System.out.println("======= 검색 결과 =======");
		for(Movie m:mv) {
			if(m.actor.contains(actor)) {
				System.out.println(m.title+"("+m.actor+")");
			}
		}
		System.out.println("======================");
	}
	//6. 장르로 찾기
	void movieGenreFind(String genre) {
		System.out.println("======= 검색 결과 =======");
		for(Movie m:mv) {
			if(m.genre.contains(genre)) {
				System.out.println(m.title+"("+m.genre+")");
			}
		}
		System.out.println("======================");
	}
}
public class MovieMain {
	public static void process() {
		Scanner sc = new Scanner(System.in);
		MovieSystem mv = new MovieSystem();
		System.out.println("====================");
		mv.list();
//		System.out.print("상세볼 영화 선택(1~1938) :");
//		int mno = sc.nextInt();
//		mv.detail(mno);
		System.out.print("검색어 입력 :");
//		String title = sc.next();
//		mv.movieNameFind(title);
//		String actor = sc.next();
//		mv.movieActorFind(actor);
		String genre = sc.next();
		mv.movieGenreFind(genre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
