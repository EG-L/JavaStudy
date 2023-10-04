// 시저스 암호화 => AES
/*
 * 
 * */
import java.util.Scanner;
public class 메소드_3 {
	// 매개변수 전송법
	// 입력 값 => 리턴형 존재 , 매개변수 불필요
	public static String user_input() {

		return 메소드_2.user_input();
		
	}
	// 암호화 => 리턴형 존재 => String  , 매개변수 존재
	public static String encode(String msg) {
		String result = "";
		for(int i =0; i<msg.length();i++) {
			char c = msg.charAt(i);
			result+=(char)(c+3);
		}
		return result;
	}
	// 복호화 => 리턴형 없을 수 있고 있을 수 있음 => void, String , 매개변수 존재
	public static void decode(String msg) {
		for(int i=0;i<msg.length();i++) {
			char c = msg.charAt(i);
			System.out.print((char)(c-3));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = encode(user_input());
		System.out.println(s);
		decode(s);
		

	}

}
