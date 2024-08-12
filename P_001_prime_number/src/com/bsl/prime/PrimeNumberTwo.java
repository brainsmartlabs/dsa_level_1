//we know if p * q = n; either p > sqrt(n) or q > sqrt(n);
//But can't be both
//So we can run the loop of divisor till square root of the number
//So by this the loop will run very less number of times.
package com.bsl.prime;

public class PrimeNumberTwo {
	public static void main(String[] args) {
		int x = 105;// Change value to 105
		boolean flag = true;
		//Changing logic below for divisor not going more than square root
		for (int div = 2; div * div < x; div++) {
			if (x % div == 0) {
				flag = false;
				break; //Optimizing loop cycle
			}
		}
		if (flag == true) {
			System.out.println(x + " is a Prime number!!");
		} 
		else {
			System.out.println(x + " is not a prime number!");
		}
	}

}
