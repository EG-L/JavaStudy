// 3개의 정수를 받아 평균,총점,학점 구하기
// A B C D F
// a>=90 b>=80 c>=70 d>=60
//100~97 A+ 96~93 A0 92~90 A-
import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("\"홍길동\"");//"홍길동" <<출력
		System.out.print("점수를 입력(10 10 10) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		double avg = (num1+num2+num3)/3.0;
		
		System.out.println("평균 : "+avg);
		System.out.println("총점 : "+(num1+num2+num3));
		//특수문자
		/*
		 *  \n => new Line => 새로운 줄 출력
		 *  \t => tab => 일정 간격
		 *  \" => "" 출력시
		 * */
		
		// 학점
		int temp = (int)avg/10;
		char score = 'A';
		char op = '+';
		if(avg<=100&&avg>=90) {
			score = 'A';
			if(avg<=100&&avg>=97)op='+';
			if(avg<=96&&avg>=93) op='0';
			if(avg<=92&&avg>=90) op='-';
		}
		if(avg<90&&avg>=80) {
			score = 'B';
			if(avg<90&&avg>=87)op='+';
			if(avg<=86&&avg>=83)op='0';
			if(avg<=82&&avg>=80)op='-';
		}
		if(avg<80&&avg>=70) {
			score = 'C';
			if(avg<80&&avg>=77)op='+';
			if(avg<=76&&avg>=73)op='0';
			if(avg<=72&&avg>=70)op='-';
		}
		if(avg<70&&avg>=60) {
			score = 'D';
			if(avg<70&&avg>=67)op='+';
			if(avg<=66&&avg>=63)op='0';
			if(avg<=62&&avg>=60)op='-';
		}
		if(avg<60) {
			op = ' ';
			score='F';
		}
		System.out.println("학점 : "+score+op);
//		
//		if(temp==10||temp==9)System.out.println("학점 : A");
//		if(temp==8)System.out.println("학점 : B");
//		if(temp==7)System.out.println("학점 : C");
//		if(temp==6)System.out.println("학점 : D");
//		if(temp<6)System.out.println("학점 : F");
		
	}

}
