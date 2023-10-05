//중복없는 난수
//로또 => 6개의 정수 중복없이 출력(1~45) => 출력
public class 메소드4 {
	public static int[] getRand() {
		int[] lotto = new int[6];
		for(int i = 0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	public static void print(int[] lotto) {
		for(int i:lotto) {
			System.out.print(i+" ");
		}
	}
	public static void process() {
		print(getRand());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
