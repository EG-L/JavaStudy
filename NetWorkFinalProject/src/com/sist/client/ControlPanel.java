package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;

public class ControlPanel extends JPanel{
	public HomePanel hp;
	public ChatPanel cp = new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np = new NewsPanel();
	public DetailPanel dp;
	public BoardInsertPanel bip;
	public BoardDeletePanel bdp;
	public BoardUpdatePanel bup;
	public FoodCategoryListPanel fcp;
	public FoodDetailPanel fdp;
	
	public CardLayout card = new CardLayout();
	public ControlPanel() {
		blp = new BoardListPanel(this);//화면 이동
		bip = new BoardInsertPanel(this);
		dp = new DetailPanel(this);
		bdp = new BoardDeletePanel(this);
		bup = new BoardUpdatePanel(this);
		fcp = new FoodCategoryListPanel(this);
		hp = new HomePanel(this);
		fdp = new FoodDetailPanel(this);
		this.setLayout(card);
		this.add("Home",hp);
		this.add("Detail",dp);
		this.add("Chat",cp);
		this.add("Board",blp);
		this.add("News",np);
		this.add("insert",bip);
		this.add("detail",dp);
		this.add("delete",bdp);
		this.add("update",bup);
		this.add("catefood",fcp);
		this.add("fdetail",fdp);
		// => @RequestMapping("") Spring/SpringBoot
		// => app.get("update.jsp") => NodeJS
	}
	
}
