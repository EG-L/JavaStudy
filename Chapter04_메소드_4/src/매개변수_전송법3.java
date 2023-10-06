import java.util.*;
public class 매개변수_전송법3 {
	public static void change2(String s) {//기본형으로 취급
		s = "Hello World";
	}
	public static void change(int[] arr) {
		//arr=temp
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[5];
		System.out.println("적용전 : ");
		System.out.println(Arrays.toString(temp));
		
		change(temp);
		System.out.println("적용후 : ");
		System.out.println(Arrays.toString(temp));
		
		String s = "";
		change2(s);
		System.out.println(s);
		//주소가 같은 경우 저장값을 언제든 제어 할 수 있다.
		int[] a = {1,2,3};
		int[] b = a;
		int[] c = a;
		int[] d = a;
		d[0] = 10;
		System.out.println("a[0]="+a[0]);
		

	}

}
