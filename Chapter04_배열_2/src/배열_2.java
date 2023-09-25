// 응용
// => 정수를 1개 입력받아서 => 이진법 출력
/*
 * 32bit => 0,1 => 16bit(32767) => 양수
 * 10
 * 0000 0000 0000 1010
 * */
// 0, 15...
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] binary = new int[16];// 0
		int index = binary.length-1;//마지막 인덱스 번호
		System.out.print("번호 입력 : ");
		int num = sc.nextInt();
//		for(int i = binary.length-1;i>=0;i--) {
//			binary[i] = num%2;
//			num/=2;
//		}
//		for(int i:binary) {
//			System.out.print(i);
//		}
		System.out.println("========== Lib ==========");
		System.out.println(Integer.toBinaryString(num));
		while(true) {
			binary[index] = num%2;
			num/=2; // 1/2=0
			if(num==0) break;
			index--;
		}
		//출력
		for(int i =0; i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
	}

}
