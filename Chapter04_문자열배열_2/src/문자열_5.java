import java.io.*;
import java.util.*;
/*
 *   라이브러리
 *   -------
 *     java.lang : Object, String, StringBuffer , Math , Wrapper
 *     java.util : List, Set , Map
 *     java.io   :
 *     java.net  :
 *     java.test :
 *     ---------------------------------------------------------
 * */
public class 문자열_5 {
	static String movie;
	static {
		try {
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i = 0;
			StringBuffer data = new StringBuffer();
			while((i=fr.read())!=-1) {
				data.append((char)i);
			}
			movie=data.toString();
			
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//파일 읽기
//		System.out.println(movie);
		String[] movieData = movie.split("\n");
		System.out.println(movieData[0]);
//		System.out.println(movieData.length);
		System.out.println("============== 영화 제목 ==============");
		//검색
		// 송강호가 출연한 영화를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("등급 입력 : ");
		int grade = sc.nextInt();
		//1990에 개봉한 영화 출력
		//12세 이상 영화
		for(String movie:movieData) {
			String[] detail = movie.split("\\|");
			if(detail[6].contains(String.valueOf(grade))){
				System.out.println("순위 : "+detail[0]);
				System.out.println("영화명 : "+detail[1]);
				System.out.println("장르 : "+detail[2]);
				System.out.println("출연자 : "+detail[4]);
				System.out.println("개봉일 : "+detail[5]);
				System.out.println("등급 : "+detail[6]);
				System.out.println("감독 : "+detail[7]);
				
				System.out.println("========================================");
			}
		}

	}

}
