package exercicios;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:\n" + product1 + ", whitch price is $ " + price1);
		System.out.println(product2 + "whitch price is $ " + price2 + "\n");
		
		System.out.printf("Record: 30 years old, code %d and gender: %s%n%n", code, gender);
		
		System.out.printf("Measure with eight decimal places: %f", measure);
		System.out.printf("%nRouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	
	}

}