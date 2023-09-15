/*
 * 문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
         프로그램 작성
 * */
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int num2 = ((int)(Math.random()*2))==0?(int)(Math.random()*100):(int)(Math.random()*100)*-1;
		System.out.println(num2);
		if(num>=0)System.out.println("양수");
		if(num<0)System.out.println("음수");
	}

}
