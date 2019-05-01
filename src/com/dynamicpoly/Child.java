package com.dynamicpoly;
public class Child extends Parent {

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 1276;
	}

	public static void main(String ar[]) {
		Parent pc = new Parent();

		System.out.println(pc.mobileNum());
		System.out.println(pc.name());
		Child cc = new Child();

		System.out.println(cc.id());
	}

}
