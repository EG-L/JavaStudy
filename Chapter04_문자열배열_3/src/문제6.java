
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i =0 ;i<arr.length;i++) arr[i] = (int)(Math.random()*100)+1;
		
		for(int i = 0;i<arr.length;i++) {
			if(i!=2) {
				System.out.println(arr[i]);
			}
		}

	}

}
