package com.day1.q3;

import java.util.Comparator;

public class MemberIdComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		Member m1 = (Member) o1;
		Member m2 = (Member) o2;
		
		if(m1.getMemberId()==m2.getMemberId() || m1.getMemberShipNumber() == m2.getMemberShipNumber()) {
			return 0;
		}
		else  if(m1.getMemberId()>m2.getMemberId()){
			return +1;
		}
		else {
			return -1;
		}
	}

}
