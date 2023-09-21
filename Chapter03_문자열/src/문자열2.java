/*
 *   문자열
 *   ----- String 기능이 많다
 *   1. 문자의 갯수 확인 : length();
 * */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Java!!";
		System.out.println(s.length());//문자 개수 => 공백 포함
		if(s.startsWith("Hello")) {//서제스트
			System.out.println("포함됨");
		}

	}

}
