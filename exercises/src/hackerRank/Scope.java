package hackerRank;

import java.util.Scanner;

public class Scope {

	private int[] elements;
  	public int maximumDifference;

	public Scope(int[] integers) {
        this.elements = integers;
    }
    
    public void computeDifference() {
        int differenceMax = 0;
        for(int i = 0; i < elements.length; i++) {
            int difference = 0;
            for(int j = i+1; j < elements.length; j++) {
                difference = Math.abs(elements[i] - elements[j]);
                if(difference > differenceMax) {
                    differenceMax = difference;
                }
            }
        }
        this.maximumDifference = differenceMax;  
    }
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Scope difference = new Scope(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}

}
