package hackerRank;

import java.util.Scanner;

public class StaticInitializingBlock {

	private static Scanner sc = new Scanner(System.in);
	private static int B;
	private static int H;
	private static boolean flag = true;
	
	static {
		B = sc.nextInt();
		H = sc.nextInt();
		
		try {
			if(B<=0 || H<=0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		if(flag) {
			int a = B*H;
			System.out.println(a);
		}
	}

}
