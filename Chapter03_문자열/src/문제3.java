//1에서 100까지 합하는 3의 배수 while문
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		
		while(i<100) {
			if(i%3!=0) {
				i++;
				continue;
			}
			else sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
