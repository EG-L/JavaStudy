package com.sist.music;
//사용자 정의 데이터형(캡슐화)
public class Music {
	
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String key;
	//변수 => 읽기/쓰기 접근 가능 메서드
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
