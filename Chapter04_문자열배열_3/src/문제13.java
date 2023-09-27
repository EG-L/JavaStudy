import java.util.Arrays;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor = new int[3];
		int[] math = new int[3];
		int[] eng = new int[3];
		int[] sum = new int[3];
		double[] avg = new double[3];
		for(int i =0; i<kor.length;i++) {
			kor[i] = (int)(Math.random()*100)+1;
			math[i] = (int)(Math.random()*100)+1;
			eng[i] = (int)(Math.random()*100)+1;
			
			sum[i] = kor[i]+math[i]+eng[i];
			avg[i] = sum[i]/3.0;
		}
		int[] rank = new int[3];
		for(int i = 0; i<kor.length;i++) {
			int cnt = 1;
			for(int j = 0; j<kor.length;j++) {
				if(sum[i]<sum[j])cnt+=1;
			}
			rank[i] = cnt;
		}
		System.out.println("총 점 : "+Arrays.toString(sum));
		System.out.println("평 균 : "+Arrays.toString(avg));
		System.out.println("등 수 : "+Arrays.toString(rank));
		int sum_kor = 0,sum_math = 0,sum_eng = 0;
		for(int i = 0 ; i<rank.length;i++) {
			sum_kor+=kor[i];
			sum_math+=math[i];
			sum_eng+=eng[i];
		}
		System.out.println("국어 총합 : "+sum_kor);
		System.out.println("영어 총합 : "+sum_eng);
		System.out.println("수학 총합 : "+sum_math);

	}

}
