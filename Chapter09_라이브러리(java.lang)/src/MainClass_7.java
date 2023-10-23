/*
 *   Math : 수학 관련
 *     => Math.random() ==> java.util.Random()
 *                          -------------------
 *                          Random r = new Random();
 *                          r.nextInt(100) => 0~99 사이의 값 출력
 *                |Math => final 클래스 => 변경이 불가
 *                         있는 그대로 사용      
 *                         모든 메소드가 static이다.
 *                         => Math는 객체 생성을 하지 않는다.
 *     => Math.ceil() : 웹에서 가장 많이 이용
 *                     -----------------
 *                       | 페이징 => 무한 스크롤 =>
 *                         ----- 총페이지 구현
 *        => 올림 메소드
 *           172/10.0 = 17.2 ==> 18
 *           =>배열 => 컬렉션
 *        => Math return형은 대부분 double
 *   System
 *   ------
 *      System.out.println() => 웹 => 확인
 *           정상적으로 사용자가 데이터 전송
 *           순서 => 동작
 *           에러 => 처리
 *      System.gc() : 메모리 해제 요청 , 웹서버(톰캣)
 *      System.exit() : 프로그램 종료 => 윈도우
 *  -------
 *   *** Stirng / StringBuffer / Wrapper(Integer,Long,Double,Byte...)
 *   데이터형 => 문자열로 변경
 *   문자열 ==> 다른 데이터형으로 변경
 *   -----
 *   => 2진법, 8진법 , 16진법 
 *      ----------------- 10진법 ==> Wrapper
 *           
 * */
import java.util.*;

public class MainClass_7 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("총 갯수 :");
//		int total = sc.nextInt();
//		
//		// ==>10개씩 나눠서 출력 ==> 총페이지
//		// 이전  1/10  다음
//		int page = (int)Math.ceil(total/10.0);
//		//SELECT CEIL(COUNT(*)/10.0) FROM recipe;
//		System.out.println(page);
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
	}

}
