//1~30 짝수,홀수 합 계산
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0,even=0;
		
		for(int i =1;i<31;i++) {
			if(i%2==0) even+=i;
			else odd+=i;
		}
		
		System.out.println("짝수 합 :"+even);
		System.out.println("홀수 합 : "+odd);

	}

}
