import java.util.Arrays;
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		char[] c_arr = new char[10];
		
		for(int i = 0; i<c_arr.length;i++) {
			c_arr[i] = sc.next().charAt(0);
		}
		for(char c:c_arr) System.out.print(c);
		
		arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		
		arr = new int[10];
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		

	}

}
