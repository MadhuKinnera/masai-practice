package com.day1.q3;

public class Member {

	private int memberId;
	private String memberName;
	private int memberShipNumber;
	private String memberShipEndDate;
	
	public Member() {
		
	}
	
	public Member(int memberId, String memberName, int memberShipNumber, String memberShipEndDate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberShipNumber = memberShipNumber;
		this.memberShipEndDate = memberShipEndDate;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberShipNumber() {
		return memberShipNumber;
	}

	public void setMemberShipNumber(int memberShipNumber) {
		this.memberShipNumber = memberShipNumber;
	}

	public String getMemberShipEndDate() {
		return memberShipEndDate;
	}

	public void setMemberShipEndDate(String memberShipEndDate) {
		this.memberShipEndDate = memberShipEndDate;
	}
	
	
	
	
}
