/*
 * 6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (switch~case 사용)
 * */
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		score=sc.nextInt()/10;
		switch(score) {
			case 10: case 9:
				System.out.println("A학점입니다.");
				break;
			case 8:
				System.out.println("B학점입니다.");
				break;
			case 7:
				System.out.println("C학점입니다.");
				break;
			case 6:
				System.out.println("D학점입니다.");
				break;
			default:
				System.out.println("F학점입니다.");
				
		}
	}

}
