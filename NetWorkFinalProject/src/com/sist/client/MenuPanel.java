package com.sist.client;
// Home : 맛집 카테고리 출력
// 검색 
// 채팅
// 오늘의 뉴스
//커뮤니티 ==> 파일 입출력
import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{
	public JButton b1,b2,b3,b4,b5,b6;
	public MenuPanel(){//초기화
		b1 = new JButton("Home");
		b2 = new JButton("Search");
		b3 = new JButton("Chat");
		b4 = new JButton("Community");
		b5 = new JButton("Today's News");
		b6 = new JButton("Exit");
		
		this.setLayout(new GridLayout(6,1,5,5));//레이아웃 설정 rows , columns, 높이 간격, 너비 간격 
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		
	}

}
