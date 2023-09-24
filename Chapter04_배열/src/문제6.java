import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum=0;
		double avg;
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.printf("총점 : %d , 평균 : %f",sum,sum/(double)arr.length);
//		
		int[] i_arr = {95,75,85,100,50};
		int temp = 0;
		
		for(int i = 0;i<i_arr.length-1;i++) {
			for(int j = i+1;j<i_arr.length;j++) {
				if(i_arr[i]>i_arr[j]) {
					temp = i_arr[i];
					i_arr[i] = i_arr[j];
					i_arr[j] = temp;
				}
			}
		}
		for(int k:i_arr) System.out.print(k+" ");

	}

}
