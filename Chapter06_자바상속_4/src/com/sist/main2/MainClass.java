package com.sist.main2;
import java.util.*;
import com.sist.main2.*;
public class MainClass {
	//I i = new A();
	//데이터형 => 데이터형을 동일하게 만들어준다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("클래스 선택 :");
		int select = sc.nextInt();
		I[] i = {null,new A(),new B(),new C(),new D(),new E()};
		i[select].execute();
//		if(select==1) {
//			A a = new A();
//			a.execute();
//		}
//		else if(select==2) {
//			B b = new B();
//			b.execute();
//		}
//		else if(select==3) {
//			C c = new C();
//			c.execute();
//		}
//		else if(select==4) {
//			D d = new D();
//			d.execute();
//		}
//		else {
//			E e = new E();
//			e.execute();
//		}
		

	}

}
