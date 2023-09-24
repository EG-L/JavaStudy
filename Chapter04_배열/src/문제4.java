
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] int_list = new int[10];
		double avg;
		int sum = 0;
		
		for(int i =0;i<int_list.length;i++) {
			int_list[i] = (int)(Math.random()*10)+1;
			System.out.print(int_list[i]+" ");
			sum+=int_list[i];
		}
		System.out.printf("\n평균 : "+(sum/(double)int_list.length));
		

	}

}
