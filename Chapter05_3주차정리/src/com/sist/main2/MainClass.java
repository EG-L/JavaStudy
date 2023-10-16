package com.sist.main2;
/*
 *   static메소드 / 인스턴스 메소드
 *   ----------   => 인스턴스나 static 상관없이 사용이 가능
 *      |static 변수, static 메소드를 호출
 *       인스턴스 변수 , 인스턴스 메소드는 반드시 객체 생성후에 사용
 *   => 클래스 생성 => 객체 생성 => 자동으로 this(자신의 객체명)
 *                                     |
 *                                    지역변수 / 멤버변수 구분
 *                               ** 변수가 동일한 이름이면 지역변수 우선 순위
 *                               ** 지역변수 , 매개변수 찾고 => 없는 경우 멤버변수에서 찾는다.
 *   예) 
 *       class A
 *       {
 *           int a=20; => 메모리 저장 위치가 다르다.
 *                        Heap
 *           void display()
 *           {
 *              int a=10; => Stack
 *              System.out.println(a);//지역변수
 *              System.out.println(this.a);//매개변수
 *                                 
 *              
 *           }
 *           void display(int a)
             {           ------- 지역변수의 일종 stack
                 System.out.println(this.a);
 *           }
 *       }
 *       
 *       ===> this : 객체
 *            this() => 생성자 (자신의 생성자를 호출할 때 사용)
 *            ------
 *            => 생성자에서 사용이 가능
 *            => 생성자 첫줄에 온다.
 *       class A
 *       {
 *           A(){
 *           }
 *           A(int a)
 *           {
 *              this(); => super() <<= 첫 줄에 와야 한다.
 *              System.out.println("aaa");
 *              this(); 오류 발생
 *           }
 *       }
 *       
 * */
class Student{
	int hakbun; //0
	String name;//null
	String sex;//null
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자 호출..");
		this.hakbun = 1;
		// Student가 가지고 있는 멤버변수
		this.name="홍길동";
		sex="남자";
		//지역 변수와 충돌이 없는 경우 this. 을 생략할 수 있다.
	}
	public Student(int hakbun,String name) {
		//구분자 멤버변수와 지역변수를 구분할 때 많이 사용
		this.hakbun = hakbun;
		this.name = name;
	}
	public Student(String sex) {
		this();
		this.sex = sex;
	}
	public Student(int h,String n,String s) {
		this(s);
//		hakbun = h;
//		name = n;
//		sex = s;
		
	}
	public void print() {
		System.out.println("학번 :"+hakbun);
		System.out.println("이름 :"+name);
		System.out.println("성별 :"+sex);
	}
	// 오버로딩 => 같은 메소드명으로 새로운 기능을 추가
	/*
	 *    void display(int a,int b,int c)
	 *    void display(char c, double d, int a)
	 *    void display(double d, double d1, double d2)
	 *    
	 *    display(10.5,'A',100)=>double,char,int
	 *    
	 *    void aaa(int a)
	 *    
	 *    => aaa(10),aaa('A')
	 * */
}
public class MainClass {
	void display(int a,int b,int c) {System.out.println("display(int a,int b,int c) call..");}
	void display(char c, double d, int a) {System.out.println("display(char c, double d, int a) call..");}
	void display(double d, double d1, double d2) {System.out.println("display(double d, double d1, double d2) call..");}
	void display(double d, int d1, int d2) {System.out.println("display(double d, int d1, int d2) call..");}
	void display(double d, char d1, int d2) {System.out.println("display(double d, char d1, int d2) call..");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// default 생성자
		// 0 null null
//		Student std = new Student();
//		std.print();
//		Student std1 = new Student("여자");
//		std1.print();
//		Student std2 = new Student(1234,"심청스");
//		std2.print();
//		Student std3 = new Student(12345,"김나박이","여자");
//		std3.print();
		MainClass m = new MainClass();
		m.display(10.5, 10, 'A');

	}

}
