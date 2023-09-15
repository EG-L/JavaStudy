// 알파벳을 받아서 대문자 , 소문자, 숫자,다른 문자
import java.util.Scanner;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 알파벳 받기
		// 대문자
		// 소문자
		// 숫자
		// 기타
		char c;
		System.out.print("알파벳 입력 : ");
		
		c = sc.next().charAt(0);
		
		if(c>='a'&&c<='z') {
			System.out.println(c+"는(은) 소문자 입니다.");
		}
		if(c>='A'&&c<='Z') {
			System.out.println(c+"는(은) 대문자 입니다.");
		}
		if(c>='0'&&c<='9') {
			System.out.println(c+"는(은) 숫자 입니다.");
		}
		if(!(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9')) {
			System.out.println(c+"는(은) 다른 문자 입니다.");
		}
	}

}
