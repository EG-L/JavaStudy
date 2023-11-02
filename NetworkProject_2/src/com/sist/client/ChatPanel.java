package com.sist.client;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;
public class ChatPanel extends JPanel{
	JTable table1,table2;
	DefaultTableModel model1,model2;//테이블모델 선언
	JTextArea pane;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6;
	JLabel image,image2;
	JScrollBar bar;
	public ChatPanel() {
		setLayout(null);
		String[] col1 = {"방이름","상태","인원"};
		String[][] row1 = new String[0][3];
		
		model1 = new DefaultTableModel(row1,col1);
		table1 = new JTable(model1);
		
		JScrollPane js = new JScrollPane(table1);
		js.setBounds(365,15,450,350);
		this.add(js);
		
		String[] col2 = {"ID","이름","성별","위치"};
		String[][] row2 = new String[0][4];
		
		model2 = new DefaultTableModel(row2,col2);
		table2 = new JTable(model2);
		
		JScrollPane js2 = new JScrollPane(table2);
		js2.setBounds(365, 375, 450, 300);
		this.add(js2);
		
		pane = new JTextArea();
		JScrollPane js3 = new JScrollPane(pane);
		
		bar=js3.getVerticalScrollBar();
		
		pane.setEditable(false);
		js3.setBounds(825,15,380,310);
		this.add(js3);
		
		tf = new JTextField();
		tf.setBounds(825, 330, 380, 30);
		this.add(tf);
		
		image = new JLabel();
		image.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\java_data\\catimage.png"), 300, 600)));
		image.setBounds(70,70,300,600);
		
		image2 = new JLabel();
		image2.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\java_data\\catfootprint.png"), 300, 600)));
		image2.setBounds(1150,70,300,600);
		
		b1 = new JButton("방만들기");
		b2 = new JButton("방들어가기");
		b3 = new JButton("쪽지보내기");
		b4 = new JButton("정보보기");
		b5 = new JButton("1:1 채팅");
		b6 = new JButton("채팅 종료");
		
		JPanel p = new JPanel(new GridLayout(3, 2, 10, 40));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setBounds(825, 370, 380, 310);
		this.add(p);
		this.add(image);
		this.add(image2);		
	}
}
