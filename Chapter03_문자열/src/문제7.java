
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0 , dice_number = 0;
		System.out.println("===== for =====");
		for(;;) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			count+=1;
			System.out.println("f : "+dice1+" s : "+dice2);
			if(dice1==dice2) {
				dice_number = dice1;
				break;
			}
		}
		System.out.println("dice Number :"+dice_number + ", Count : "+count);
		
		dice_number = 0;
		count = 0;
		System.out.println("===== while =====");
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			count+=1;
			System.out.println("f : "+dice1+" s : "+dice2);
			if(dice1==dice2) {
				dice_number = dice1;
				break;
			}
		}
		System.out.println("dice Number :"+dice_number + ", Count : "+count);
		
		dice_number = 0;
		count = 0;
		System.out.println("===== do~while =====");
		do {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			count+=1;
			System.out.println("f : "+dice1+" s : "+dice2);
			if(dice1==dice2) {
				dice_number = dice1;
				break;
			}
		}while(true);
		System.out.println("dice Number :"+dice_number + ", Count : "+count);
	}

}
