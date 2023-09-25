/*
 *  문자 => 10개 저장
 *  char[] arr = new char[10];
 *  String[] s = new String[10]; *************
 * */
// => 빈도수 구하기 => 100개의 난수 (0~9)
import java.util.Arrays;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] cnt = new int[10];
//		
//		for(int i =0; i<100;i++) {
//			int temp = (int)(Math.random()*10);
//			cnt[temp]+=1;
//		}
//		System.out.println(Arrays.toString(cnt));
		
		int[] data = new int[100];
		for(int i = 0; i<data.length;i++) {
			data[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(data));
		// 빈도수 구하기
		int[] cnt = new int[10];
		for(int i =0;i<data.length;i++) {
			cnt[data[i]]+=1;
		}
		
		int sum = 0;
		for(int i =0;i<cnt.length;i++) {
			System.out.println(i+":"+cnt[i]);
			sum+=cnt[i];
		}
		System.out.println("sum: "+sum);

	}

}
