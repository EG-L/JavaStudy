/*
 *   while
 *   ------
 *     => 10개의 난수 발생 =>1~100 사이
 *     => 최대값 / 최소값
 * */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1;
		int min = 100;
		int i = 1;//루프변수
		while(i<11) {
			int temp = (int)(Math.random()*100)+1;
			System.out.print(temp+" ");
			if(temp>max) max=temp;
			if(temp<min) min=temp;
			
			i++;
		}
		System.out.printf("\n최대값 : %d, 최소값 : %d",max,min);

	}

}
