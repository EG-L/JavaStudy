/*
 * 1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
 * 
 *    if(양수 조건){
 *    }
 *    else{
 *    }
 *    
 *    => if(조건문) ==> a>=0
 *    	{
 *    		조건 true일 때 수행
 *    	}
 *    	else
 *    	{	
 *    		조건 false일 때 수행
 *    	}
 * */
// 웹 => 아이디중복, 로그인, 관리자/사용자, 아이디 찾기, 비밀번호 찾기
// 파일업로드
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();//키보드로 입력된 값을 받는다.
		/*
		 *   정수 : nextInt()
		 *   실수 : nextDouble()
		 *   논리 : nextBoolean()
		 *   문자열 : next()
		 *   *** 단점은 char는 읽지 못한다.
		 *            ---- 문자열로 읽어서 잘라내야 된다. => next().charAt(0)
		 *                                                        --- 문자 위치
		 * */
		//결과값 출력
		if(num>=0) System.out.println(num+"은(는) 양수입니다.");
		else System.out.println(num+"은(는) 음수입니다.");
	}

}
