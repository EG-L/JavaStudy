//20개의 정수 난수 발생 => 짝수 / 홀수 개수 
public class 제어문_반복문10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_5=0,num_3=0,num_10=0;
		
		for(int i =0;i<20;i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.print(num+" ");
			if(num%3==0) num_3+=1;
			if(num%5==0) num_5+=1;
			if(num%10==0) num_10+=1;
			
		}
		System.out.println();
		System.out.printf("3의 배수 개수 : %d, 5의 배수 개수 : %d, 10의 배수 개수 : %d",num_3,num_5,num_10);
		
		System.out.println("\n=================================");
		int sum = 0;
		for(int i =1;i<11;i++) {
			if(i%2==0) sum-=i;
			else sum+=i;
		}
		System.out.printf("합계 : %d\n",sum);
		
		//BDFHJLN
		for(char c = 'B';c<='N';c+=2) {
			System.out.print(c);
		}
	}
	/*
	 *   for문 수행시에 => 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다.)
	 *   1 2 3 4 5 6 7
	 * */

}
