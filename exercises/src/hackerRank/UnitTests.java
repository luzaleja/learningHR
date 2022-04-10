package hackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UnitTests {

	public static void main(String[] args) {

		String nombre = "Luz";
		String apellido = "R";
		String documento = "1234";
		String edad = "";
		String ocupacion = "";
		String fechaNacimientoStr = "12/02/2000";
		
		List<String> requestValues = Arrays.asList(nombre,apellido,documento,edad,ocupacion,fechaNacimientoStr);
		
		//revisamos que no esten vacios
		int camposVacios = 0;
		String camposVaciosStr = "";
		
		int a = 0;
		for(String value:requestValues) {
			if(value.trim().isEmpty()) {
				camposVacios++;
				camposVaciosStr+=(a + " ");
			}
			a++;
		}
		
		System.out.println("campos vacios "+ camposVacios);
		System.out.println(camposVaciosStr);
	}
}

