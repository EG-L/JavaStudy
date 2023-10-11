class B{
	int a = 10;
	//일반 함수 , 생성자의 경우 리턴형이 없어야 한다.
	void B(){
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
	 *     생성자 => 초기화가 필요하다. (명시적 초기화 불가능)
	 *             제어문 / 파일읽기
	 *          => 시작과 동시에 처리 => 가장 먼저 호출
	 *            ---------------
	 *                 |
	 *             자동 로그인
	 *             윈도우 화면 설정
	 *             서버 연결
	 *             데이터베이스 연결
	 * */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new B();//반드시 new 생성자
//		new B().a=100;
//		System.out.println(new B().a);
		B b = new B();
//		b.a = 100;
//		System.out.println(b.a);

	}

}
