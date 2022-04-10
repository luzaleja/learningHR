package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		int k = 10;
		List<Integer> A = new ArrayList<Integer>();
		A.add(3);
		A.add(2);
		A.add(1);
		
		List<Integer> B = new ArrayList<Integer>();
		B.add(7);
		B.add(8);
		B.add(9);
		
		List<Integer> C = new ArrayList<Integer>();
		C.add(1);
		C.add(2);
		C.add(2);
		C.add(1);
		
		List<Integer> D = new ArrayList<Integer>();
		D.add(3);
		D.add(3);
		D.add(3);
		D.add(4);

		int l = 5;
		
		String result = twoArrays(k,A,B);
		String result2 = twoArrays(l,C,D);
		
		System.out.println(result);
		System.out.println(result2);
	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        String res = "";
        Collections.sort(A);
        Collections.sort(A, Collections.reverseOrder());
        int rep = 0;
        for(int i = 0; i < A.size(); i++) {
        	if(A.get(i) + B.get(i) >= k) {
        		rep ++;
        	} else {
        		break;
        	}
        }
        int repNeeded = A.size();
        if(rep == repNeeded) {
            res = "YES";
        } else {
            res = "NO";
        }
        return res;
    }
}
