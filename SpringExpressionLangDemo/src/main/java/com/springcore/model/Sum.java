package com.springcore.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sum {
	@Value("#{34+56}")
	private int a;
	@Value("#{56 < 30 ? 100:200}")
	private int b;

	@Value("#{T(java.lang.Math).sqrt(81)}")
	private int x;

	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int y;

	@Value("#{T(com.springcore.model.Test).sum()}")
	private int s;

	@Value("#{new java.lang.String('Pritam Ray')}")
	private String name;

	@Value("#{3>2}")
	private boolean isActive;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Sum [a=" + a + ", b=" + b + ", x=" + x + ", y=" + y + ", s=" + s + ", name=" + name + ", isActive="
				+ isActive + "]";
	}

}
