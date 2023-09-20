//10개의 정수를 입력받아 그 수들 중 짝수의 개수 확인
import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0;
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			if(a%2==0) even+=1;
		}
		
		System.out.println("짝수의 개수 : "+even);

	}

}
