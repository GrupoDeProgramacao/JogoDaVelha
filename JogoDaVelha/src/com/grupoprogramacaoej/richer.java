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
			player1 = "X";
			player2 = "O";
		}
		
		
		
	}

}
