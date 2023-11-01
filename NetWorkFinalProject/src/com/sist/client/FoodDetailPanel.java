package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import com.sist.VO.*;
import com.sist.manager.*;
public class FoodDetailPanel extends JPanel{
	JLabel posterLa;
	JLabel nameLa,scoreLa;
	JLabel addressLa,phoneLa,typeLa;
	JLabel timeLa,parkingLa,priceLa;
	JLabel menu;
	JButton b;
	ControlPanel cp;
	JLabel la1,la2,la3,la4,la5,la6,la7;
	public FoodDetailPanel(ControlPanel cp) {
		this.cp = cp;
		posterLa = new JLabel();
		nameLa = new JLabel();
		scoreLa = new JLabel();
		addressLa = new JLabel();
		phoneLa = new JLabel();
		typeLa = new JLabel();
		timeLa = new JLabel();
		parkingLa = new JLabel();
		priceLa = new JLabel();
		
		b = new JButton("목록");
		la1 = new JLabel("주소");
		la2 = new JLabel("전화");
		la3 = new JLabel("음식종류");
		la4 = new JLabel("가격대");
		la5 = new JLabel("주차");
		la6 = new JLabel("영업시간");
		la7 = new JLabel("메뉴");
		
		//배치
		this.setLayout(null);
		posterLa.setBounds(10, 15, 300, 500);
		this.add(posterLa);
		nameLa.setBounds(320, 15, 300, 35);
		scoreLa.setBounds(330, 15, 40, 35);
		this.add(nameLa);
		this.add(scoreLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		//전화
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
		la1.setBounds(320, 60, 70, 35);
		addressLa.setBounds(395, 60, 400, 35);
		this.add(la1);
		this.add(addressLa);
		
	}

}
