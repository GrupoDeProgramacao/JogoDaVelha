package com.grupoprogramacaoej;

import java.util.ArrayList;
import java.util.Scanner;

public class EstatisticaSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double valor_minimo, valor_maximo, valor_medio;
		int numero_elementos, troca;
		int numero = 0;
		String num;
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();
	
		do {
			System.out.println("Digite um numero:");
			num = teclado.nextLine();
			numeros.add(Integer.parseInt(num));
		} while (num != "");
	
	for (int i = 0; i < numeros.size(); i++) {
		for (int j = 0; j < numeros.size(); j++) {
			if (numeros.get(j) < numeros.get(i) ) {
				troca = numeros.get(i);
				numeros.get(i) = numeros.get(j);
				numeros.get(j) = troca;
				
				
				
			}
		}
	}
	
	}
}
