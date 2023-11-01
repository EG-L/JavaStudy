package com.sist.client;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class MenuPanel extends JPanel{
	public JButton b1,b2,b3,b4,b5,b6;
	public MenuPanel() {
		b1= new JButton("Home");
		b2= new JButton("Search");//음악 검색
		b3= new JButton("Chat");// 채팅 접속
		b4= new JButton("Community");//커뮤니티
		b5= new JButton("Exit");//종료
		b6= new JButton("Music");//음악 실시간 검색
		
		this.setLayout(new GridLayout(6, 1, 10, 5));
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b6);
		this.add(b5);
//		JPanel p = new JPanel();
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);
//		p.add(b6);
//		this.add(p);
	}

}
