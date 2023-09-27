import java.util.Scanner;
//사용자로부터 입력값(문자열)을 받아 => 좌우대칭확인
//ABBA => 문자갯수 => length
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		while(true) {
			System.out.print("문자 입력 : ");
			msg = sc.next();
			if(msg.length()%2!=0) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			break;
		}
		// 좌우 대칭 확인
		
		boolean bCheck = false;
		for(int i = 0; i<msg.length()/2;i++) {
			char c = msg.charAt(i);
			char c1 = msg.charAt(msg.length()-1-i);
			if(c!=c1) {
				System.out.println(msg+"는(은) 대칭이 아닙니다.");
				bCheck=false;
				break;
			}
			else {
				bCheck=true;
			}
		}
		if(bCheck==true) System.out.println(msg+"는(은) 좌우 대칭입니다.");
	}

}
