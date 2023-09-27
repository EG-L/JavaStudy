import java.util.Scanner;
import java.util.Arrays;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 인덱스 번호 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 인덱스 번호 입력:");
		int num2 = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		int temp = arr[num1-1];
		arr[num1-1] = arr[num2-1];
		arr[num2-1] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
