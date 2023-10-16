package com.sist.main;
// 메모리 => 상위 클래스 => 상속받은 클래스 메모리 할당
class Super{
	int a=10;
	public Super(int a)
	{
		this.a=a;
		System.out.println("Super 생성자 호출 ...");
	}
}
class Sub extends Super{
	int a;
	public Sub() {
		super(100); //상위 클래스의 매개변수가 있는 생성자는 반드시 호출
		//=> 생략이 가능한 경우 => 상위 클래스가 디폴트 생성자
//		super(); // 자동 추가
		a= 1000;
		System.out.println("Sub 생성자 호출");
		System.out.println("Sub: a="+this.a);//자신(하위 클래스)의 객체명
		System.out.println("Super: a="+super.a);//슈퍼(상위 클래스)의 객체명
		/*
		 * 
		 *    heap
		 *    --------------------
		 *     ------Super-------
		 *             a => super.a (Super => a)
		 *     ------------------
		 *     -------this-------
		 *             a => this.a , a (Sub => a)
		 *     ------------------
		 *    --------------------
		 * */
	}
}
/*
 *   클래스 중에 final 클래스
 *            ----------
 *            public final class()
 *                             --- 확장이 안되는 클래스
 *                             --- 상속을 받을 수 없다.
 *                             --- String, Math
 *                                 System...
 *                                 java.lang => 217page
 * */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sub();

	}

}
