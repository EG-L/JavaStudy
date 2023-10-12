package com.sist.manager;
//같은 패키지 상에 있을 때 => default/public/protected
//import를 사용하지 않는다.
//
import java.util.*;
/*
 *     캡슐화 / 오버라이딩 / 상속 / 포함
 *     ----   -------         ---
 *                       | POJO(상속이 없는 클래스)
 *     *** 1)결합성
 *     2)응집성
 *     ** 3)가독성
 *     4)최적화
 * */
public class StudentSystem {
	public static Student[] std = new Student[3];
	//입력 
	// 메소드 => 1) 멤버메소드 2) static메소드 3) 생성자
	// 접근지정어 => public
	public void input() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<std.length;i++) {
			std[i] = new Student();
			System.out.print("학번 입력 :");
			std[i].hakbun = sc.nextInt();
			System.out.print("이름 입력 :");
			std[i].name = sc.next();
			System.out.print("국어 점수 입력 :");
			std[i].kor = sc.nextInt();
			System.out.print("영어 점수 입력 :");
			std[i].eng = sc.nextInt();
			System.out.print("수학 점수 입력 :");
			std[i].math = sc.nextInt();
			
		}
	}

}
