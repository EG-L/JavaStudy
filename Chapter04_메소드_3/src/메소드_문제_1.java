//정수를 한개를 입력 받아서 => 짝수 , 홀수 출력
import java.util.Scanner;
public class 메소드_문제_1 {
	public static int user_input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		return sc.nextInt();
	}
	public static String Check(int num) {
		String Check_num = num%2==0?"짝수":"홀수";
		
		return Check_num;
	}
	public static void print(String Check_num) {
		System.out.println(Check_num);
	}
	
	public static void process() {
		print(Check(user_input()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
