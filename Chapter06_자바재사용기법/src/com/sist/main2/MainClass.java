package com.sist.main2;
class Super{
	
}
class Sub extends Super{//int
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//묵시적 형변환 => 자동 형변환
		Super su = new Sub(); // 사용자 정의 데이터형
		//강제 형변환
		Sub s = (Sub)su;
		
		String str = "";
		StringBuffer sb = new StringBuffer();
		Object obj = new Object();
		
		//객체 비교 연산자 => instanceof
		
		if(str instanceof Object) System.out.println("true");
		else System.out.println("false");
		
		if(sb instanceof Object) System.out.println("true");
		else System.out.println("false");
		
		if(obj instanceof String) System.out.println("true");
		else System.out.println("false");
		
//		if(sb instanceof String) System.out.println("true");
//		else System.out.println("false");

	}

}
