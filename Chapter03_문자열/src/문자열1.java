/*
 *  문자열
 *  문자 '' => 한글자 저장 => char
 *      'a','b','c' ==> 한번에 저장이 가능 String => ""
 *  일반데이터형
 *  String name = "홍길동"; ==> 제어
 *  클래스형
 *    기능 => 메소드
 *  => 웹은 데이터형이 존재하지 않는다. => 문자열
 *  "1"
 *  <input type=text>
 * */
import java.util.Scanner;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장
		String name = "홍길동";
		System.out.println(name);
		char a = name.charAt(0);
		char b = name.charAt(1);
		char c = name.charAt(2);
		System.out.println(a+""+b+""+c);
		
		String addr = "서울특별시 마포구 월드컵북로4길 26 1F";
		System.out.println(addr);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 : ");
		String findData = sc.next();
		System.out.println(findData);


	}

}
