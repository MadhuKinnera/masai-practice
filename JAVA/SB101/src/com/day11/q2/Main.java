package com.day11.q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		int i = br.read();
		
		while(i!=-1) {
			System.out.print((char)i);
			i=br.read();
		}

	}

}
