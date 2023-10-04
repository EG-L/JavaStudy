import java.util.Scanner;
//로그인 처리
// 사용자 입력(id,pwd)
// 로그인 여부 확인 => void(해당 메소드 처리) , 결과값을 받을지(return)
// => 결과 갑을 받아서 처리(boolean, int, String)
//                    --------
public class 메소드7 {
	public static String user_input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+"를 입력 :");
		return sc.next();
	}
	public static boolean result(String id, String pwd) {
		final String ID = "admin";
		final String PWD = "1234";
		//boolean => bxxxx
		// isXxx() => 리턴형 boolean
		if(ID.equals(id)&&PWD.equals(pwd)) return true;
		else return false;
	}
	public static void process() {
//		String id = user_input("아이디");
//		String pwd = user_input("비밀번호");
		boolean result = result(user_input("아이디"),user_input("비밀번호"));
		if(result == true) {
			System.out.println("로그인 됐습니다.(response.sendRedirect('main.jsp'))");
		}
		else {
			System.out.println("아이디와 비밀번호를 확인 해주세요.(history.back())");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
