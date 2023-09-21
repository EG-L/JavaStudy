//1부터 100까지 짝수만 더하는 코드
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		System.out.println("===== for =====");
		for(int i=1;i<101;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println(sum);
		System.out.println("===== while =====");
		int i = 1;
		sum = 0;
		while(i<101) {
			if(i%2==0) sum+=i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("===== do~while =====");
		i = 1;
		sum = 0;
		do {
			if(i%2==0) sum+=i;
			i++;
			
		}while(i<101);
		System.out.println(sum);

	}

}
