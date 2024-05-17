package app;

import java.util.Arrays;
import java.util.Scanner;

public class ValidadorCPF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu CPF");
		String cpf = entrada.next();
		
		int[] vetor = Arrays.stream(cpf.split("")).mapToInt(Integer::parseInt).toArray();
		
		int somaPrimeiroDigito = 0;
		for (int i = 0; i < 9; i++) {
			somaPrimeiroDigito += vetor[i] * (i + 1);
		}
		
		int primeiroDigito = somaPrimeiroDigito % 11;
		if(primeiroDigito == 10) {
			primeiroDigito = 0;
		}

		int somaSegundoDigito = 0;
		for (int i = 0; i < 10; i++) {
			somaSegundoDigito += vetor[i] * (i);
		}
		
		int segundoDigito = somaSegundoDigito % 11;
		if(segundoDigito == 10) {
			segundoDigito = 0;
		}
		
		if (vetor[9] == primeiroDigito && vetor[10] == segundoDigito) {
			System.out.println("CPF VÁLIDO");
		} else {
			System.out.println("CPF INVÁLIDO");
		}
		
		entrada.close();
	}

}
