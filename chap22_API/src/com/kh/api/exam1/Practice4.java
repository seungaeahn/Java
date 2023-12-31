package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
		pm.Practice4();

	}
	
	public void Practice1() {
		// 년월일 yyyy-MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("년월일: " + forDate);
	}
	public void Practice2() {
		//시분초 HH:mm:ss
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("시분초: " + forDate);
	}
	public void Practice3() {
		//월일 MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("월일: " + forDate);
	}
	public void Practice4() {
		//연도-시간 yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println("연도-시간: " + forDate);
	}

}
