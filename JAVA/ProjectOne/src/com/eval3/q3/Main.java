package com.eval3.q3;

public class Main {
	
	
	void messageToStudents(Evaluation evaluation) {
		 if(evaluation instanceof DsaEvaluation) {
			 DsaEvaluation de=(DsaEvaluation)evaluation;
			 System.out.println("It's a  Dsa Evaluation ");
			 de.printNoOfQuestions();
			 de.evaluationTiming();
			 System.out.println("===================================");
		 }
		 else {
			 CodingEvaluation ce=(CodingEvaluation)evaluation;
			 System.out.println("It's a  Coding Evaluation ");
			 ce.printNoOfQuestions();
			 ce.evaluationTiming();
			 System.out.println("===================================");
		 }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m= new Main();
		m.messageToStudents(new DsaEvaluation(5));
		m.messageToStudents(new CodingEvaluation(4));

		
		
	}

}
