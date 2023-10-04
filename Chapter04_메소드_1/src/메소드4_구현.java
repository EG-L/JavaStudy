//메소드_4 처리
//리턴형 / 매개변수 / 메소드명 => 가독성있게...
// 입력 => 가능
// 구구단 => 기능
import java.util.Scanner;
public class 메소드4_구현 {
	//사용자로부터 정수를 받는다.
	public static int user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		return sc.nextInt();
	}
	//받은 정수에 해당하는 구구단 출력
	public static void gugudan(int a) {
		for(int i = 1;i<10;i++) System.out.println(a+"*"+i+"="+(a*i));
	}
//	public static String gugudan(int a) {
//		String result = a+"단\n";
//		for(int i = 1; i<10;i++) result+=a+"*"+i+"="+(a*i)+"\n";
//		return result;
//	}
	public static void process() {	
		gugudan(user_input());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
