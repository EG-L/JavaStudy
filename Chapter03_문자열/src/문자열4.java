//charAt... 
//대문자 / 소문자 변경
import java.util.Scanner;
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		//대문자 출력
//		for(int i =0;i<s.length();i++) {
//			char c = s.charAt(i);
//			System.out.print((char)(c-32));
//		}
		System.out.println(s.toUpperCase());
		
		s = "ABCDEF";
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			System.out.print((char)(c+32));
		}
		System.out.println(s.toLowerCase());
		
		s = "aBcEFd";
		for(int i = 0; i<s.length();i++) {
			char a = s.charAt(i);
			if(a>='a'&&a<='z') System.out.print((char)(a-32));
			if(a>='A'&&a<='Z') System.out.print((char)(a+32));
		}

	}

}
