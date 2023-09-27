//5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
import java.util.Arrays;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor = new int[5];
		for(int i =0;i<kor.length;i++) {
			kor[i] = (int)(Math.random()*100)+1;
		}
		int[] rank = new int[5];
		for(int i =0;i<kor.length;i++) {
			int cnt = 1;
			for(int j =0;j<kor.length;j++) {
				if(kor[i]<kor[j]) {
					cnt+=1;
				}
			}
			rank[i] = cnt;
		}
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(rank));
		
		

	}

}
