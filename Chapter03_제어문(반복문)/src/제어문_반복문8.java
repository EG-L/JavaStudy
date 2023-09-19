/*
 * up down 게임
 * -----------
 *   컴퓨터 난수 발생 : 1~100
 *   --------------------
 *   => 힌트
 *     -----
 *     => 정답이 나올때까지 반복 수행
 *        -------------------- 무한루프
 *        for(;;) => while(true)
 * */
import java.util.Scanner;
//import java.lang.*; <<= 자동첨부
public class 제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int user = 0;//종료 => break, System.exit(0)
//		while(true) {
//			System.out.print("값 입력 : ");
//			user = sc.nextInt();
//			if(com==user) {
//				System.out.println("정답");
//				break;
//				}
//			else if(com>user) System.out.println("Up");
//			else System.out.println("Down");
//		}
		int count = 0;
		for(;;) {
			System.out.print("1~100 사이의 값 입력 : ");
			user = sc.nextInt();
			if(user<1||user>100) {
				System.out.println("잘못된 입력입니다.");
				continue;//처음으로 다시 돌아갈 때
			}
			count++;
			//hint
			if(com>user) {
				System.out.println("높은 숫자 입력(Up)");
			}
			else if(com<user) {
				System.out.println("낮은 숫자 입력(Down)");
			}
			else {
				System.out.println("Game Over");
				System.out.println("입력 횟수 : "+count);
				System.exit(0);//프로그램 종료
			}
		}

	}

}
