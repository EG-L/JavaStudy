package com.sist.main;
class Sawon{
	int sabun;
	String name;
}

//메모리주소 전송 => 메모리 주소에 있는 변수값 변경
//call by reference
//클래스 => 데이터베이스에 있는 값을 채워 온다. => 매개변수를 이용해서 처리
//배열 / 클래스는 모두 적용이 된다. (예외 : String => 일반 변수 취급)
public class MainClass4 {
	static void change(Sawon sa) {// Sawon sa = s
		sa.sabun = 2;
		sa.name = "이순신";
		//원본 변경
		//기본형 => 복사본 => 값만 전송 ( call by value)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s = new Sawon();
		s.sabun = 1;
		s.name = "김나박이";
		
		System.out.println(s.sabun);
		System.out.println(s.name);
		
		change(s);
		
		System.out.println(s.sabun);
		System.out.println(s.name);

	}

}
