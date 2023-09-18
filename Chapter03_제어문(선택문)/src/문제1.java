/*
 * 1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
 * */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num>=0) System.out.println(num+"은(는) 양수입니다.");
		else System.out.println(num+"은(는) 음수입니다.");
	}

}
