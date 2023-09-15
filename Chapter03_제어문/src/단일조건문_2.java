/*
 *    정수 입력을 1개 받아
 *    >>11
 *    같은 숫자입니다.
 *    >>88
 *    >>77
 * */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 정수 입력 : ");
		int num = sc.nextInt();
		if(num>0&&num<100) {
			if(num%10==num/10) {
				System.out.println("같은 숫자입니다.");
			}
			if(!(num%10==num/10)) {
				System.out.println("다른 숫자입니다.");
			}
		}
		if(num<0||num>99) {
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
