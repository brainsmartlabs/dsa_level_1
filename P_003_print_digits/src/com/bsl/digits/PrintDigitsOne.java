package com.bsl.digits;

public class PrintDigitsOne {

	public static void main(String[] args) {
		int n = 9037860;
		int nod = 0;
		int quo = n;
		
		while(quo != 0) {
			quo = quo / 10;
			nod ++;
		}
		
		int div = (int) Math.pow(10, nod - 1);
		int rem = n; 
		
		while(div != 0) {
			quo = rem / div;
			rem = rem % div;
			System.out.print(quo + " & ");
			div = div / 10;
		}

	}

}
