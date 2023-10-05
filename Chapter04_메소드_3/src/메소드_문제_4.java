//=> 알파벳 입력을 받아 대문자 소문자 숫자 기타 구분
import java.util.Scanner;
public class 메소드_문제_4 {
	public static char user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 :");
		char num = sc.next().charAt(0);
		return num;
	}
	public static String check(char c) {
		String res = "";
		if(c>='A'&&c<='Z') res = c+"는(은) 대문자입니다.";
		else if(c>='a'&&c<='z') res = c+"는(은) 소문자입니다.";
		else if(c>='0'&&c<='9') res = c+"는(은) 숫자입니다.";
		else res = c+"는(은) 기타입니다.";
		
		return res;
	}
	public static void print(String res) {
		System.out.println(res);
	}
	public static void process() {
		char res = user_input();
		String c = check(res);
		메소드_문제_2.print(c);//재사용
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
