package com.eval4.q2;

public class HashAndEquals {

	public static void main(String[] args) {
		System.out.println("hashCode and equals methods");

	}

}

/* HashCode
 * --------
 * 1. hashCode is a method present in Object class(Superior of all classes);
 * 2. hashCode will return an interger which is unique to every object
 * 3. we also generate a primary key or uniq number for a object 
 *    using Objects.hash(parameters) methods. also used to prove 
 *    the objects logically equal.
 *    
 * 4. It has a contract with equal method .if equal returns true it should return true.
 * 5. Default hashcode will generate using some hashfunctions
 * 
 * 
 * 
 * Equals
 * ------
 * 1. Equals is also a method present in Object class
 * 2. It has somany Overloaded methods to compare String object and different objects
 * 3. It will return true if both the objects location is from same origin else
 *  return false
 * 4. we override method according to over logic to prove the objects logically equal
 * 5. return type is boolean
 * 
 * 
 * 
 * 
 * 
 * 
 */
 