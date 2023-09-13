import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력 값을 읽어온다
		Scanner scan = new Scanner(System.in);
		//                         --------- 키보드 입력 값
		
		/*
		 * System.out.print("첫번째 정수를 입력 : "); int a = scan.nextInt();
		 * System.out.print("두번째 정수를 입력 : "); int b = scan.nextInt();
		 * 
		 * System.out.printf("%d+%d = %d\n",a,b,(a+b));
		 * System.out.printf("%d-%d = %d\n",a,b,(a-b));
		 * System.out.printf("%d*%d = %d\n",a,b,(a*b));
		 */
		
		System.out.print("정수 두 개 입력 (10 20): ");//한번에 받을 떄는 띄어쓰기로 구분
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a-b);
		System.out.println(a+b);

	}

}
