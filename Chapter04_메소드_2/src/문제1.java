//사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성
//--------------
// 2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성
import java.util.Scanner;
public class 문제1 {
	public static String user_input() {//사용자로부터 아이디 받아서 리턴형 String 매개변수 x
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static boolean check_idpwd(String msg) { //아이디 중복 체크 리턴형 boolean  매개변수 o
		final String ID = "admin";
		if(msg.equals(ID)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void gugudan() { // 2단에서 9단까지 출력 void 내부 출력 매개변수 x
		for(int i = 2;i<10;i++) {
			for(int j = 1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
