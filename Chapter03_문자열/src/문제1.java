import java.util.Scanner;
/*
 *  =>조건문
 *    단일 조건문 / 선택조건문 / 다중조건문 => 형식 , 순서
 *    ----------------------------
 *    연산자 => 어떤 연산자 => 결과값?
 *    ------- 비교연산자 , 논리연산자 , 부정연산자
 *    단일조건문
 *    -------
 *      if(조건문) => 오류(예외처리) => 사전에 오류방지
 *      {
 *        조건이 true일 때만 수행
 *      }
 *      => 수행 => 건너뛴다
 *      
 *    선택조건문 => 삼항연산자
 *    -------
 *      if(조건문)
 *      {
 *          //사용자
 *      }
 *      else
 *      {
 *          //관리자
 *      }
 *      
 *      다중조건문 => 조건에 맞는 문장만 수행 ==> switch~case
 *      -------
 *      if(조건문)
 *      {
 *        조건이 true일 때 => 수행 => 종료
 *        false일 때 밑의 조건문을 찾는다.
 *      }
 *      else if(조건문)
 *      {
 *        조건이 true일 때 => 수행 => 종료
 *        false일 때 밑의 조건문을 찾는다.
 *      }
 *      else
 *      {
 *        해당 조건에 맞는 경우 처리
 *      }
 *      =======================
 *      선택문
 *      switch(정수,문자,문자열){ => 실수 미포함
 *          case 값:
 *             처리 문장
 *             break;
 *          default: ==> 생략가능
 *             처리 문장
 *      }
 *    
 * */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// enter, space 
		int num = 0;
		while(true) {
			System.out.print("정수입력(10~99) : ");
			num = sc.nextInt();
			if(num<10||num>99) continue;
			break;
		}
		if((num%10)==(num/10)) System.out.println("10의 자리와 1의 자리가 같습니다.");
		else System.out.println("10의 자리와 1의 자리가 다릅니다.");

	}

}
