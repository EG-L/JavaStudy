package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
	JLabel la1,la2,la3;
	JTextField tf1;
	JTextArea tf2;
	JRadioButton rb1,rb2;
	JButton b1,b2;
	
	public Login() {
		la1 = new JLabel("아이디");// <label>
		la2 = new JLabel("이름");
		la3 = new JLabel("성별");
		
		tf1 = new JTextField();// <input type=text>
		tf2 = new JTextArea();
		
		rb1 = new JRadioButton("남자");//<input type=radio>
		rb2 = new JRadioButton("여자");
		
		rb1.setSelected(true);
		ButtonGroup bg = new ButtonGroup();//라디오버튼 두개 중 한 개를 선택하려면 그룹으로 묶어야 된다.
		bg.add(rb1);
		bg.add(rb2); // 그룹 => html에서 그룹 설정을 한다.
		
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		//------------------------------- 멤버변수의 초기화
		
		// 배치
		this.setLayout(null);// JFrame => BorderLayout(default)
		//            ------ 사용자 지정 배치 null 설정 => <link href = "a.css">
		
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(75, 15, 150, 30);
		
		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(75, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(75, 85, 70, 30);
		rb2.setBounds(150, 85, 70, 30);
		
		p.setBounds(10, 125, 215, 35);
		
		// 추가
		this.add(la1);
		this.add(tf1);
		
		this.add(la2);
		this.add(tf2);
		
		this.add(la3);
		this.add(rb1);
		this.add(rb2);
		
		this.add(p);
		
		this.setSize(255, 200);
		this.setVisible(true);
	}
	
//	public static void main(String[] args) {
//		new Login();
//	}

}
