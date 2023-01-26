package com.day17.q1;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	
	public void searchOutDatedMobiles(String company,String... models) {
		
		for(int i=0;i<models.length;i++) {
			for(int j=0;j<outdatedModels.length;j++) {
				if(models[i].equals(outdatedModels[j])) {
					System.out.println(outdatedModels[j]+"_OUTDATED ");
				}
			}
			
		}
			
		
		
	}

}
