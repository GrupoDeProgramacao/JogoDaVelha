package com.grupoprogramacaoej;

import java.util.Scanner;

public class EstatisticaSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
    double valor_minimo, valor_maximo, valor_medio;
    int numero_elementos;
    int numero = 0;
    
    
    int pos = 0;
	String num = "";
	
	int numeros [] = new int[pos];	
	
	do {
	System.out.println("Digite um numero:");
	num = teclado.nextLine();
	
	pos = pos+1;	
	numeros[pos] = Integer.parseInt(num);	
	} while (num == "");
	
	}
}
