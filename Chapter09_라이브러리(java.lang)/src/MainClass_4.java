/*
 *   finalize() ==> 객체가 메모리 해제 시에 자동 호출
 *   
 *   소멸자
 *   A() , ~A()
 *   클래스는 1) 객체 생성(메모리 저장) A a = new A()
 *         2) 객체 기능 활용 => a.메소드명()
 *         3) 메모리 해제 => finalize() => 바로 회수가 안된다.
 *            a = null => gc대상
 * */
class A{
	public A() {
		System.out.println("A객체 생성 "+this);
	}
	
	public void action() {
		System.out.println("객체 활용...");
	}
	//GC는 바로 회수하지 않는다 => 메모리가 크기 때문에
	//메모리 회수 시 자동 호출
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("A객체 메모리 해제...");
	}
	
}
public class MainClass_4 {
	public static void main(String[] args) {
		A a = new A();
		a.action();
		a = null;//gc 대상
		System.gc(); // 직접 gc호출 ==> 멀티미디어
	}

}
