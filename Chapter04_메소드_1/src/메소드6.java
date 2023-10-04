//알파벳을 입력받아서 대문자 소문자 판단
// 1개 , 2개
import java.util.Scanner;
public class 메소드6 {
	public static char user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		return sc.next().charAt(0);
		//자바 단점 => char를 입력받아서 처리하는 기능이 없다.
		// => String으로 받아서 변환
	}
	public static void result(char alpha) {
		//결과 값 자체 처리 => void
		if(alpha>='a'&&alpha<='z') {
			System.out.println("소문자 입니다.");
		}
		else if(alpha>='A'&&alpha<='Z'){
			System.out.println("대문자 입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public static void process() {
		result(user_input());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
