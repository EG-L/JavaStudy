/*
 *    1. 문자열을 입력 받아서 대문자 => 소문자 , 소문자 => 대문자로 변환
 *       -------------  ----------------------------------
 *    2. 문자열을 입력을 받아서 반대로 출력
 *      ---------------  ---------
 * */
import java.util.Scanner;
public class 메소드_2 {
	//문자열을 입력받는 기능 : 리턴형 => String , 매개변수 x
	public static String user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 :");
		return sc.nextLine();
		/*
		 * next() => 엔터 시 메모리 저장 => 문자열 인식 (공백)
		 * aaa aaa aaa aaa => aaa만 인식
		 * nextLine() => 엔터 시 메모리 저장(띄어쓰기 가능)
		 * aaa aaa aaa aaa => aaa aaa aaa aaa 인식
		 * */
	}
	//대문자 => 소문자, 소문자 => 대문자로 변경 : 리턴형 / 매개변수(String)
	//                                   결과값을 받아서 출력 || 메소드 안에서 출력(o)
	public static void alpha_convert(String msg) {
		String result = "";
		for(int i =0;i<msg.length();i++) {
			char c = msg.charAt(i);
			if(c>='a'&&c<='z') {//소문자일 경우
				result+=(char)(c-32);
			}
			else if(c>='A'&&c<='Z') {//대문자일 경우
				result+=(char)(c+32);
			}
			else {
				result+=c;
			}
		}
		System.out.println("결과 값 :"+result);
	}
	//반대로 출력
	// => 결과값을 받아서 출력(o) || 메소드 안에서 출력
	public static String alpha_reverse(String msg) {
		String result = "";
		for(int i = msg.length()-1;i>=0;i--) {
			char c = msg.charAt(i);
			result+=c;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = user_input();
		alpha_convert(msg);
		System.out.println("결과 값 :"+alpha_reverse(msg));

	}

}
