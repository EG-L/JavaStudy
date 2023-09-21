//do~while 
//updown 게임
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100)+1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정수 입력(1~100) : ");
			int user = sc.nextInt();
			if(user<1||user>100) continue;
			
			cnt++;
			if(user<com) System.out.println("UP");
			else if(user>com) System.out.println("DOWN");
			else {
				System.out.println("COM : "+com);
				System.out.println("정답 입력 횟수 : "+cnt);
				break;
			}
			
		}while(true);
	}

}
