/*
 *  컴퓨터 vs 플레이어 => 가위바위보
 *  -------------------------
 *  => 다중 조건문 => 경우의 수 9개
 *                 ----------조건문
 *     컴퓨터      플레이어
 *     가위        가위
 *                바위
 *                보
 *     바위        가위
 *                바위
 *                보
 *     보         가위
 *                바위
 *                보
 *  ------------------------------ 가정 0(가위) , 1(바위), 2(보)
 *    ==> 중첩 if ==> 55page
 *        ------
 *        if(중첩문) ==> 한개의 조건문 ==> &&
 *        {
 *        	if(조건문) // 관리자
 *        	{
 *        	}
 *        	if(조건문) // 사용자
 *        }
 *        else
 *        {
 *        	Guest라면 
 *        }
 * */
import java.util.Scanner;
public class 제어문_조건문3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, user;
		com = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		user = sc.nextInt();
		
		// 가공
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
		//다음 줄에 출력
//		System.out.println();
		
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
		
		int res = com-user;
		if(res==-2||res==1)System.out.println("컴퓨터 WIN");
		else if(res==2||res==-1)System.out.println("사용자 WIN");
		else System.out.println("비겼다.");
		//결과값 출력
		/*
		 *       com-user
		 *       com이 이기는 경우 ==> -2,1
		 *       user가 이기는 경우 ==> -1,2
		 *       비기는 경우 => 0
		 *     com ==0(가위)
		 *                user = 0(가위) => S => 0-0 = 0
		 *                user = 1(바위) => U => 0-1 = -1
		 *                user = 2(보) => C => 0-2 = -2
		 *     com == 1(바위)
		 *                user = 0(가위) => C => 1-0 = 1
		 *                user = 1(바위) => S => 1-1 = 0
		 *                user = 2(보) => U => 1-2 = -1
		 *     com == 2(보)
		 *                user = 0(가위) => U => 2-0 = 2
		 *                user = 1(바위) => C => 2-1 = 1
		 *                user = 2(보) => S => 2-2 = 0
		 * */
//		if(com==0) // 컴퓨터가 가위일 경우
//		{
//			if(user==0) System.out.println("비겼다."); // 유저 가위
//			else if(user==1) System.out.println("사용자 WIN"); // 유저 바위
//			else if(user==2) System.out.println("사용자 LOSE"); // 유저 보
//		}
//		else if(com==1) // 컴퓨터가 바위일 경우
//		{
//			if(user==0) System.out.println("사용자 LOSE"); // 유저 가위
//			else if(user==1) System.out.println("비겼다."); // 유저 바위
//			else if(user==2) System.out.println("사용자 WIN"); // 유저 보
//		}
//		else if(com==2) // 컴퓨터가 보일 경우
//		{
//			if(user==0) System.out.println("사용자 WIN"); // 유저 가위
//			else if(user==1) System.out.println("사용자 LOSE"); // 유저 바위
//			else if(user==2) System.out.println("비겼다."); // 유저 보
//		}
		
		

	}

}
