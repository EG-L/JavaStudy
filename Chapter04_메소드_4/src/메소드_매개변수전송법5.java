
public class 메소드_매개변수전송법5 {
	public static void swap(int[] arr) {
		System.out.println(arr);
		System.out.println("변경 전:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1]= temp;
		System.out.println("변경 후:swap=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20};
		System.out.println(arr);
		System.out.println("변경 전:main=>arr[0]="+arr[0]+",arr[1]="+arr[1]);
		swap(arr);
		System.out.println("변경 후:main=>arr[0]="+arr[0]+",arr[1]="+arr[1]);

	}

}
