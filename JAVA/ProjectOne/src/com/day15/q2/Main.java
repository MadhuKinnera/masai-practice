package com.day15.q2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		PlayList pl = new PlayList();
		
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter the details of the Song : "+(i+1));
			System.out.println("Enter The Song Name : ");
			String songName = sc.next();
			System.out.println("Enter The Movie Name : ");
			String movieName = sc.next();
			
			Song s= new Song(movieName,songName);
			pl.addSong(s);
			System.out.println("------------------------");
		}
		
	for(Song s:pl.songs) {
		s.play();
	}
		
		
		
		
		

	}

}
