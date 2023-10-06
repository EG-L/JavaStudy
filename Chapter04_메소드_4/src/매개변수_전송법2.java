
public class 매개변수_전송법2 {
	static void swap(int[] arr) {//복사본
		System.out.println(arr);
		arr[0] = 100;
	}
	// => 배열 => 메모리 주소 이용
	// => 기본형 => 실제 저장된 값 이용
	public static void main(String[] args) {
		int b = 10;//원본=>call by value
		System.out.println("b="+b);
		
		/*
		 *  int b = 10;
		 *  int a = b;
		 *  a = 100;
		 * */
		int[] kkk = {1,2,3};
		System.out.println(kkk);
		swap(kkk);
		
		System.out.println(kkk[0]);
	}
}
