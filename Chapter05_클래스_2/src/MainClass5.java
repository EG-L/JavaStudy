import java.text.DecimalFormat;

class Movie1{
	int mno;
	String poster,nameKr,nameEn;
	String regDate;
	String gerne;
	String nation;
	String grade;
	String time;
	double score;
	int boxOffice;
	String story;
}
class Movie_news{
	int mno;
	String poster,title,story,date,name;
}
class category{
	int cno;
	String poster,title,subject;
}
class menuhouse{
	int mno;
	String name;
	double score;
	String address;//substring
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu;
}
class todaymenu{
	int tno;
	String poster;
	String title;
	String name;
	int score;
	int show_user;
	int comment_num;
}
class music{
	int mno;
	String poster,songName,title,artist;
	int idcrement;//등폭
	String state;//유지 , 상승, 하강
	int rank;
	int like;
}
class FoodPrice{
	int goods_no;//구분자
	int goods_sale;
	String goods_poster,goods_name;
	int goods_price;
}
class Movie2{
	int mno;
	String poster,title,Working;
	String gerne;
	String regdate;
	String address;
	String driector;
	String grade;
	String time;
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		music ms = new music();
		ms.like = 35829;
		//라이브러리
		// => 숫자 => int
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(ms.like));

	}

}
