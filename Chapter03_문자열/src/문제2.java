/*
 * 3~5는 봄 6~8여름 9~11 가을 12~2 겨울
 * */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12) : ");
		int month = sc.nextInt();
		
		if(month>=3&&month<=5) System.out.println("봄");
		else if(month>=6&&month<=8) System.out.println("여름");
		else if(month>=9&&month<=11) System.out.println("가을");
		else System.out.println("겨울");

	}

}
