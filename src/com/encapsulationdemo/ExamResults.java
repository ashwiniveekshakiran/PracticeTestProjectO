package com.encapsulationdemo;

public class ExamResults {

	private Result english;
	private Result telugu;
	private Result maths;
	private Result science;
	private Result social;
	private int totalMarks;
	private Result result;
	private String remarks;
	public ExamResults(Result english, Result telugu, Result maths, Result science, Result social, int totalMarks,
			Result result, String remarks) {
		super();
		this.english = english;
		this.telugu = telugu;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.totalMarks = totalMarks;
		this.result = result;
		this.remarks = remarks;
	}
	public Result getEnglish() {
		return english;
	}
	public Result getTelugu() {
		return telugu;
	}
	public Result getMaths() {
		return maths;
	}
	public Result getScience() {
		return science;
	}
	public Result getSocial() {
		return social;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public Result getResult() {
		return result;
	}
	public String getRemarks() {
		return remarks;
	}
	@Override
	public String toString() {
		return "ExamResults [english=" + english + ", telugu=" + telugu + ", maths=" + maths + ", science=" + science
				+ ", social=" + social + ", totalMarks=" + totalMarks + ", result=" + result + ", remarks=" + remarks
				+ "]";
	}
	

	
}
	