package com.sist.seoul;
import java.util.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SeoulManager sm = new SeoulManager();
		Seoul[] s = sm.ReadSeoul();
		
		System.out.print("명소(1) , 자연(2) :");
		int no = sc.nextInt();
		
		for(Seoul ss : s) {
			System.out.println(ss.getName()+","+ss.getContent());
		}
		
		

	}

}
