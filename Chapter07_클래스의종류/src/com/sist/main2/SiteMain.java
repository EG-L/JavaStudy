package com.sist.main2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map map = new HashMap();
		map.put("c1", new MemberController());
		map.put("c2", new BoardController());
		map.put("c3", new MovieController());
		map.put("c4", new MusicController());
		map.put("c5", new SeoulController());
		Controller[] c1 = {new MemberController(),new BoardController(),new MovieController(),new MusicController(),new SeoulController()};
		while(true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 회원 관리");
			System.out.println("2. 게시판");
			System.out.println("3. 영화");
			System.out.println("4. 음악");
			System.out.println("5. 서울 여행");
			System.out.println("6. 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택 :");
			int menu = sc.nextInt();
			if(menu == 6) {
				System.out.println("프로그램 종료");
				break;
			}
			Controller c = (Controller)map.get("c"+menu);
			c.execute();
			c1[menu-1].execute();
//			Controller c = null;
//			if(menu==1) {
//				c = new MemberController();
//			}
//			else if(menu==2) {
//				c = new BoardController();
//			}
//			else if(menu==3) {
//				c = new MovieController();
//			}
//			else if(menu==4) {
//				c = new MusicController();
//			}
//			else if(menu==5) {
//				c = new SeoulController();
//			}
//			else{
//				System.out.println("프로그램 종료");
//				break;
//			}
//			c.execute();
			
		}

	}

}
