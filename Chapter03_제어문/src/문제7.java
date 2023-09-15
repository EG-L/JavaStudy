/*
 * 문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 * */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 개의 정수 입력(10 10 10) : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int total = num1+num2+num3;
		double avg = total/3.0;
		
		System.out.println("총 점 : "+total);
		System.out.printf("평 균 : %.2f\n ",avg);
		
		int temp = (int)avg/10;
		if(temp==9||temp==10)System.out.print("A");
		if(temp==8)System.out.print("B");
		if(temp==7)System.out.print("C");
		if(temp==6)System.out.print("D");
		if(temp<6)System.out.print("F");
	}

}
