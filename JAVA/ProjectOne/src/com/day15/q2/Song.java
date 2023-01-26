package com.day15.q2;
import java.lang.Object;
import java.util.Objects;

public class Song {

	private String movieName;
	private String songName;
	
	public Song(String movieName,String songName) {
		this.movieName=movieName;
		this.songName=songName;
	}
	
	public void play() {
		System.out.println(this.songName+" of "+this.movieName+" is playing...");
	}
	

	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	
	
}
