import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개 정수 입력(1 2) : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("%d/%d=%d",a,b,(a%b));

	}

}
