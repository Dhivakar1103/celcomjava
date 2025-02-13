package com.celcom.day8;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileCopyExample {

	public static void main(String[] args)throws IOException {
		FileReader fr =new FileReader("D://Example.txt");
		FileWriter fw =new FileWriter("D://Example1.txt");

		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
		
		
	}

}
