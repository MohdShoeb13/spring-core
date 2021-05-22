package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel")
public class SpelUser {
     
	@Value("#{ 22 + 55 }")
	private int sum;
	
	@Value("#{ 66 > 50 ? 1 : 0}")
	private int ternary;
	
	@Value("#{T(java.lang.Math).sqrt(64)}")
	private double sqrt;
	
	@Value("#{3>4}")
	private boolean bool;
	
	@Value("#{new String('SPRING').toLowerCase()}")
	private String string;

	public SpelUser() {
		super();
		
	}

	public SpelUser(int sum, int ternary, double sqrt, boolean bool, String string) {
		super();
		this.sum = sum;
		this.ternary = ternary;
		this.sqrt = sqrt;
		this.bool = bool;
		this.string = string;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTernary() {
		return ternary;
	}

	public void setTernary(int ternary) {
		this.ternary = ternary;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "SpelUser [sum=" + sum + ", ternary=" + ternary + ", sqrt=" + sqrt + ", bool=" + bool + ", string="
				+ string + "]";
	}
	
	
}
