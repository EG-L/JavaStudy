/*
 * 중복 없는 난수 발생
 * => 예약일 , 예약시간 ...
 * 
 * */

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		//1~10 => 중복 없이 발생
		int su = 0;// 난수 저장 변수
		boolean bCheck = false; // 중복 여부 확인
		
		for(int i =0; i<arr.length;i++) {
			bCheck = true;
			//------------- 난수 발생
			// bCheck = true => 난수 발생 bCheck = false면 종료
			while(bCheck) {
				su = (int)(Math.random()*10)+1;
				bCheck= false;
		    // 비교 => arr에 저장된 값과 난수가 같은지 확인
				for(int j = 0; j<i;j++) {//저장된 개수 i
					if(arr[j]==su) {
						bCheck=true;
						break;
					}//같은 수 확인
				}
			}
			arr[i] = su;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
