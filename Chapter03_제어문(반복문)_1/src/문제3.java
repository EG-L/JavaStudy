/*
 * B,D,F,H,J..,N을 출력하는 프로그램
 * */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='B';c<='N';c+=2) {
			System.out.print(c!='N'?c+",":c);
		}

	}

}
