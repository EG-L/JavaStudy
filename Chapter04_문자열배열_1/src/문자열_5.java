/*
 *   split => String[]
 * */
import java.util.*;
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actor = "하정우|임시완|배성우|김상호";
//		String[] movie = actor.split(",");
//		for(String s:movie) System.out.println(s);
		String[] moive = actor.split("\\|");// =>  |를 읽을 때는 \\ 2개 사용
		
		System.out.println(actor.replace('|', ',').split(",")[0]);//replace로 변환 후 출력
		
		System.out.println(moive[0]);
		
		String name = " Hello Java ";
		
		System.out.println(name.trim());// 입력 시
		// 좌우에 있는 공백 제거
		
		System.out.println(name.replace(" ", ""));
		//replace = 원하는 문자 변경
		String s = "Hello Java";
		
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s);
		
		//문자열 결합
		String msg = "나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20) {
			msg=msg.substring(0,20)+"...";
			msg=msg.substring(0,20).concat("...");
		}
		System.out.println(msg);

	}

}
