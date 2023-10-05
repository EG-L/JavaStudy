//5개의 정수를 받아서 => max, min
import java.util.*;
public class 메소드5 {
	public static int[] userInput() {
		int[] arr = new int[5];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		// 사용자로부터 입력을 받는다. / 초기화 => 한단락
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}
	public static int max(int[] arr) {
		int m = arr[0];
		for(int i:arr) {
			if(i>m) m=i;
		}
		return m;
	}
	public static int min(int[] arr) {
		int m = arr[0];
		for(int i:arr) {
			if(i<m) m=i;
		}
		return m;
	}//리턴형은 한개만 호출 
	public static void print(int max, int min) {
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);

	}
	public static void process() {
		int[] arr = userInput();
		int max = max(arr);
		int min = min(arr);
		print(max,min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
