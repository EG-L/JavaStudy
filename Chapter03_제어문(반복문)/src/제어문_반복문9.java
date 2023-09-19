import java.util.Scanner;
//사용자 정수 1개 입력 => 입력받은 수까지의 합을 출력 10 1~10
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int sum = 0;
		int input = sc.nextInt();
		for(int i =1 ;i<=input;i++) {
			sum+=i;
		}
		System.out.printf("총 합계 : %d\n",sum);

	}

}
