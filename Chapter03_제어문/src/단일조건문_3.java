/*
 *   1~100사이의 난수 3개 발생
 *   => 발생된 난수 출력
 *   => Max,Min값 출력
 * */
public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		
		System.out.println("num 1 : "+ num1);
		System.out.println("num 2 : "+ num2);
		System.out.println("num 3 : "+ num3);
		
		int max = num1;
		int min = num1;
		if(max<num2) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("최대값은 : "+max);
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		System.out.println("최소값은 : "+min);
	}

}
