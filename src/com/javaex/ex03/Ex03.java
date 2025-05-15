package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {
	
	public static void main(String[] args) throws IOException{
		
		/*
		 //반복
		 PhoneDB.txt 파일을 한줄씩 읽는다.(MS949방식으로 저장되어 있음)
		 
		 "이효리,010-2222-3333,031-2323-4441" 을 ","로 구분한다. --> 배열
		 
		 //반복
		 ==>리스트에 정리
		 [0x111] [0x333] [0x888]
		 
		 0x111 = 이효리, hp = 010-2222-3333, company=031-2323-4441 ==>Person
		 
		 for으로 출력
		 문제에 있는 형식으로 출력한다
		 */
		Person p = new Person();
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);	
			
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] sArray = str.split(",");
			
			p.setName(sArray[0]);
			p.setHp(sArray[1]);
			p.setCompany(sArray[2]);
			
			p.draw();
			
		}
		br.close();
		}
	
	}

