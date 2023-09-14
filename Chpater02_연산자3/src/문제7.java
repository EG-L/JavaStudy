
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch = sc.next().charAt(0);
		char lowCase = (char)(ch>='A'&&ch<='Z'?ch+32:ch-32);
		System.out.println("ch : "+ch);
		System.out.println(ch>='A'&&ch<='Z'?"lowCase : "+lowCase:"UpperCase : "+lowCase);

	}

}
