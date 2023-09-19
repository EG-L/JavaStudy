//100~999사이의 7의 배수와 개수
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		
		for(int i =100;i<1000;i++) {
			if(i%7==0) {
				sum+=i;
				count++;
			} 
		}
		System.out.println("7의 배수의 개수 : "+count);
		System.out.println("7의 배수의 합 : "+sum);

	}

}
