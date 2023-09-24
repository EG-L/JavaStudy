/*
 * 가위바위보 확인 프로그램
 * */
import java.util.Scanner;
public class 배열_생성3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*3);//0,1,2
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0) 바위(1) 보(2) :");
		int user = sc.nextInt();
		
		String[] res = {"가위","바위","보"};
		System.out.println("COM :"+res[com]);
		System.out.println("USER :"+res[user]);
//		System.out.print("COM :");
//		if(com==0) System.out.println("가위");
//		else if(com==1) System.out.println("바위");
//		else System.out.println("보");
//		
//		System.out.print("USER :");
//		if(user==0) System.out.println("가위");
//		else if(user==1) System.out.println("바위");
//		else System.out.println("보");

	}

}
