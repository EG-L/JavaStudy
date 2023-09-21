import java.util.Scanner;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 123456789
		while(true) {
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			if(menu<1||menu>9) {
				System.out.println("없는 메뉴입니다.");
				continue; // 없는 메뉴 선택 시 처음부터 다시 실행
			}
//			if(menu==9) System.exit(0); => 프로그램 전체 종료
			if(menu==9) break;//while문만 종료
			System.out.println(menu+"번 메뉴를 선택하셨습니다.");
		}
		System.out.println("프로그램 종료");

	}

}
