/*
 *  년도를 입력받아 윤년여부 확인
 *  1. 입력 => 초기화 => 회원가입에 필요한 데이터 입력
 *                   로그인 (ID, PWD)
 *  2. 윤년확인 => 오라클 연결해서 데이터 추가
 *               => 로그인 여부 확인
 *  3. 결과값 출력 => 로그인 이동
 *                => 로그인 : 메인이동
 *                => 로그인(X) : 다시 입력 요청
 *         브라우저 ==> 자바 ==> 오라클
 *         ----------------------- 라이브러리
 * */
import java.util.Scanner;
public class 메소드3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		// 입력하는 메소드
		
		// 처리되는 과정
		boolean bCheck = false;
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			bCheck = true;
		}
		// 처리결과 출력
		if(bCheck) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}

	}

}
