package app;

import java.util.Arrays;

public class ValidadorCPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cpf = "44536332898";
		
		int[] dividir = Arrays.stream(cpf.split("")).mapToInt(Integer::parseInt).toArray(); 
		
		int soma = (dividir[0] * 1) +
				(dividir[1] * 2) +
				(dividir[2] * 3) +
				(dividir[3] * 4) +
				(dividir[4] * 5) +
				(dividir[5] * 6) +
				(dividir[6] * 7) +
				(dividir[7] * 8) +
				(dividir[8] * 9);
		
		int resultado = soma % 11;

		int soma2 = (dividir[0] * 0) +
				(dividir[1] * 1) +
				(dividir[2] * 2) +
				(dividir[3] * 3) +
				(dividir[4] * 4) +
				(dividir[5] * 5) +
				(dividir[6] * 6) +
				(dividir[7] * 7) +
				(dividir[8] * 8) +
				(resultado * 9);
		
		int resultado2 = soma2 % 11;
		
		if (dividir[9] == resultado && dividir[10] == resultado2) {
			System.out.println("CPF VÁLIDO");
		} else {
			System.out.println("CPF INVÁLIDO");
		}
	}

}
