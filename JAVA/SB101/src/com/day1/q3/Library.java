package com.day1.q3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Library {

	static Map<Integer,Book> books= new HashMap<>();
	
	static TreeSet<Member> members= new TreeSet<>(new MemberIdComp());
}
