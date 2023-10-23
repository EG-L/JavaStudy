
public class MainClass_3 {
	public static void main(String[] args) {
		Object o = "홍길동";
		//Object클래스는 데이터형 중에 가장 큰 데이터형
		/*
		 *    Object i = 1;
		 *    i = 10.5;
		 *    i = 'a';
		 *    i = new A();
		 * */
//		String s = String.valueOf(o);
//		String s = (String)o;
		String s = o.toString();
		System.out.println(s);
	}
}
