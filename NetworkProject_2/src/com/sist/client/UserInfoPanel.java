package com.sist.client;

import java.util.ResourceBundle.Control;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sist.common.ImageChange;

public class UserInfoPanel extends JFrame{
	JLabel la1,la2,la3,la4,la5,la6,la7,la8;
	JLabel img;
	public UserInfoPanel() {
		
		img = new JLabel();
		img.setBounds(10, 15, 90, 90);
		la1 = new JLabel("ID");
		la2 = new JLabel("이름");
		la3 = new JLabel("성별");
		la4 = new JLabel("위치");
		
		la5 = new JLabel();
		la6 = new JLabel();
		la7 = new JLabel();
		la8 = new JLabel();
		
		la1.setBounds(110, 15, 70, 30);
		la2.setBounds(110, 55, 70, 30);
		la3.setBounds(110, 95, 70, 30);
		la4.setBounds(110, 135, 70, 30);
		la5.setBounds(200, 15, 150, 30);
		la6.setBounds(200, 55, 150, 30);
		la7.setBounds(200, 95, 150, 30);
		la8.setBounds(200, 135, 150, 30);
		
		this.setLayout(null);
		this.setSize(400,200);
		this.add(img);
		this.add(la1);
		this.add(la2);
		this.add(la3);
		this.add(la4);
		this.add(la5);
		this.add(la6);
		this.add(la7);
		this.add(la8);
		this.setResizable(false);
		this.setVisible(true);
	}
	//ID,이름,성별,위치
	public void UserData(String[] info) {
		System.out.println(info[0]);
		this.la5.setText(info[0]);
		this.la6.setText(info[1]);
		this.la7.setText(info[2]);
		this.la8.setText(info[3]);
		if(info[2].equals("남자")) {
			img.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\java_data\\Man1.png"), 90, 90)));
		}
		else {
			img.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\java_data\\Woman1.png"), 90, 90)));
		}
	}

}
