package com.eval3.q3;

public abstract class Evaluation {
	
	private final int numberOfQuestions;
	Evaluation(int n){
		numberOfQuestions=n;
	}
	abstract void evaluationTiming();
	void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}

}
