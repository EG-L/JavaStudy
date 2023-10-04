/*
 *    리턴형 (처리 결과 값 => 반드시 한개만 사용이 가능) => 여러개 일때 배열 이용
 *         ---------------------------------
 *    1) 로그인 요청
 *      ----------
 *      boolean => 경우의 수 2개
 *      경우의 수가 3개 인 경우
 *      ------------------ id, pwd, log-in 된 상태 => String , int
 *    2) 기본형 => int, long, double
 *    3) 영화 정보 요청 : class
 *    4) 정렬 => 10 40 50 20 30 => 배열
 *    --------------------------------------
 *      경우의 수..
 *    
 *    예) 정수 => 사칙연산
 *        + int plus(int , int)
 *        - int minus(int, int)
 *        * int gop(int, int)
 *        / (String) div(int, int)
 *    
 * */

//1. 기능별로 나눠서 처리(한가지 기능만 수행)
/*
 *    예)
 *         사람 <=================> 자판기
 *         --- 행위자(액터)=> 유스케이스 다이어그램
 * */
//2. 반복이 있는 경우
//3. 다른 클래스와 연결(*******)
// 사칙연산 프로그램
import java.util.Scanner;
//1. 정수 한개 입력을 받아 구구단 출력
public class 메소드4 {
	public static void gugudan(int a) {
		for(int i =1;i<10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//절차적 언어 => 재사용을 할 수 없다.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하시오 : ");
		// print() => 사용자가 요청한 메시지 출력
		gugudan(sc.nextInt());
		// nextInt() => 키보드로 정수 입력시 읽어서 메모리 저장
		
	}

}
