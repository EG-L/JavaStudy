//=> updown게임
import java.util.Scanner;
public class 메소드_문제_6 {
	public static int nansu() {
		return (int)(Math.random()*100)+1;
	}
	public static int user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(1~100) :");
		return sc.nextInt();
	}
	public static void cal(int com) {
		while(true) {
			int user = user_input();
			
			String dt = check(com,user);
			System.out.println(dt);
			if(dt.equals("게임 오버")) {
				break;
			}
		}
	}
	public static String check(int com, int user) {
		if(com>user) return "입력된 값보다 큰 수를 입력하세요.";
		else if(com<user) return "입력된 값보다 작은 수를 입력하세요.";
		else {
			return "게임 오버";
		}
	}
	public static void process() {
		int com = nansu();
		Scanner sc = new Scanner(System.in);
		cal(com);
		while(true) {
			System.out.println("게임을 다시 할까요?(y|n) :");
			char c = sc.next().charAt(0);
			if(c=='y'||c=='Y') {
				System.out.println("게임을 다시 시작합니다.");
				process();
			}
			else {
				System.out.println("Game Over!!");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
