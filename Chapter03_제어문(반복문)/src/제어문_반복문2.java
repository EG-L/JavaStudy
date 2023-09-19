//정수 1개를 받아 해당 구구단 출력
import java.util.Scanner;
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력 : ");
		int dan = sc.nextInt();//초기화(명시적,입력값,임의의 난수, 파일, 오라클)
		for(int i = 1;i<10;i++) {
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
		}

	}

}
