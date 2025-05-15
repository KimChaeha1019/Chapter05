package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	
	public static void main(String[] args) throws IOException {
		
		//주 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffereding.jpg");
		
		//보조 스트림
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("스트림준비완료");
		
		while(true){
			
			//int data = in.read();	//이렇게 쓰면 안 돼-->다시 되돌아가는 격
			int data = bin.read();
			
			//-1이면 끝
			if(data == -1) {
				System.out.println("복사끝");
				break;
			}
			
			//out.write(data);		//이렇게 쓰면 안 돼
			bout.write(data);
		}
		
		bin.read();
		
		
		//스트림정리
		bout.close();   //주스트림도 close 해준다.
		in.close();		//주스트림도 close 해준다.
		
		System.out.println("프로그램 종료");
		
	}

}
