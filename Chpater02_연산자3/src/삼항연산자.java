// if~else
// (조건)?값1:값2
//  조건 : true => 값1
/*  조건 : false => 값2
 * */
// java.lang.* => 자동추가 (String , System, Math)
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		//              0.0~0.99 => 0~99+1 => 1~100
		//           -------------------
		//                    1
		/*      ------------------------
		 *                 2
		 *      --------------------------
		 *                    3
		 * */
		
		System.out.println(a%2==0?a+"는(은) 짝수이다":a+"는(은) 홀수이다.");
		
		char c = (char)((Math.random()*26)+65); // A~Z
		char ch = 'a';//변수 선언 및 초기화
		int s = (int)(Math.random()*2);//0~1
		ch = s==0?c:(char)(c+32);//0이면 대문자 1이면 소문자
		// 'A'+32 => 97 'a'
		System.out.println(ch>='A' &&ch<='Z' ? ch+"는(은) 대문자입니다.":ch+"는(은) 소문자입니다.");
	}

}
