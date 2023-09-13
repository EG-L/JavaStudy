/*
 *      산술연산자
 *      + , - , * , / , %
 *     ---         --- ---
 *      +
 *       => 덧셈 , 문자열 결합
 *                "" => 문자열  ( "7"+7 => 77 )
 *                => 웹, 윈도우 ( 네트워크 ) => 데이터형이 없다 (문자열)
 *      /
 *       => 나눗셈 , 0으로 나눌 수 없다 , 정수/정수 = 정수
 *      %
 *       => 나머지 : 부호(왼쪽부호)
 *         
 *          -5%2 => -1
 *          --
 *          -1-4/2
 *          /////////////////////////
 *          
 *          -5*-2 => 10
 *          
 *      형변환 : 자동 형변환(Upcasting) , 강제 형변환(DownCasting)
 *             -------- 연산처리 => 연산 같은 데이터형만 가능
 *             int + double
 *             ---
 *             double
 *             
 *             int + (int)double
 *      
 * */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6,b=2;
		System.out.println("덧셈 연산 결과 : "+(a+b));
		System.out.println("뺄셈 연산 결과 : "+(a-b));
		System.out.println("곱셈 연산 결과 : "+(a*b));
		System.out.println("나눗셈 연산 결과 : "+(a/b));
		System.out.println("나머지 연산 결과 : "+(a%b));

	}

}
