package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//주 스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		
		//보조스트림 준비
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("스트림 준비완료");
		
		while(true) {
			
			String str = br.readLine();	//파일에 있는 것을 줄단위로 읽어옴
			
			if(str == null) {
				System.out.println("파일읽기 끝");
				break;
			}
			
			System.out.println(str);
		}

		//스트림 종료
		br.close();
		
	}

}
