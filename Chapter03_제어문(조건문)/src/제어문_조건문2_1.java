// if ~ else
/*
 *   예상되는 결과 값이 2개로 나눠서 나올 경우 => if ~ else
 *   단일 조건문 => 여러개가 동시에 결과 값이 있는 경우
 *   다중 조건문 => 여러개 중 한 개만 수행
 *   
 *   국어,영어,수학 => 평균, 총점 => 평균이 60점 이상, 60점 미만(합격/불합격)
 * */
import java.util.Scanner;
public class 제어문_조건문2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		int kor,eng,math,total;
		double avg;
		//초기화 => 명시적 초기화, 입력값을 받아 저장, 임의 발생
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.println("=========결과값=========");
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n",avg);
		if(avg>=60) System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
		/*
		 *   int a= 10; (명시적 초기화)
		 *   Scanner (입력값)
		 *   random (임의)
		 * */
		//결과값 도출
	}

}
