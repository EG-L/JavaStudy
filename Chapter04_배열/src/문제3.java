import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] int_array = new int[10];
		
		for(int i = 0; i<int_array.length;i++) int_array[i] = sc.nextInt();
		
		for(int i = 0; i<int_array.length;i++) {
			if(int_array[i]%3==0) System.out.println(int_array[i]);
		}

	}

}
