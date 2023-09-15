/*
 * 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 *      ---- 변수              ----------------- 조건문
 * */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num%3==0)System.out.println("3의 배수입니다.");
		if(num%3!=0)System.out.println("3의 배수가 아닙니다.");
	}

}
