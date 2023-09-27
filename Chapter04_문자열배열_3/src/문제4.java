//10개의 난수를 발생하여 배열을 저장한 후에 인덱스 1인 곳의 값 출력

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length;i++) arr[i] = (int)(Math.random()*100)+1;
		
		System.out.println(arr[0]);
		
		int max = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) max =arr[i];
		}
		System.out.println(max);
		

	}

}
