import java.io.*;
import java.util.*;
/*
 * 273|코엑스|이 컨벤션센터는 국제회의와 국제적 리셉션, 업무 세미나와 소규모 회의 같은 대형 이벤트를 제공하는 콘퍼런스홀이 특징이다.|06164 서울 강남구 영동대로 513 (삼성동, 코엑스)
 * */
public class 문자열_6 {
	static String seoulData="";
	static {
		try {
			FileReader fr = new FileReader("C:\\javaDev\\seoul_location.txt");
			int i = 0;
			while((i=fr.read())!=-1) {
				seoulData+=(char)i;
			}
			fr.close();
			
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		System.out.println(seoulData);
		//1. 페이징 기법 => 10페이지 출력
		String[] seoul = seoulData.split("\n");
		Scanner sc = new Scanner(System.in);
		// 27.3 => 28  ceil() => 올림함수
		int currpage = 1, totalpage=(int)(Math.ceil(seoul.length/10.0));
//		System.out.println("총 페이지 : "+totalpage);
		while(true) {
			System.out.print("페이지 선택(1~"+totalpage+") : ");
			currpage=sc.nextInt();
			
			if(currpage<1||currpage>28) {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			final int ROW=20;
			int j = 0;//10개씩 나눠주는 변수
			int pagecnt = (currpage*ROW)-ROW;//for문의 시작 위치
			/*
			 *   1page 0~9
			 *   2page 10~19
			 *   3page 20~29
			 * */
			for(int i = 0;i<seoul.length;i++) {
				String[] ss = seoul[i].split("\\|");
				if(j<ROW&&i>=pagecnt) {
					System.out.printf("%s.%s\n",ss[0],ss[1]);
					j++;
				}
			}
		}
		

	}

}
