//1. 국어, 영어, 수학 점수를 입력 받아 총점 및 평균 출력
import java.util.Scanner;
public class 메소드_문제_3 {
	public static int user_input(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.print(name+" 입력 :");
		return sc.nextInt();
		
	}
	public static int total(int kor,int eng,int math) {
		return kor+eng+math;
	}
	public static double avg(int total) {
		return total/3.0;
	}
	public static char score(double avg) {
		int temp = (int)(avg/10);
		char c = 'A';
		switch(temp) {
			case 10:case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			default:
				c = 'F';
		}
		return c;
	}
	public static void print(int kor,int eng,int math,int total,double avg,char c) {
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",kor,eng,math,total,avg,c);
	}
	public static void process() {
		int kor = user_input("국어");
		int eng = user_input("영어");
		int math = user_input("수학");
		
		int total = total(kor,eng,math);
		double avg = avg(total);
		char c = score(avg);
		print(kor,eng,math,total,avg,c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
