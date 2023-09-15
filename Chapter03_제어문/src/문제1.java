/*
 * 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
 *       --- 변수 확인              ----------   ----------
         판단해보자.
 * */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num>=50) System.out.println("50이상이다.");
		if(num<50) System.out.println("50미만이다.");

	}

}
