class Member implements Cloneable{
	String id;
	String name;
	String pwd;
	
	public Member() {
		id = "admin";
		pwd = "1234";
		name = "홍길동";
	}
	
	public void print() {
		System.out.println("ID:"+this.id);
		System.out.println("NAME:"+this.name);
		System.out.println("PWD:"+this.pwd);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//클론 재정의 
	
}
/*
 *     Web관련 자바 공부
 *     --------------
 *      J2SE  / J2EE
 *      ----   ------
 *        |       |
 *       기본    자바웹관련
 *     toString() : 객체를 문자열로 변경
 *     clone() : 메모리 복제 => 새로운 메모리 생성
 *     finalize : 호출이 되면 메모리 해제
 *     --------- 자동 호출
 * */
public class MainClass_6 {
	public static void main(String[] args) throws Exception{
//		Member m = new Member();
//		m.print();
		
//		Member m1 = (Member)m.clone();
//		m1.print();
		Member m1 = new Member();
		m1.print();
		
		m1.id = "홍";
		m1.pwd = "h1234";
		m1.name = "홍길동";
		
//		Member m2 = new Member();
		Member m2 = (Member)m1.clone();
		//m1에 있는 ㅔㅁ모리를 그대로 복사 => 새로운 메모리 생성
		//아바타
		m2.print();
		m2.id="shim";
		m2.pwd = "s1234";
		m2.name = "심청이";
		
		m1.print();
		m2.print();
		
		
	}
}
