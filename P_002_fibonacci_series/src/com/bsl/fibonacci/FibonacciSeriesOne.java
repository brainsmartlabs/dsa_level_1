package com.bsl.fibonacci;

public class FibonacciSeriesOne {
	
	public static void main(String[] args) {
		int n = 35;
		
		int a = 0; int b = 1; int c = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;
		}

	}
	
}
