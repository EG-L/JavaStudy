//정수 10개를 저장하는 배열을 만들고 1~10까지의 범위의 정수를 랜덤하게 생성하여 배열을 저장해라 배열에 든 숫자들과 평균 출력
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = 0.0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] temp = new int[10];
		System.out.println("===== array ======");
		for(int i = 0;i<temp.length;i++) {
			temp[i] = (int)(Math.random()*10)+1;
			System.out.print(temp[i] + " ");
			sum+=temp[i];
		}
		avg = sum/(double)temp.length;
		System.out.printf("\n합계 : %d , 평균 : %.2f",sum,avg);
		
		System.out.println();
		System.out.println("===== for ======");
		sum = 0;
		avg = 0.0;
		for(int i = 0; i<10;i++) {
			int temp1 = (int)(Math.random()*10)+1;
			sum+=temp1;
			System.out.print(temp1+" ");
		}
		avg = sum/10.0;
		System.out.printf("\n합계 : %d, 평균 : %.2f",sum,avg);
		
		System.out.println("\n===== while ======");
		sum = 0;
		avg = 0.0;
		int i = 0;
		while(i<10) {
			int temp1 = (int)(Math.random()*10)+1;
			sum+=temp1;
			System.out.print(temp1+" ");
			i++;
		}
		avg = sum/10.0;
		System.out.printf("\n합계 : %d, 평균 : %.2f",sum,avg);
		
		System.out.println("\n===== do~while ======");
		sum = 0;
		avg = 0.0;
		i = 0;
		do {
			int temp1 = (int)(Math.random()*10)+1;
			sum+=temp1;
			System.out.print(temp1+" ");
			i++;
		}
		while(i<10);
		avg = sum/10.0;
		System.out.printf("\n합계 : %d, 평균 : %.2f",sum,avg);

	}

}
