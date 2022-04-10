package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class TwoDArray {
	
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
	
        int sum = 0;
        int mayor = -400;
        
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
        		sum = getSum(arr,i,j);
        		if(sum > mayor) {
        			mayor = sum;
        		}
        	}
        }
        
        System.out.println(mayor);
	
	}
	
	public static int getSum(List<List<Integer>> arr, int row, int column) {
    	int summ = 0;
    	for(int i = 0; i < 3; i++) {
    		summ += arr.get(row).get((column+i));
    	}
    	summ += arr.get((row+1)).get((column+1));
    	for(int i = 0; i < 3; i++) {
    		summ += arr.get((row+2)).get((column+i));
    	}
    	return summ;
    }
}
