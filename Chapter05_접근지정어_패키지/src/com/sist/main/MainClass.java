package com.sist.main;
//패키지가 다르면 => 반드시 클래스 사용시에 import
import com.sist.manager.*;// Student , StudentSystem을 사용할 수 있다.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss = new StudentSystem();
		ss.input();
		for(Student s:ss.std) {
			System.out.println(s.hakbun);
			System.out.println(s.name);
			System.out.println(s.kor);
			System.out.println(s.eng);
			System.out.println(s.math);
			System.out.println("===============");
		}

	}

}
