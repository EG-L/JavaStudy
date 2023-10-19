package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *   예외처리
 *   = 예외복구 => try~catch
 *     try => 정상 수행 문장 => 에러 발생
 *     catch => try를 수행하는 과정 => 에러 발생 시
 *                                 1) 에러 확인
 *                                 ---------- getMessage() , printStackTrace()
 *                                 2) 에러 복구 => 처음부터 수행
 *     => catch를 여러번 사용이 가능
 *        catch => 순서가 존재한다. (계층 구조)
 *                 Throwable
 *                 ---------
 *                 |       |
 *               Error   Exception  => 사용
 *                          |
 *                   -------------------
 *                   |                 |
 *                  IOException   RuntimeException
 *                  SQLException       |
 *                                   NumberFormatException
 *                                       .
 *                                       .
 *                                       .
 *   = 예외회피 => throws
 * */
// UpDown 게임
public class MainClass_4 extends JFrame implements ActionListener,MouseListener,KeyListener{
	JTextField tf;//필드 확보
	JTextArea ta;//텍스트 출력 화면
	JButton b1,b2;//버튼
	//난수
	int com;//0
	
	//초기화
	public MainClass_4(){
		tf = new JTextField(10);
		tf.setEnabled(false);//비활성화
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);//스크롤 바 기능 (텍스트 출력 화면에 추가)
		b1 = new JButton("Start");
		b2 = new JButton("Exit");
		
		//윈도우 배치
		JPanel p = new JPanel();//윈도우 배치 화면
		p.add(tf);// 패널 배치
		p.add(b1);// 패널 배치
		p.add(b2);// 패널 배치
		add("North",p);// 윈도우 배치
		add("Center",js);//자바 스크롤 팬 텍스트 창 배치
		setSize(300, 450);
		setVisible(true);
		
		// 버튼 클릭 시 동작 => ActionPerformed 호출 요청
		// 이벤트 처리
		b1.addActionListener(this);//버튼1 본인 위치
		b2.addActionListener(this);//버튼2 본인 위치
		
		tf.addActionListener(this);//엔터 입력시 동작
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_4();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	//버튼 처리 , 엔터 처리
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {//getSource 버튼 1번 호출
			com = (int)(Math.random()*100)+1;
			b1.setEnabled(false);//b1버튼 안 움직이게 하기
			tf.setEnabled(true);//tablefield 동작
			tf.requestFocus();//tablefield위에 커서 올려두기
			ta.append("게임을 시작합니다.\n");//tableArea에 글자 입력
		}
		else if(e.getSource()==b2){
			dispose(); //메모리 회수
			System.exit(0);// 윈도우 종료
		}
		else if(e.getSource() == tf) {
			try {
				//정상 수행 문장
				String num = tf.getText();//입력값 읽어오기
				int user = Integer.parseInt(num);
				// user / com
				if(user<1 || user>100) {
//					JOptionPane.showMessageDialog(this, "1~100까지만 입력해주세요.");
					ta.append("1~100까지만 입력해주세요.\n");//tableArea 에 글자 입력
				}
				else {
					if(com>user) {
						ta.append("입력값보다 큰 값을 입력해주세요.\n");
					}
					else if(com<user) {
						ta.append("입력값보다 작은 값을 입력해주세요\n");
					}
					else {
						ta.append("Game Over\n");
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");
			}
			catch(NumberFormatException ex) {
				//에러 발생 시 복구
				JOptionPane.showMessageDialog(this, "1~100까지 정수만 입력하세요.");//MessageBox 호출
				tf.setText("");//tablefield위에 ""값 넣기
				tf.requestFocus();//tablefield위에 커서 올려두기
			}
		}
	}

}
