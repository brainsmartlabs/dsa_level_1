
public class PrimeNumberOne {
	public static void main(String[] args) {
		int x = 20;//Change value to 13
		int count = 0;
		for (int div = 2; div <= (x-1); div++) {
			if (x % div == 0) {
				count++;
				// break;
			}
		}
		if (count == 0) {
			System.out.println(x + " is a Prime number!!");
		} else {
			System.out.println(x + " is not a prime number as it got divided " + count + " times!");
		}
	}
}
