//10개의 정수를 입력받아 3의 배수 개수 5의 배수 개수 각각 출력
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num3 = 0, num5 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			
			if(a%3==0) num3+=1;
			if(a%5==0) num5+=1;
		}
		
		System.out.println("\n3의 배수 개수 : "+num3);
		System.out.println("5의 배수 개수 : "+num5);

	}

}
