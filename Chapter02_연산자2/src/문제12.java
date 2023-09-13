import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세 개의 정수 입력(1 2 3) : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();//scan내의 저장된 값을 가져온다
		
		System.out.printf("%d*%d+%d = %d",a,b,c,(a*b+c));
	}

}
