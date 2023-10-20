package com.sist.client;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.table.*;
public class ChatPanel extends JPanel{
	JTable table1,table2;
	DefaultTableModel model1,model2;//테이블모델 선언
	JTextPane pane;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6;
	public ChatPanel() {
		
		setLayout(null);
		String[] col1 = {"방이름","상태","인원"};
		String[][] rows1 = new String[0][3];
		
		model1 = new DefaultTableModel(rows1,col1);
		table1 = new JTable(model1);
		JScrollPane js1 = new JScrollPane(table1);
		js1.setBounds(10,15,450,350);
		this.add(js1);
		
		String[] col2 = {"ID","이름","성별","위치"};
		String[][] rows2 = new String[0][4];
		
		model2 = new DefaultTableModel(rows2,col2);
		table2 = new JTable(model2);
		JScrollPane js2 = new JScrollPane(table2);
		js2.setBounds(10,375,450,300);
		this.add(js2);
		
		pane = new JTextPane();
		JScrollPane js3 = new JScrollPane(pane);
		pane.setEditable(false);
		js3.setBounds(470, 15, 400, 310);
		this.add(js3);
		
		tf = new JTextField();
		tf.setBounds(470, 330, 400, 25);
		this.add(tf);
		
		b1 = new JButton("방만들기");
		b2 = new JButton("방들어가기");
		b3 = new JButton("쪽지보내기");
		b4 = new JButton("정보보기");
		b5 = new JButton("1:1 채팅");
		b6 = new JButton("채팅종료");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setBounds(470, 365, 400, 200);
		this.add(p);
	}

}
