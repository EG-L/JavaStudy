
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i<arr.length;i++) arr[i] = (int)(Math.random()*100)+1;
		
		for(int a:arr) {
			if(a%3==0) {
				System.out.println(a);
			}
		}
		int odd=0,even=0;
		
		for(int a:arr) {
			if(a%2==0) {even+=1;}
			else {odd+=1;}
		}
		System.out.println("even :"+even+", odd : "+odd);

	}

}
