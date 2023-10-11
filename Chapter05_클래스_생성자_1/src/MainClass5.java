import java.util.*;
// 사용자 정의 데이터형
class Join{
	int mno;
	String name;
	String addr;
	String phone;
	
	Join(int mno, String name, String addr, String phone){
		this.mno = mno;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
}
class JoinSystem{
	static Join[] member = new Join[5];
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinSystem js = new JoinSystem();
		
		Join j = new Join(1,"홍길동","서울","010-1234-1234");
		js.member[0] = j;
		
		for(int i = 0; i<js.member.length;i++) {
			if(js.member[i]!=null) {
				System.out.println(js.member[i].name);
			}
		}
		System.out.println("===========================");
		JoinSystem js2 = new JoinSystem();
		Join j1 = new Join(1,"심청스","경기","010-2222-2222");
		js2.member[1] = j1;
		
		for(int i = 0; i<js2.member.length;i++) {
			if(js2.member[i]!=null) {
				System.out.println(js2.member[i].name);
			}
		}
		
		
	}

}
