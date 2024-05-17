package app;

import java.util.Arrays;
import java.util.Scanner;

public class ValidadorCPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu CPF");
		String cpf = entrada.next();
		
		int[] dividir = Arrays.stream(cpf.split("")).mapToInt(Integer::parseInt).toArray();
		
		int soma = 0;
		for (int i = 0; i < 9; i++) {
		    soma += dividir[i] * (i + 1);
		}
		
		int primeiroDigito = soma % 11;

		int soma2 = 0;
		for (int i = 0; i < 10; i++) {
		    soma2 += dividir[i] * (i);
		}
		
		int segundoDigito = soma2 % 11;
		
		if (dividir[9] == primeiroDigito && dividir[10] == segundoDigito) {
			System.out.println("CPF VÁLIDO");
		} else {
			System.out.println("CPF INVÁLIDO");
		}
		
		entrada.close();
	}

}
