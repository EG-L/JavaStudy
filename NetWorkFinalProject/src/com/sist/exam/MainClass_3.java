package com.sist.exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MainClass_3 extends JFrame implements ActionListener{
	JProgressBar[] bar = new JProgressBar[5];
	JButton b1,b2;
	static int rank;
	BarThread[] bt = new BarThread[5];
	public MainClass_3() {
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1,5,5));
		Color[] color = {Color.cyan,Color.yellow,Color.pink,Color.orange,Color.magenta};
		for(int i =0; i<5;i++) {
			bar[i] = new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);
			// 1% ~~ 100%
			bar[i].setForeground(color[i]);
			bar[i].setBackground(Color.white);
			p.add(bar[i]);
		}
		
		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		
		this.add("Center",p);
		this.add("South",p2);
		
		this.setSize(640,350);
		this.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public static void main(String[] args) {
		new MainClass_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			rank = 0;
			for(int i =0;i<5;i++) {
				bt[i] = new BarThread(i);
				bt[i].start();
			}
		}
		else if(e.getSource()==b2) {
			System.exit(0);
		}
	}
	
	//Thread => bar[] 이용 => 윈도우가 가지고 있는 모든 데이터 사용
	//객체생성 없이 사용 => 내부 클래스 (서버, 빅데이터, 쓰레드)
	/*
	 *    내부클래스
	 *     = 멤버클래스 => 쓰레드 , 서버 개발
	 *     class A
	 *     {
	 *        class B
	 *        {
	 *          A가 가지고 있는 모든 데이터를 공유
	 *        }
	 *     }
	 *     = 익명의 클래스 => 상속 없이 오버라이딩
	 *     class A{
	 *        B b = new B{
	 *           public void disp(){}
	 *        };
	 *     }
	 *     class B{
	 *         public void disp(){}
	 *     }
	 *     
	 *     => 지역클래스
	 *     class A{
	 *         public void disp(){
	 *             class B{
	 *             }
	 *         }
	 *     }
	 * */
	class BarThread extends Thread{
		//프로그레스바 한개만 동작
		int index;
		public BarThread(int index) {
			this.index = index; // 쓰레드 구분
			
		}
		public void run() {
			Random r = new Random();
			for(int i = 0; i<101;i++) {
				bar[index].setValue(i);
				int a = (int)(r.nextInt(300));
				try {
					Thread.sleep(a);
				} catch (Exception e) {
					// TODO: handle exception
				}
				if(i==100) {
					rank++;
					interrupt();
				}
			}
			System.out.println((index+1)+"번째"+rank+"등");
		}
	}
}
