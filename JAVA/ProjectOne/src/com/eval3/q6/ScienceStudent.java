package com.eval3.q6;

public class ScienceStudent implements Student{
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	public ScienceStudent() {
		
	}
	
	
	
	
	
	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks, int biologyMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.biologyMarks = biologyMarks;
	}
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}





	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		double total=0;
		total=physicsMarks+chemistryMarks+mathsMarks+biologyMarks;
		double perc=total/4;
		
		return perc;
	}
	
	


}
