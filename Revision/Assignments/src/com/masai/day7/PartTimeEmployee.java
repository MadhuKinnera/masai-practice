package com.masai.day7;

public class PartTimeEmployee extends Employee {
	
	private Integer salaryPerHour;
	private Integer consultantCode;
	
	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PartTimeEmployee(Integer id, String name, Integer age, Integer salary, String department, String work_loc,Integer salaryPerHour, Integer consultantCode) {
		super(id, name, age, salary, department, work_loc);
	this.salaryPerHour = salaryPerHour;
	this.consultantCode=consultantCode;
	}



	public Integer getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(Integer salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public Integer getConsultantCode() {
		return consultantCode;
	}

	public void setConsultantCode(Integer consultantCode) {
		this.consultantCode = consultantCode;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [salaryPerHour=" + salaryPerHour + ", consultantCode=" + consultantCode + "]";
	}
	
	
	

}
