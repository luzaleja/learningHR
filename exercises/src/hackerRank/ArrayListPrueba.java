package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPrueba {

	public static void main(String[] args) {

		/*
		5
		5 41 77 74 22 44
		1 12
		4 37 34 36 52
		0
		3 20 22 33
		5
		1 3
		3 4
		3 1
		4 3
		5 5 
		  
		You are given n lines. In each line there are zero or more integers. 
		You need to answer a few queries where you need to tell the number located in  position of  line.

		The first line has an integer n. In each of the next n lines there will be an integer d denoting
		number of integers on that line and then there will be d space-separated integers. In the next 
		line there will be an integer q denoting number of queries. 
		Each query will consist of two integers x-fila and y-columna.		  
		 */
		
		Scanner scan = new Scanner(System.in);
        //n = El numero de lineas
		int n = scan.nextInt();
        
		//Listas = donde se guardan las lineas
        List<List<Integer>> listas = new ArrayList<>();
        
        //linea por linea
        for(int i = 0; i < n; i++) {
        	//guardamos en lineas los numeros 
            List<Integer> lineas = new ArrayList<>();
            //d = la cantidad de numeros que van en una linea
            int d = scan.nextInt();
            for(int j = 0; j < d; j++) {
            	//guardamos en lineas los numeros con nextInt
                lineas.add(scan.nextInt());
            }
            //ya esta lineas todo, agrego lineas en listas
            listas.add(lineas);
        }
		
        int q = scan.nextInt();
        
        for(int i = 0; i < q; i++) {
        	int x = scan.nextInt() - 1;
        	int y = scan.nextInt() - 1;
        	
        	try {
        		//buscamos la linea x en listas
        		List<Integer> lineaX = listas.get(x);
        	
        		//buscamos el numero y en la lineaX
        		Integer numeroY = lineaX.get(y);
        		System.out.println(numeroY);
        	} catch (IndexOutOfBoundsException e) {
        		System.out.println("ERROR!");        		
        	}
        }
        scan.close();
		
	}

}
