import java.util.*;

public class 문자열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = DataCollection.fileReadData("seoul_location.txt");
		String nature = DataCollection.fileReadData("seoul_nature.txt");
//		System.out.println(loc);
//		System.out.println("==========================================");
//		System.out.println(nature);
		String[] seoul = location.split("\n");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 목록 출력");
			System.out.println("2. 상세 보기");
			System.out.println("3. 명소명 검색");
			System.out.println("4. 지역별 검색");
			System.out.println("9. 프로그램 종료");
			System.out.println("===================");
			System.out.print("메뉴 선택 :");
			int menu = sc.nextInt();
			if(menu==9) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				System.out.println("============= 명소 전체 목록 =============");
				for(String loc:seoul) {
					String[] ss = loc.split("\\|");
					System.out.printf("%s.%s\n",ss[0],ss[1]);
				}
			}
			else if(menu==2) {
				System.out.println("============= 명소 상세 보기 =============");
				System.out.print("상세볼 명소 번호 입력(1~"+seoul.length+") :");
				int index = sc.nextInt();
				String[] detail = seoul[index-1].split("\\|");
				System.out.println("번호 : "+detail[0]);
				System.out.println("명소명 : "+detail[1]);
				System.out.println("설명 : "+detail[2]);
				System.out.println("주소 : "+detail[3]);
						
				
			}
			else if(menu==3) {
				System.out.println("============= 명소 검색 =============");
				System.out.print("명소 입력 : ");
				String loc = sc.next();
				for(String f:seoul) {
					String[] ss = f.split("\\|");
					if(ss[1].contains(loc)) {
						System.out.println(ss[1]);
					}
				}
			}
			else if(menu==4) {
				System.out.println("============= 지역별 검색 =============");
				System.out.println("지역 입력 : ");
				String addr = sc.next();
				for(String f:seoul) {
					String[] ss = f.split("\\|");
					if(ss[3].contains(addr)) {
						System.out.println(ss[1]+"("+ss[3]+")");
					}
				}
			}
			else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
		}

	}

}
