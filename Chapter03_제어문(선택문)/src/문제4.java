/*
 * 4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
윤년 조건 : if((year%4==0 && year%100!=0)||(year%400==0))
 * */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if((num%4==0&&num%100!=0) || num%400==0) System.out.println(num+"은(는) 윤년입니다.");
		else System.out.println(num+"은(는) 윤년이 아닙니다.");

	}

}
