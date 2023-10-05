// 정수 입력 => 0~32767 => 16bit => 2진법 전환으로 출력하는 메소드
// 입력 , 2진법 계산, 출력 => 조립
import java.util.Scanner;
import java.util.Arrays;
public class 메소드2 {
	//입력
	public static int user_input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	//2진법
	public static String Change(int data) {
		String[] arr = new String[16];
//		int index = arr.length-1;
//		while(true) {
//			arr[index] = data%2;
//			data=data/2;
//			if(data==0)
//				break;
//			index-=1;
//		}
//		return arr;
		for(int i = arr.length-1;i>=0;i--) {
			if(data!=0) {
				arr[i] = String.valueOf(data%2);
				data=data/2;
			}
			else if(data==0){
				arr[i] = "0";
			}
		}
		String result = String.join("", arr);
		for(int i = 0; i<result.length();i++) {
			if(i%4==0&&i!=0) {
				System.out.print(" ");
			}
			System.out.print(result.charAt(i));
		}
		return String.join("", arr);
		
	}
	//출력
	public static void process() {
		System.out.print("정수 입력(0~32767) :");
		int num = user_input();
		System.out.println("\n"+Change(num));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
