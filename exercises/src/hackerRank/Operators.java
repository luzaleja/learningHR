package hackerRank;

public class Operators {

	public static void main(String[] args) {

		double mealCost = 12.00;
		int tipPercent = 20;
		int taxPercent = 8;
		Operators.solve(mealCost, tipPercent, taxPercent);
	}	

	public static void solve(double mealCost, int tipPercent, int taxPercentt) {
		
		// es necesario el (double) antes de tip_percent y tax_percent para que el porcentaje no quede en 0
		// esto porque como tip y tax son int, al dividirlo por 0, java toma el tipo de dato del primer dato, 
		// y al hacer la division trae el entero, que sería 0.
		// al volver tip y tax double antes de la division, nos aseguramos que el porcentaje quede como es
		// por ejemplo, si era 20, que quede 0.2 * meal_cost
		double tip = mealCost * ((double)tipPercent/100);
		double tax = mealCost * ((double)taxPercentt/100);
		
		//redondeamos con Math.round que redondea al entero más cercano
		//ese numero redondeado lo casteamos a un int
        int result = (int)Math.round((mealCost + tip + tax));
        System.out.println(result);
    }
}
