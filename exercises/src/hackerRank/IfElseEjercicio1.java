package hackerRank;

public class IfElseEjercicio1 {

	public static void main(String[] args) {

		int n = 4;
		
		/*
		 
		 if it's odd = weird
		 if its even and between 2 and 5 not weird
		 if its even and between 6 and 20 weird
		 if its even and bigger than 20 not weird
		 
		 */
		
		
		if(n>= 1 && n<= 100) {
			if(n%2 != 0) {
				System.out.println("Weird");
			} else if(n>= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if(n>= 6 && n <= 20) {
				System.out.println("Weird");
			} else if(n > 20) {
				System.out.println("Not Weird");
			}
		}
		
		if(n>= 1 && n<= 100) {
			if(n%2 == 0) {
				if(n>= 2 && n <= 5) {
					System.out.println("Not Weird");
				} else if(n>= 6 && n <= 20) {
					System.out.println("Weird");
				} else if(n > 20) {
					System.out.println("Not Weird");
				}
			} else {
				System.out.println("Weird");
			}
		}
	}
}
