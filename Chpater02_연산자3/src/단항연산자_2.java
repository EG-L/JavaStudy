// 형변환 연산자
/*
 *    (int)값
 *    
 *     ==> 크기
 *     byte < char < int < long < float < double
 *            short
 *          ======================> 자동형변환(Upcasting)
 *         <======================  강제형변환(Downcasting)
 * */
public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		
		double d = (double)a;//형변환 연산자 생략 가능
		//Upcasting
		char c = (char)a;//특수한 경우 => 생략이 가능(실제 값 대입)
		// char c = 65;
		//DownCasting      연산처리가 되면 생략할 수 없다
		
		int i = 10;
		int j = 55;
		char c1 = 0;
		System.out.println("a = "+a);
		System.out.println("d = "+d);
		System.out.println("c = "+c);
		
		c = 65535;
		System.out.println(c);
		
		c = '0';
		System.out.println("c = "+(int)c);
		
	}

}
