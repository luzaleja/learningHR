package hackerRank;

public class Binary {

	public static void main(String[] args) {
		
		int n = 13;
		
		// se habria podido usar 
		String binaryMethod = Integer.toBinaryString(n);
		System.out.println("con el metodo de java " + binaryMethod);
		
		//lo que hice en un principio
		
		//encontrar el binario
		String r = "";
		
		while(n > 0) {
            String res = Integer.toString(n % 2);
            r += res;
            n = n/2;
        }
		
        String binary = "";
        for(int i = r.length()-1; i >= 0; i--) {
            binary += r.charAt(i);
        }
        
        System.out.println("con mi metodo " + binary);
        
        //encontrar la mayor cantidad de veces que se da un 1 tras de otro
        int sum = 0;
        int mayor = 0;
        
        for(int i = 0; i < binary.length() ; i++) {
            int number = Character.getNumericValue(binary.charAt(i));
            if(number == 1) {
                sum++;
            } else {
                sum = 0;
            }
            if(sum > mayor) {
            	mayor = sum;
            }
        }
        
        System.out.println(mayor);
	}

}
