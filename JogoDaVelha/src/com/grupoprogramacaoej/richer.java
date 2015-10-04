package com.grupoprogramacaoej;

import java.util.Scanner;

public class richer {

	String posicoes[] = new String[9];
	
	public void tela () {
		System.out.println(posicoes[0]+" "+posicoes[1]+" "+posicoes[2]);
		System.out.println(posicoes[3]+" "+posicoes[4]+" "+posicoes[5]);
		System.out.println(posicoes[6]+" "+posicoes[7]+" "+posicoes[8]);
	}
	
	
	public static void main(String[] args) {	

		richer matriz = new richer();
		String player1, player2, escolha;
		int cont1 = 0, cont2 = 0;
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			matriz.posicoes[i] = ""+(i+1);
		}
		
		System.out.println("Bem-vindo ao Jogo da Velha");
		matriz.tela();
		
		System.out.println("Deseja jogar com X ou O: ");
		escolha = leitura.nextLine();
		
		if (escolha.equalsIgnoreCase("X")) {
			player1 = "X";
			player2 = "O";
		} else {
			player1 = "O";
			player2 = "X";
		}
		
		while ( (!(matriz.posicoes[0].equals(matriz.posicoes[1]) && matriz.posicoes[1].equals(matriz.posicoes[2]))) &&  
				(!(matriz.posicoes[3].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[5]))) &&
				(!(matriz.posicoes[6].equals(matriz.posicoes[7]) && matriz.posicoes[7].equals(matriz.posicoes[8])))) {

			if (cont1 <= cont2) {
				matriz.tela();
				System.out.println("Informe a posição que deseja marcar");
				escolha = leitura.nextLine();
				matriz.posicoes[Integer.parseInt(escolha)-1] = player1;
				matriz.tela();
				cont1++;
			} else {
				matriz.tela();
				System.out.println("Informe a posição que deseja marcar");
				escolha = leitura.nextLine();
				matriz.posicoes[Integer.parseInt(escolha)-1] = player2;
				matriz.tela();
				cont2++;
			}
		}
		
		
	}

}
