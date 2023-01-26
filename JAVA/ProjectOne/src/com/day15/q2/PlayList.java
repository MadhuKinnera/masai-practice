package com.day15.q2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs= new ArrayList<>();
	
	public void addSong(Song song) {
		int flag=0;
	
		for(Song s: songs) {
			for(int i=0;i<songs.size();i++) {
				if(s.getMovieName().equalsIgnoreCase(song.getMovieName()) &&
						s.getSongName().equalsIgnoreCase(song.getSongName())) {
					System.out.println("Song Already added in The List ");
					flag=1;
					break;
				}
			}
			
			
		}
		if(flag==0) {
			songs.add(song);
		}
	
	}
	
	
	
	
	
}
