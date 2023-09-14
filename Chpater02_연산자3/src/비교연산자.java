/*
 *      정수, 실수, 문자 비교 시에 많이 사용 ==> boolean
 *      비교연산자
 *       == 
 *       !=
 *       <
 *       >
 *       <=
 *       >=
 * */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*3)+1;
		int b = (int)(Math.random()*3)+1;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("A==B : " + (a==b));
		System.out.println("A!=B : " + (a!=b));
		System.out.println("A<B : " + (a<b));
		System.out.println("A>B : " + (a>b));
		System.out.println("A<=B : " + (a<=b));
		System.out.println("A>=B : " + (a>=b));
		
		char c = (char)((Math.random()*3)+65);//A B C
		char d = (char)((Math.random()*3)+65);//A B C

		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("c==d : " + (c==d));
		System.out.println("c!=d : " + (c!=d));
		System.out.println("c<d : " + (c<d));
		System.out.println("c>d : " + (c>d));
		System.out.println("c<=d : " + (c<=d));
		System.out.println("c>=d : " + (c>=d));
		//제어문에서 가장 많이 사용되는 연산자 ( 조건문, 반복문 )
		
		System.out.println("A와 B 중 무엇이 클까?"+(a==b?"같다":a>b?"A가 크다":"B가 크다"));
	}

}
