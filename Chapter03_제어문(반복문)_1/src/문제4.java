//한개의 정수를 입력받아 1부터 정수의 합을 구하시오.
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i =1;i<=input;i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합 : "+sum);

	}

}
