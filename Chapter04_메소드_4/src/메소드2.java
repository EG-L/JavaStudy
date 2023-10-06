//리턴형(o) 매개변수(x)
//=> 아이디찾기
import java.util.Scanner;
public class 메소드2 {
	public static String user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력:");
		return sc.next();
	}
	//아이디 중복 체크
	public static boolean check(String id) {
		final String[] USERID= {"hong","admin","lee","park","shim"};
		boolean bCheck = false;
		for(String i:USERID) {
			if(id.equals(i)) {
				bCheck = true;
				break;
			}
		}
		return bCheck;
	}
	// 모든 메소드를 조립하는 메소드 (기본)
	public static void process() {
		String id = user_input();
		//사용자 입력값
		boolean bCheck = check(id);
		if(bCheck) {
			System.out.println(id+"는 이미 사용중인 아이디입니다.");
		}
		else {
			System.out.println(id+"는 사용 가능한 아이디입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
