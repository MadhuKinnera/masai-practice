package com.day3.q4;

import java.util.Comparator;

public class StringDesComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	String str1 = (String ) o1;
	String str2 = (String ) o2;
    
	return str2.compareTo(str1);
	
     }
	
	}

