/*
 * 문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 * */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = ((int)(Math.random()*2))==0?(char)((Math.random()*26)+65):(char)((Math.random()*26)+97);
		//                                          ---------------------         ----------------------
		//                                                 대문자                           소문자
		
		if(c>='a'&&c<='z')System.out.println(c+" : 소문자");
		if(c>='A'&&c<='Z')System.out.println(c+" : 대문자");
	}

}
