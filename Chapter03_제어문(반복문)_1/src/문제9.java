//100~999사이의 4의 배수가 아닌 수의 개수, 합을 출력
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0, count = 0;
		
		for(int i=100;i<1000;i++) {
			if(i%4!=0) {
				sum+=i;
				count++;
			}
		}//i는 내부 변수 => 자동 소멸
		System.out.println("개수: "+count);
		System.out.println("합 : "+sum);

	}

}
