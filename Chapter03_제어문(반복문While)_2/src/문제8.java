//3이상 4462 이하의 짝수의 합
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 4;i<=4462;i+=2) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
