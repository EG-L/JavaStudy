package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.VO.FoodCategoryVO;
import com.sist.VO.FoodHouseVO;
import com.sist.manager.FoodManager;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
	JButton b1,b2,b3;
	PosterCard[] psc = new PosterCard[12];
	FoodManager fm =new FoodManager();
	JPanel pan = new JPanel();
	ControlPanel cp;
	
	public HomePanel(ControlPanel cp) {
		this.cp = cp;
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3,5,5));
		b1 = new JButton("믿고 보는 맛집 리스트");
		b1.setPreferredSize(new Dimension(300,45));
		b2 = new JButton("지역별 인기 맛집");
		b2.setPreferredSize(new Dimension(300,45));
		b3 = new JButton("메뉴별 인기 맛집");
		b3.setPreferredSize(new Dimension(300,45));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		pan.setLayout(new GridLayout(4,3,5,5));
		//배치
		this.setLayout(new BorderLayout());
		this.add("North",p);
		this.add("Center",pan);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void cardPrint(ArrayList<FoodCategoryVO> list) {
		int i = 0;
		for(FoodCategoryVO vo:list) {
			psc[i] = new PosterCard(vo);
			pan.add(psc[i]);
			psc[i].addMouseListener(this);
			i++;
		}
	}
	public void cardInit() {
		pan.removeAll();//데이터 제거
		pan.repaint();
		pan.revalidate();// panel 재배치
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			ArrayList<FoodCategoryVO> list = fm.foodCategoryData(1);
			cardInit();
			cardPrint(list);
		}
		else if(e.getSource()==b2) {
			ArrayList<FoodCategoryVO> list = fm.foodCategoryData(2);
			FoodCategoryVO fvo = new FoodCategoryVO();
			fvo.setPoster(null);
			fvo.setTitle("");
			for(int i = 0; i<6;i++) {
				list.add(fvo);
			}
			cardInit();
			cardPrint(list);
		}
		else if(e.getSource()==b3) {
			ArrayList<FoodCategoryVO> list = fm.foodCategoryData(3);
			cardInit();
			cardPrint(list);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i<psc.length;i++) {
			if(e.getSource()==psc[i]) {
				if(e.getClickCount()==2) {
					String title = psc[i].tLa.getText();
					FoodCategoryVO vo = fm.categoryInfoData(title);
					cp.fcp.la1.setText(vo.getTitle());
					cp.fcp.la2.setText(vo.getSubject());
					ArrayList<FoodHouseVO> list = fm.foodHouseListData(vo.getCno());
					cp.fcp.foodPrint(list);
					cp.card.show(cp, "catefood");
				}
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
