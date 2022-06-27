package com.springcore.model;

public class Addition {
	private int x;
	private int y;

	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("int : int");
	}

	public Addition(double x, double y) {
		super();
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("double : double");
	}

	public Addition(String x, String y) {
		super();
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("string : string");
	}
	
	public void doSum() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("sum = "+(x+y));
	}

}
