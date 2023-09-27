/*
 *  substring() => 문자를 자를 때
 *  
 *    "Hello Java"
 *     0123456789
 *     
 *     substring(6) => Java
 *     substring(0,5) => Hello
 *                --- 맨 마지막 번호 제외
 * */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
//		String s1 = s.substring(0,5); // Hello
//		String s1 = s.substring(6); // Java
//		String s1 = s.substring(0,20);
//		
//		System.out.println(s1);
//		
//		String addr = s.substring(0,s.indexOf("지번")-1);
//		
//		System.out.println(addr);
//		
//		addr = s.substring(s.indexOf("지번")+3);
//		
//		System.out.println(addr);
//		
//		addr = s.substring(s.indexOf("신사동"),s.indexOf("신사동")+3);
//		System.out.println(addr);
//		
//		int a = s.lastIndexOf(" ");
//		System.out.println(s.substring(a-3,a));
		
		String ext = "Hello.Java.java";
		s = ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(s);
//		
//		System.out.println(s1);
//		

	}

}
