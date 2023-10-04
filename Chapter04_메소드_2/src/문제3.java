//년도를 입력받아 윤년여부를 확인하는 프로그램 작성
import java.util.Scanner;
public class 문제3 {
	public static int user_input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+" : ");
		return sc.nextInt();
	}
	
	public static String result(int data) {
		if(data % 4 == 0 && data % 100 != 0 || data % 400 == 0) {
			return data+"년도는 윤년입니다.";
		}
		else {
			return data+"년도는 윤년이 아닙니다.";
		}
		
	}
	
	public static void process() {
		int year = user_input("년도");
		
		System.out.println(result(year));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
