//가위바위보 => 10번 => 3승 2무 5패
import java.util.Scanner;
class A{
	
}
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,draw=0,lose=0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		while(i<11) {
			System.out.println("========="+i+"번 째 게임=========");
			int com = (int)(Math.random()*3);
			
			int user = 0;
			while(true) {//유효성 검사
				System.out.print("가위(0), 바위(1), 보(2) : ");
				user = sc.nextInt();
				if(user<0 || user>2) continue;
				break;
			}
			
			System.out.print("컴퓨터 : ");

			if(com==0) {
				System.out.println("가위");
			}
			else if(com==1) {
				System.out.println("바위");
			}
			else if(com==2) {
				System.out.println("보");
			}
			System.out.print("사용자 : ");
			if(user==0) {
				System.out.println("가위");
			}
			else if(user==1) {
				System.out.println("바위");
			}
			else if(user==2) {
				System.out.println("보");
			}
			
			// 승패 결정
			int result=com-user;
			/*
			 *      컴퓨터     사용자
			 *       가위(0)    가위(0) => 0
			 *                 바위(1) => -1 user
			 *                  보(2) => -2
			 *       바위(1)    가위(0) => 1
			 *                 바위(1) => 0
			 *                  보(2) => -1 user
			 *        보(2)    가위(0) => 2 user
			 *                바위(1) => 1
			 *                 보(2) => 0
			 * */
			if(result==-1 || result==2) win+=1;
			else if(result==1||result==-2) lose+=1;
			else draw+=1;
			
			i++;
		}
		System.out.println("========== 결과값 ==========");
		System.out.printf("%d승 %d무 %d패",win,draw,lose);

	}

}
