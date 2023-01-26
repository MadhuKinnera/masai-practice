package com.eval3.q6;

public class ArtStudent implements Student {
	
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	public ArtStudent() {
		
	}
	
	
	
	
	
	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}





	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double total=0;
		total=hindiMarks+englishMarks+historyMarks;
		double perc=total/3;
		return perc;
	}
	
	


}
