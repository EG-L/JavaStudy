// 100번의 알파벳 난수 발생 => A,B,C의 개수
public class 제어문_반복문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A_Check = 0,B_Check = 0,C_Check= 0;
		// 갯수 ++ , 누적 += ==> 빈도수 계산
		for(int i =0;i<100;i++) {
			char c = (char)((Math.random()*26)+65);
			
			if(c=='A') A_Check+=1;
			else if(c=='B') B_Check+=1;
			else if(c=='C') C_Check+=1;
		}
		System.out.printf("A의 개수 : %d, B의 개수 : %d, C의 개수 : %d",A_Check,B_Check,C_Check);

	}

}
