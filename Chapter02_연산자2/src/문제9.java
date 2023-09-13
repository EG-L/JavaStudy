
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2,num2 = 7;
		int num3,num4;
		num1++;
		// num1 = 3
		num3 = --num1; // num3 = 2
		--num2;//6
		num4 = num2++; //num4 = 6
		System.out.printf("%d\n",num3); // 2
		System.out.printf("%d\n",num4); // 6
	}

}
