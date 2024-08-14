package com.bsl.reverse;

public class ReverseNumberOne {
	public static void main(String[] args) {
		int n = 650780;
		int quo = n;
		int rem = 0;
		
		while(quo != 0) {
			rem = quo % 10;
			quo = quo / 10;
			System.out.print(rem + " ");
		}
	}

}
