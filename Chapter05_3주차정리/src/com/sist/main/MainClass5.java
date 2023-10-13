package com.sist.main;
//캡슐화 
class Member{
	//변수 은닉화
	private int age;//0
	private String name;//null
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		//값저장
		m.setAge(20);//m.age
		m.setName("홍길동");//m.name
		
		System.out.println(m.getAge());
		System.out.println(m.getName());

	}

}
