//Print all the Prime Numbers from Low to High

public class PrimeNumberThree {
	public static void main(String[] args) {
		int low = 20;
		int high = 100;

		boolean flag = false;
		System.out.println("Prime Numbers between " + low + " & " + high + " are: ");
		
		//outer loop
		for (int i = low; i <= high; i++) {
			flag = true;
			
			//inner loop
			for (int div = 2; div * div <= i; div++) {
				if (i % div == 0) {
					flag = false;
					break; // Optimization
				}
			}

			if (flag == true) {
				System.out.print(i + ",");
			}
		}

	}

}
