//10개의 임의의 정수를 받아서 최소값 최대값 구하는 프로그램 작성
import java.util.Arrays;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		int max=arr[0],min=arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Min : "+min+", Max : "+max);

	}

}
