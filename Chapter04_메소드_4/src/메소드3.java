// 숫자 야구게임
import java.util.Scanner;
import java.util.Arrays;
/*
 *    1. 컴퓨터 난수 발생 =>
 *    2. 사용자 입력
 *    3. 힌트
 *    4. 종료 여부 확인
 *    5. 조립
 * */
public class 메소드3 {
	public static int[] nansu() {
		//컴퓨터 난수 발생
		int[] com = new int[3];
		for(int i = 0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j =0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		return com;
	}
	public static int user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 자리 정수 입력 :");
		return sc.nextInt();
	}
	public static int[] hint(int input,int[] com, int user[]) {
		int[] count = new int[2];
		int s=0,b=0;
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(com[i]==user[j]) {//같은 수 체크
					if(i==j) {
						s++;//같은 자리
					}
					else {
						b++;//다른 자시
					}
				}
			}
		}
		System.out.printf("Input Number: %d, Result: %dS-%dB\n",input,s,b);
		count[0] = s;
		count[1] = b;
		//힌트 출력
		return count;
	}
	public static boolean game_end(int[] count) {
		boolean bCheck = false;
		if(count[0]==3) {
			bCheck = true;
		}
		return bCheck;
	}
	public static void process() {
		int[] nansu = nansu();
		int[] user = new int[3];
		while(true) {
			int input = user_input();
			if(input<100||input>999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1] || user[1]==user[2]||user[2]==user[0]) {
				System.out.println("같은 숫자를 사용할 수 없습니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0||user[2]==0) {
				System.out.println("0을 사용할 수 없습니다.");
				continue;
			}
			int[] hint = hint(input,nansu,user);
			
			boolean bCheck = game_end(hint);
			if(bCheck) {
				System.out.println("Game Over!!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
