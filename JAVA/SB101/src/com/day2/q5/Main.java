package com.day2.q5;

public class Main {

	public static void main(String[] args) {
		
		

	}

}

/*
 * There is three types of wildcards 
 * 1. unbounded  
 * 2. upperbound wildcard
 * 3. lowerbound wildcard
 * 
 * 
 * Unbounded
 * --------
 * 
 * 1. Unbounded type is very similar to not applying any generics ..
 * 2. It will accept anytype of suitable data ..
 * 3. not type safe 
 * 
 * 
 * UpperBound
 * -----------
 * 
 * 1. It uses extends keyWord 
 * means the class object and its child class objects are allowed to used the generic
 * class
 * 2. Syntax
 * 
 *  public void fun1(List<? extends Number)){
 *  }
 *  
 *  the above wildcard means it will accept Number and 
 *  its child classes like short,byte,int,double,long etc.
 *  
 *  
 *  LowerBound
 *  -----------
 *  1. it used the super keyword
 *  mean this class and this class super classes are allowed to create the object .
 *  
 *  2. Syntax 
 *  
 *  public void fun1(List<? super Integer)){
 *  }
 *  
 *  the above wild card means 
 *  Integer,Number,Object these classes are accepted data types..
 * 
 * 
 * 
*/

