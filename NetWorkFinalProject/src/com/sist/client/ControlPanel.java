package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;

public class ControlPanel extends JPanel{
	public HomePanel hp = new HomePanel();
	public ChatPanel cp = new ChatPanel();
	public BoardListPanel blp = new BoardListPanel();
	public NewsPanel np = new NewsPanel();
	public DetailPanel dp = new DetailPanel();
	
	public CardLayout card = new CardLayout();
	public ControlPanel() {
		this.setLayout(card);
		this.add("Home",hp);
		this.add("Detail",dp);
		this.add("Chat",cp);
		this.add("Board",blp);
		this.add("News",np);
	}
	
}
