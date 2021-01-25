package com.kh.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJavaApi {
	
	public static void main(String[] args) {

		SimpleDateFormat date =new SimpleDateFormat("yyyy/MM/dd");
		
		String time = date.format(new Date());
	
		System.out.println(time);
	}

}
