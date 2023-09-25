// 1~100 => 10개 저장 ==> 변수(X) , 배열(O)
// => 1. 총합
// => 2. 평균
// => 3. 최대값
// => 4. 최소값
// => 5. 최대값의 위치
// => 6. 최소값의 위치 ==> index 
import java.util.Arrays;
public class 배열_6 {
	public static void Process() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = new int[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("======== 저장된 값 ========");
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("총합 : "+sum);
		double avg = sum/10.0;
		System.out.printf("평균 : %.2f\n",avg);
		
		int max = 0,min = 100;
		
		for(int i:arr) {
			if(max<i) max = i;
			if(min>i) min = i;
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		int max_loc = 0, min_loc = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == max) {
				max_loc=i+1;
				System.out.println("Max 값의 위치 : "+max_loc);
			}
			if(arr[i] == min) {
				min_loc=i+1;
				System.out.println("Min 값의 위치 : "+min_loc);
			}
		}
	}

}
