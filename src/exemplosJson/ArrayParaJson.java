package exemplosJson;

import com.google.gson.Gson;

public class ArrayParaJson {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 2, 3, 5, 8, 13};
		String[] fruits = {"Maçã", "Abacaxi", "Maracuja", "Uva", "Laranja", "Mamão", "Melância"};
		// Criando uma instância de Gson
		Gson gson = new Gson();
		// Convertendo um Array de números em JSON
		String numbersJson = gson.toJson(numbers);
		// Convert Array de Strings no JSON String
		String fruitsJson = gson.toJson(fruits);
		System.out.println("numbersJson = " + numbersJson);
		System.out.println(" fruitsJson = " +  fruitsJson);       
	}
}