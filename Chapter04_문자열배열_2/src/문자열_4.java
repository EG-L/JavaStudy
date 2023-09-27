import java.util.Scanner;
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={
            "Your Lights",
			"겨울잠",
			"우린 어쩌다 헤어진 걸까",
			"요즘",
			"VVS (Feat. JUSTHIS) (Prod. by GroovyRoom)",
			"Dynamite",
			"밤하늘의 별을 (2020)",
			"첫사랑 (Feat. SOLE (쏠))",
			"Life Goes On",
			"이제 나만 믿어요",
			"나로 바꾸자 (Duet With JYP)",
			"잠이 오질 않네요",
			"What Do I Call You",
			"ON AIR (Feat. 로꼬 & 박재범 & GRAY)",
			"오래된 노래",
			"한잔이면 지워질까",
			"힘든 건 사랑이 아니다",
			"For You (Feat. Crush)",
			"Savage Love (Laxed - Siren Beat) (BTS Remix)",
			"취기를 빌려 (취향저격 그녀 X 산들)",
			"HERO",
			"Lovesick Girls",
			"서로를 위한 것",
			"뻔한남자",
			"내일이 오면 (Feat. 기리보이 & BIG Naughty (서동현))",
			"작은 것들을 위한 시 (Boy With Luv) (Feat. Halsey)",
			"잘할게",
			"CREDIT (Feat. 염따 & 기리보이 & Zion.T)",
			"어느 60대 노부부이야기",
			"만개 (Prod. 신지후)",
			"악역 (Feat. 이하이 & 사이먼 도미닉) (Prod. by 코드 쿤스트)",
			"혼술하고 싶은 밤",
			"흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야",
			"오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)",
			"오래된 노래",
			"살았소",
			"그날에 나는 맘이 편했을까",
			"나보다 더 사랑해요",
			"입김",
			"모든 날, 모든 순간 (Every day, Every Moment)",
			"바램",
			"내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)",
			"가을밤에 든 생각",
			"이제 나만 믿어요 (Piano by 조영수)",
			"뿌리 (Feat. JUSTHIS) (Prod. by GroovyRoom)",
			"에잇 (Prod. & Feat. SUGA of BTS)",
			"아무도 잠들지 마라 (Nessun Dorma)",
			"늦은 밤 너의 집 앞 골목길에서",
			"Achoo (Feat. pH-1 & HAON) (Prod. by GroovyRoom)",
			"Blueming"
		};
		String[] singer={
		  "이수 (엠씨더맥스)",
		  "장덕철",
		  "허각",
		  "양다일",
		  "미란이 (Mirani) & 먼치맨 & Khundi Panda & 머쉬베놈 (MUSHVENOM)",
		  "방탄소년단",
		  "경서",
		  "정준일",
		  "방탄소년단",
		  "임영웅",
		  "비",
		  "장범준",
		  "태연 (TAEYEON)",
		  "릴보이 (lIlBOI)",
		  "임영웅",
		  "황인욱",
		  "임창정",
		  "이하이",
		   "Jawsh 685 & Jason Derulo & 방탄소년단",
		   "산들",
		   "임영웅",
		   "BLACKPINK",
		   "나얼",
		   "이승기",
		   "릴보이 (lIlBOI)",
		   "방탄소년단",
		   "이승기",
		   "릴보이 (lIlBOI)",
		   "임영웅",
		   "김호중",
		   "스윙스 (Swings)",
		   "벤",
		   "장범준",
		   "마크툽 (Maktub)",
		   "Standing Egg (스탠딩 에그)",
		   "김호중",
		   "이예준","김호중","10CM","폴킴","임영웅","규현 (KYUHYUN)","잔나비","임영웅",
		   "Khundi Panda","아이유 (IU)","김호중","노을","미란이 (Mirani)","아이유 (IU)"
		};
		String[] album={
		  "Your Lights (바이크 원정대 OST Part.1)","겨울잠","Hello","요즘",
		  "쇼미더머니 9 Episode 1","Dynamite (DayTime Ver.)","밤하늘의 별을 (2020)",
		  "첫사랑","BE","내일은 미스터트롯 우승자 특전곡","나로 바꾸자","잠이 오질 않네요",
		  "What Do I Call You - The 4th Mini Album","쇼미더머니 9 Final",
		  "사랑의 콜센타 Part19","한잔이면 지워질까","힘든 건 사랑이 아니다",
		  "For You","Savage Love (Laxed - Siren Beat) (BTS Remix)",
		  "취기를 빌려 (취향저격 그녀 X 산들)","HERO","THE ALBUM",
		  "서로를 위한 것","뻔한남자","쇼미더머니 9 Episode 3","MAP OF THE SOUL : PERSONA",
		  "The Project","쇼미더머니 9 Final","내일은 미스터트롯 트롯 에이드 베스트",
		  "우리家","쇼미더머니 9 Semi Final","혼술하고 싶은 밤","멜로가 체질 OST Part 3 (JTBC 금토 드라마)",
		  "Red Moon : To You My Light","오래된 노래","살았소","그날에 나는 맘이 편했을까",
		  "나보다 더 사랑해요","5.1",
		  "'키스 먼저 할까요?' OST Part. 3 (SBS 월화드라마)","내일은 미스터트롯 예선곡 베스트",
		  "내 마음이 움찔했던 순간 (취향저격 그녀 X 규현)","잔나비 소곡집 l","이제 나만 믿어요",
		  "쇼미더머니 9 Episode 3","에잇","The Classic Album","늦은 밤 너의 집 앞 골목길에서",
		  "쇼미더머니 9 Episode 3","Love poem"
		};
		
		String[] state={
			"유지","유지","유지","유지","유지",
			"유지","유지","유지","상승","상승",
			"하강","하강","상승","상승","상승",
			"상승","상승","상승","하강","하강",
			"상승","상승","상승","상승","상승",
			"상승","상승","상승","하강","하강",
			"상승","상승","상승","상승","상승",
			"상승","상승","상승","상승","상승",
			"하강","하강","상승","상승","상승",
			"상승","상승","상승","상승","상승",
			"상승","상승","상승","상승","상승",
			"상승","하강","하강","하강","하강",
			"상승","상승","상승","상승","상승",
			"상승","상승","상승","상승","상승",
			"하강","하강","상승","상승","하강",
			"하강","상승","상승","상승","상승",
			"하강","하강","상승","상승","상승",
			"상승","하강","하강","상승","상승",
			"상승","상승","하강","하강","상승",
			"상승","상승","상승","상승","상승"
		};
		
		 int[] modify={
			0,0,0,0,0,
			0,0,0,2,2,
			1,1,7,7,2,
			2,3,3,4,4,
			26,26,20,20,8,
			8,32,32,7,7,
			20,20,23,23,23,
			23,16,16,28,28,
			12,12,30,30,30,
			30,48,48,34,34,
			12,12,18,18,14,
			14,16,16,19,19,
			39,39,7,7,27,
			27,61,61,31,31,
			21,21,26,26,21,
			21,23,23,27,27,
			25,25,5,5,44,
			44,26,26,6,6,
			9,9,28,28,38,
			38,7,7,15,15
		};
		//전체목록 출력 => 배열이 여러 개 => index
		 //title, singer, album,state, modify
		for (int i = 0;i<title.length;i++) {
			String id = "";
			if(state[i].equals("유지")) {
				id="-";
			}
			else if(state[i].equals("상승")) {
				id="▲ "+modify[i];
			}
			else {
				id="▽ "+modify[i];
			}
			System.out.printf("%d.%s %s %s\n",i+1,id,title[i],singer[i]);
		}
		System.out.println("=====================================================");
		Scanner sc = new Scanner(System.in);
		// 1. 순위가 가장 많이 상승한 노래의 제목과 가수명을 출력
		int max = 0;
		for(int i =0;i<title.length;i++) {
			if(state[i].equals("상승")) {
				if(modify[i]>max) {
					max = modify[i];
				}
			}
		}
		System.out.println(max);
		for(int i =0;i<title.length;i++) {
			if(max==modify[i]) {
				System.out.println(title[i]+" "+singer[i]);
			}
		}
		System.out.println("====================================================");
		// 노래명중에 가장 긴 제목의 노래와 가수명, 앨범명 출력
		max = 0;
		String name = "",alb ="";
		for(int i = 0; i<title.length;i++) {
			if(title[i].length()>max) {
				max = title[i].length();
				name = singer[i];
				alb = title[i];
			}
		}
		System.out.println(name+" "+alb);
		for(String t:title) {
			if(max<t.length()) {
				max = t.length();
			}
		}
		int i =0;
		for(i=0;i<title.length;i++) {
			if(max==title[i].length()) {
				break;
			}
		}
		System.out.println("가장 긴 노래 명 : "+title[i]);
		System.out.println("가수명 : "+singer[i]);
		System.out.println("앨범명 : "+album[i]);
		// 문자의 갯수 => length
		System.out.println("====================================================");
		// 노래 중에 순위 상승한 노래명만 출력 하시오
		//1
		for(i =0; i<title.length;i++) {
			if(state[i].equals("상승")) {
				System.out.println(title[i]);
			}
		}
		//2
		for(i = 0; i<title.length;i++) {
			if(state[i]=="상승") System.out.println(title[i]);
		}
		int cnt = 0;
		for(i = 0; i<title.length;i++) {
			if(state[i]=="하강") cnt++;
		}
		System.out.printf("하강한 개수 : %d",cnt);
		System.out.println("\n====================================================");
		// 임영웅의 노래 제목을 출력하시오.
		cnt = 0;
		for(i = 0;i<title.length;i++) {
			if(singer[i].contains("임영웅")) System.out.printf("%s %s\n",singer[i],title[i]);
		}
		System.out.println("\n====================================================");
		// 검색어를 입력 받아 검색어가 포함되어 있는 노래 명 출력
		System.out.print("검색어 입력 : ");
		String temp = sc.next();
		for(i=0;i<title.length;i++) {
			if(title[i].contains(temp)) {
				System.out.println(singer[i]+" "+title[i]);
			}
		}

	}

}
