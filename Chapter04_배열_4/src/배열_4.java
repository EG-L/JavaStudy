// 알파벳
import java.util.Arrays;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (char)((Math.random()*26)+65);
		}
		System.out.println("========== 정렬 전 ==========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("========== 정렬 후 ==========");
		for(int i =0; i<arr.length-1;i++) {
			for(int j = i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("=========== "+(i+1)+"Round ===========");
		}
		System.out.println(Arrays.toString(arr));

	}

}
