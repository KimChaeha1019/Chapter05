package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
		
		//주 스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		
		//보조 스트림 준비
		BufferedReader  br = new BufferedReader(fr);
		
		System.out.println("------------------------스트림 준비완료");
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				System.out.println("파일읽기 끝");
				break;
			}
			
			System.out.println(str);
		}
		
		
		//스트림 닫기
		br.close();
		
		System.out.println("------------------------프로그램 종료");
		
	}
	//학교종이는 깨지는데 이건 깨지는 이유 : 학교종이는 UTF-8로 저장되어있기 때문
	//MS949는 UTF-8로 저장되어있지 않아서 깨진다.
	
}
