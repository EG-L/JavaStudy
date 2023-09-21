import java.util.Scanner;
//equals (==)
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID = "admin",MPWD="1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		//equals => 대소문자 구분  equalsIgnoreCase => 대소문자 구분 X
		if(id.equals(MID)&&pwd.equals(MPWD)) System.out.println("로그인");
		else System.out.println("아이디 또는 비밀번호를 다시 입력해주세요.");

	}

}
