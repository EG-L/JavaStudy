/*
 *   이항 => () + ()
 *   삼항 => () () ()
 *          (조건)?값1:값2
 *          -----
 *            true => 값1
 *            false => 값2
 *            
 *         int a = 10;
 *         (a%2==0)?"짝수":"홀수" // 소스를 줄일 때 많이 사용
 *         
 * */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1; // 1~100
		System.out.println("a= "+a);
		System.out.println(a%2==0?"짝수":"홀수");
		// sex = 1, 3 sex = 2, 4
//		         ---- 남자   ----여자

		int b = (int)(Math.random()*4)+1;
		System.out.println(b);
		System.out.println(b%2==0?"여자":"남자");

	}

}
