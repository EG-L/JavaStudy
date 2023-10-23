import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass_2 extends JFrame implements ItemListener{
	JComboBox box = new JComboBox();
	public MainClass_2() {
		box.addItem("홍길동");//combobox 값 대입
		box.addItem("심청이");//combobox 값 대입
		box.addItem("김나박이");//combobox 값 대입
		this.add("North",box);
		this.setSize(300,150);
		this.setVisible(true);
		
		box.addItemListener(this);
		
	}
	public static void main(String[] args) {
		new MainClass_2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name = box.getSelectedItem().toString();
			System.out.println(name);
		}
	}

}
