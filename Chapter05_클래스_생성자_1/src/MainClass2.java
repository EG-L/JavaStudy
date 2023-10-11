import java.util.*;
class Student{
	//heap => 프로그램 종료시까지 메모리 유지 => 다른 클래스에서 사용이 가능
	String name;//null
	int kor,eng,math;//0,0,0 ==> heap
	//매개변수/지역변수 => Stack
	Student(String name,int kor, int eng, int math){
		// 매개변수 / 지역변수 => 메소드안에서만 사용이 가능 => 자동 메모리 삭제
		this.name = name;//자신의 객체 => this
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		// 지역변수, 매개변수 => 멤버 변수에서 찾는다.
		name= "aaa"; //지역변수
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<std.length;i++) {
			System.out.print((i+1)+"번 째 이름 입력 : ");
			String name = sc.next();
			System.out.print((i+1)+"번 째 국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.print((i+1)+"번 째 영어 점수 입력 : ");
			int eng = sc.nextInt();
			System.out.print((i+1)+"번 째 수학 점수 입력 : ");
			int math = sc.nextInt();
			
			std[i] = new Student(name,kor,eng,math);
			
		}
		
		for(int i = 0; i<std.length;i++) {
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",std[i].name,std[i].kor,std[i].eng,std[i].math,std[i].kor+std[i].eng+std[i].math,(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	}

}
