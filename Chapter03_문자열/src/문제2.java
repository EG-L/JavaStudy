/*
 * 3~5는 봄 6~8여름 9~11 가을 12~2 겨울
 * 
 * 다중 조건문 / 선택문
 * */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		while(true) {
			System.out.print("달을 입력하세요(1~12) : ");
			month = sc.nextInt();
			if(month<1||month>12) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
		}
		if(month>=3&&month<=5) System.out.println("봄");
		else if(month>=6&&month<=8) System.out.println("여름");
		else if(month>=9&&month<=11) System.out.println("가을");
		else System.out.println("겨울");
		
		switch(month) {
			case 12:case 1:case 2:
				System.out.println("겨울");
				break;
			case 3:case 4:case 5:
				System.out.println("봄");
				break;
			case 6:case 7:case 8:
				System.out.println("여름");
				break;
			default:
				System.out.println("가을");
		}

	}

}
