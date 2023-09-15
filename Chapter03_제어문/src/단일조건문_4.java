// 정수 2개를 입력 난수로 받아=> 최대값 최소 값을 구하시오.
public class 단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		System.out.printf("%d,%d,%d\n",num1,num2,num3);
		System.out.println("Max:"+Math.max(Math.max(num1, num2), num3));
		System.out.println("Max:"+Math.min(Math.min(num1, num2), num3));

	}
}
