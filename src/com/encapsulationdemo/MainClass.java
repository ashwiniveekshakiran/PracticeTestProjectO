package com.encapsulationdemo;

public class MainClass {
	public static void main(String args[])
	{
		ExamResults res = new ExamResults(Result.PASS, Result.PASS, Result.PASS, Result.PASS , Result.PASS, 420, Result.PASS, "Improve English");
		System.out.println(res.toString());
	}

}
