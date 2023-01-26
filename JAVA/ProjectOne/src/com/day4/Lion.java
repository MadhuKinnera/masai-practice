package com.day4;

public class Lion {

      String name;
      int age;
      boolean isHungry;
      static int totalDeaths=0;
      static void printKillings() {
    	  System.out.println("total killings by lion in jungle is "+totalDeaths);
      }
     
      void thinking(String name,int age,boolean hungry) {
    	  if(hungry==false) {
    		  System.out.println(name+" is sleeping");
    	  }
    	  else {
    		  if(age > 12) {
    			  totalDeaths+=2;
    			  System.out.println(name+" has eaten two animal");
    		  }
    		  else if(age<2) {
    			  System.out.println(name+" is calling Mom");
    		  }
    		  else {
    			  totalDeaths+=1;
    			  System.out.println(name+" has eaten one animal");
    		  }
    		  
    	  }
      }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1=  new Lion();
		Lion lion2 = new Lion();
		Lion lion3 =  new Lion();
		lion1.name="lion1";
		lion1.isHungry=true;
		lion1.age=18;
		lion2.name="lion2";
		lion2.isHungry=true;
		lion2.age=10;
		lion3.name="lion3";
		lion3.isHungry=true;
		lion3.age=1;
		lion1.thinking(lion1.name,lion1.age,lion1.isHungry );
		lion2.thinking(lion2.name, lion2.age, lion2.isHungry);
		lion3.thinking(lion3.name,lion3.age, lion3.isHungry);
	    Lion.printKillings();
		
		

	}

}
