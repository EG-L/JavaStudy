package com.sist.client;
import com.sist.VO.FoodCategoryVO;
import com.sist.client.*;
import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/*
 * FlowLayout - JPanel
 *   -------------------
 *     버튼   버튼  버튼  버튼  ---> ... 버튼 
 *   -------------------
 * GridLayout
 *   -------------------
 *     버튼  버튼  버튼
 *     버튼  버튼  버튼
 *   -------------------
 * BorderLayout - JFrame
 *   -------------------
 *          North
 *   -------------------
 *        |       |
 *   East | Center| West
 *        |       |
 *   -------------------
 *       South
 *   -------------------
 * ---------------
 * CardLayout : 감춘다 => 클릭시 보여준다.
 * */
public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp = new MenuPanel();
	ControlPanel cp = new ControlPanel();
	JLabel logo = new JLabel();
	Login login = new Login();
	FoodManager fm = new FoodManager();
	public ClientMainForm() {
		this.setLayout(null); // 직접 배치
		logo.setBounds(10, 15, 100, 150);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 100, 150)));
		this.add(logo);
		mp.setBounds(10,175,100,250);//버튼 크기 설정, x위치,y위치,너비,높이
		this.add(mp);//JFrame에 menupanel 추가
		
		cp.setBounds(135, 15, 1500, 830);
		this.add(cp);
		this.setSize(1650,880);//JFrame 사이즈 설정
//		this.setVisible(true);//JFrame 화면 크기 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//X버튼 눌렀을 시 메모리 해제 과정 
		
		//등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		
		ArrayList<FoodCategoryVO> list = fm.foodCategoryData(1);
		cp.hp.cardPrint(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");//화면 변경
		}
		catch(Exception ex) {}
		new ClientMainForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1) {
			cp.card.show(cp,"Home");
		}
		else if(e.getSource()==mp.b2) {
			cp.card.show(cp,"Detail");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp,"Chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp,"Board");
		}
		else if(e.getSource()==mp.b5) {
			cp.card.show(cp,"News");
		}
		else if(e.getSource()==mp.b6) {
			System.exit(0);
		}
		else if(e.getSource()==login.b1) {
			login.setVisible(false);
			this.setVisible(true);
		}
	}

}
