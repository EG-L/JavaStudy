/*
 *    1. 컴퓨터 난수 발생 => com[]
 *    리턴 매개변수 파악
 *    리턴 => int[] 매개변수 =>x
 *    2. 사용자 입력 => user[]
 *    리턴 => int[] 매개변수 =>x
 *    3. 힌트 => (com[],user[]) => s,b 추출
 *    리턴 => int(s) 매개변수 : com[], user[]
 *    4. 종료 여부 확인 => s
 *    리턴 => boolean 매개변수 : int(s)
 *    5. 조립
 * */
import java.util.*;
public class 메소드변경 {
	static int[] getRand() {
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
	static int[] userinput() {
		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		while(true) {
			System.out.print("세 자리 정수 입력 :");
			int input = sc.nextInt();
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
			break;
		}
		return user;
	}
	static int hint(int[] com, int[] user) {
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
		System.out.printf("Input Number: %d%d%d, Result: %dS-%dB\n",user[0],user[1],user[2],s,b);
		print(s,b);
		return s;
	}
	static boolean isEnd(int s) {
		boolean bCheck = false;
		if(s==3) {
			bCheck = true;
		}
		return bCheck;
	}
	static void print(int s, int b) {
		System.out.println("============ 전광판 ============");
		System.out.println("S:");
		for(int i = 0; i<s;i++) {
			System.out.print("●");
		}
		System.out.println("\nB:");
		for(int i =0;i<b;i++) {
			System.out.print("○");
		}
		System.out.println("\n==============================");
	}
	static void process() {
		int[] com =getRand();
		int[] user = new int[3];
		Scanner sc = new Scanner(System.in);
		while(true) {
			user = userinput();
			int s = hint(com,user);
			if(isEnd(s)) {
				System.out.print("게임을 다시 할까요?(y|n)");
				char c = sc.next().charAt(0);
				if(c=='Y' || c=='y') {
					System.out.println("=== 새게임을 시작합니다. ===");
					process();
				}
				else {
					System.out.println("Game Over!!");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
