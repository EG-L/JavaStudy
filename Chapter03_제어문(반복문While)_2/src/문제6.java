//두개의 정수를 입력받아 시작해서 끝까지의 곱을 출력 ( 체크인 코드 )
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 값 : ");
		int num1 = sc.nextInt();
		System.out.print("끝 값 : ");
		int num2 = sc.nextInt();
		
		int mul = 1;
		
		for(int i = num1;i<=num2;i++) {
			mul*=i;
		}
		System.out.println(mul);

	}

}
