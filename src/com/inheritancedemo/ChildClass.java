package com.inheritancedemo;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentClass cc = new ChildClass();
System.out.println(cc.add(5, 7));
System.out.println(cc.sub(4,1));
System.out.println(((ChildClass) cc).mul(6, 6));
	}
	public int mul(int a,int b)
	{
		return a*b;
	}

}
