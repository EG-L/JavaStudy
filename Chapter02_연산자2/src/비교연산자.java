/*44page
 * 비교연산자
 * 
 * 1) == 같다
 * 2) != 같지 않다
 * 3) < 작다
 * 4) > 크다
 * 5) <= 작거나 같다
 * 6) >= 크거나 같다
 * --------------
 * 
 * 
 * */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		/*
		 *        0.0~0.99 사이의 숫자 추출 * 100 => 0.0~99.0
		 *      ----
		 *      0~99
		 *                            =>1~100
		 * */
		int b = (int)(Math.random()*100)+1;//예약가능한 날
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a>b : "+(a>b));
		System.out.println("a<=b : "+(a<=b));
		// a<b || a == b
		System.out.println("a>=b : "+(a>=b));
		// a>b || a == b

	}

}
