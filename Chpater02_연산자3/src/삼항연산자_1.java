/*
 * 컴퓨터와 가위바위보게임(0,1,2)
 *  0=>가위
 *  1=>보
 *  2=>바위
 *  
 *  ==> 1.컴퓨터 난수 발생
 *      2. 사용자 입력
 *      3. 컴퓨터,사용자의 가위바위보 출력
 *      4. 승패 결과값 출력
 *            -----
 *            컴퓨터         사용자
 *             가위(0)
 *                         가위(0)  S 0-0 = 0
 *                         바위(1)  W 0-1 = -1
 *                         보(2)   L 0-2 = -2
 *             바위(1)
 *                         가위(0)  L 1-0 = 1
 *                         바위(1)  S 1-1 = 0
 *                         보(2)   W 1-2 = -1
 *             보(2)
 *                         가위(0)  W 2-0 = 2
 *                         바위(1)  L 2-1= 1
 *                         보(2)   S 2-2 = 0
 * */
import java.util.Scanner;
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터
		int com = (int)(Math.random()*3);
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0) 바위(1) 보(2): ");
		int user = sc.nextInt();
		// 확인
		System.out.print("컴퓨터 : ");
//		System.out.print(com==0?"가위":"");
//		System.out.print(com==1?"바위":"");
//		System.out.print(com==2?"보":"");
//		System.out.println();
		System.out.print(com==0?"가위":com==1?"바위":"보");
		System.out.println();
		System.out.print("플레이어 : ");
//		System.out.print(user==0?"가위":"");
//		System.out.print(user==1?"바위":"");
//		System.out.print(user==2?"보":"");
		System.out.print(user==0?"가위":user==1?"바위":"보");
		
		System.out.println();
		// 결과 값 출력
		System.out.println("=================");
		int result = com-user;
		System.out.println(result==-1||result==2?"사용자 이김":"");
		System.out.println(result==-2||result==1?"컴퓨터 이김":"");
		System.out.println(result==0?"비김":"");
	}

}
