package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//캡슐화 코딩
@Getter
@Setter
public class Music {
	//변수 => 저장/읽기
	private int mno;
	private String title;
	/*
	 * public void setTitle(String title){
	 *    this.title = title;
	 * }
	 * */
	private String artist;
	private String album;
	private int idcrement;
	private String state;
	//데이터 은닉화 => 클라이언트가 볼 수 있게 만든다.
	//변수 => 메모리에 저장 / 메모리에서 읽기
	//       읽기 / 쓰기 => 기능 추가 ==> getter/setter

}
