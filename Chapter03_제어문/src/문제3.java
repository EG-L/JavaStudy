/*
 * 문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!
 * */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력 : ");
		int grade = sc.nextInt();
		System.out.print("점수 입력 : ");
		int jumsu = sc.nextInt();
		
		if(grade==4 && jumsu>=70 && jumsu<=100) System.out.println("합격");
		if(grade==4 && jumsu<70 && jumsu>=0) System.out.println("불합격");
		if(grade!=4 && jumsu>=60 && jumsu<=100) System.out.println("합격");
		if(grade!=4 && jumsu<60 && jumsu>=0) System.out.println("불합격");
		if(jumsu>100||jumsu<0) System.out.println("경고");

	}

}
