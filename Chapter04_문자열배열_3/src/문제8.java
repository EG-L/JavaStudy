import java.util.Arrays;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[26];
		for(int i = 0;i<alpha.length;i++) alpha[i] = (char)(i+65);
		System.out.println(Arrays.toString(alpha));
		
		for(int i = alpha.length-1;i>=0;i--) {
			System.out.print(alpha[i]+" ");
		}

	}

}
