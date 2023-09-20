// 사용자로부터 정수 1개 => 구구단 출력
import java.util.Scanner;

public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단(2~9) 입력 : ");
		user = sc.nextInt();
		
		int i = 1;
		while(i<10) {
			System.out.printf("%2d * %2d = %2d\n",user,i,user*i);
			i++;
		}
		
		
//		int a=0,b=0,c=0,d=0,e=0;
//		int[] arr = new int[10];
		
	}

}
