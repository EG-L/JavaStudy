//100개의 난수(0~9) 중 빈도수 구하기
import java.util.Arrays;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i<100;i++) {
			int temp = (int)(Math.random()*10);
			arr[temp]+=1;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
