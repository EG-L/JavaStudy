package com.sist.main2;
class Super{
	
}
class Sub extends Super{
	
}
//NullPointerException => Null값이 존재할 때 
public class MainClass4 {
	static String str ="Hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s = new Sub();
		Sub ss = (Sub)s; // ClassCastException (형변환 에러)
		
		Super sss = new Super();
		char c = str.charAt(0);
		System.out.println(c);
	}

}
