// => 정수 10개 저장 => 3의 배수
public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		//초기화
		//배열에 값 저장 => 수정 => 일반 for문 사용
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]%3 ==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("========== 출력 값 ==========");
		//저장된 값 출력 ==> 실제 값만 읽는 경우
		//향상된 for문 => JDK 1.5 이상 => 배열,컬렉션이 있는 경우 사용 가능
		//                            ---- 가변형
		for(int i:arr) System.out.print(i+" ");
		
		System.out.println("\n========== 결과 값 ==========");
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+ " ");
			}
		}
		

	}

}
