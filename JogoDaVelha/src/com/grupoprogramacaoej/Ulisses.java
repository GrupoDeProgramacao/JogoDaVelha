
			
package com.grupoprogramacaoej;

import java.util.Scanner;

public class Ulisses {

	String posicoes[] = new String[9];
	
	public void tela () {
		System.out.println(posicoes[0]+" "+posicoes[1]+" "+posicoes[2]);
		System.out.println(posicoes[3]+" "+posicoes[4]+" "+posicoes[5]);
		System.out.println(posicoes[6]+" "+posicoes[7]+" "+posicoes[8]);
	}
	
	
	public static void main(String[] args) {	

		Ulisses matriz = new Ulisses();
		String player1, player2, escolha,nomeprimeirojogador,nomesegundojogador;
		int cont1 = 0, cont2 = 0;
		Scanner leitura = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			matriz.posicoes[i] = ""+(i+1);
		}
		
		System.out.println("Bem-vindo ao Jogo da Velha");
		matriz.tela();
		System.out.println("Qual nome do primeiro jogador ?");
		nomeprimeirojogador = leitura.nextLine();
		System.out.println("Qual nome do segundo jogador ?");
		nomesegundojogador = leitura.nextLine();
		
		
		
		
		System.out.println(nomeprimeirojogador+" deseja jogar com X ou O: ");
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
				(!(matriz.posicoes[6].equals(matriz.posicoes[7]) && matriz.posicoes[7].equals(matriz.posicoes[8]))) &&
				(!(matriz.posicoes[0].equals(matriz.posicoes[3]) && matriz.posicoes[3].equals(matriz.posicoes[6]))) &&
				(!(matriz.posicoes[1].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[7]))) &&
				(!(matriz.posicoes[2].equals(matriz.posicoes[5]) && matriz.posicoes[5].equals(matriz.posicoes[8]))) &&
				(!(matriz.posicoes[0].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[8]))) &&
				(!(matriz.posicoes[2].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[6])))	&&
				!(cont1 == 5)
				) {

			if (cont1 <= cont2) {
				
				System.out.println(nomeprimeirojogador+" informe a posi��o que deseja marcar");
				escolha = leitura.nextLine();
				
				while (matriz.posicoes[Integer.parseInt(escolha)-1].equalsIgnoreCase("X") || 
						matriz.posicoes[Integer.parseInt(escolha)-1].equalsIgnoreCase("O")) {
				System.out.println("Informe a posi��o que deseja marcar");
				escolha = leitura.nextLine();
				}
				
				matriz.posicoes[Integer.parseInt(escolha)-1] = player1;
				matriz.tela();
				cont1++;
			} else {
				
				System.out.println(nomesegundojogador+ " Informe a posi��o que deseja marcar");
				escolha = leitura.nextLine();
				
				while (matriz.posicoes[Integer.parseInt(escolha)-1].equalsIgnoreCase("X") || 
						matriz.posicoes[Integer.parseInt(escolha)-1].equalsIgnoreCase("O")) {
				System.out.println("Informe a posi��o que deseja marcar");
				escolha = leitura.nextLine();
				}
				
				matriz.posicoes[Integer.parseInt(escolha)-1] = player2;
				matriz.tela();
				cont2++;
			}
		}
		
		if (cont1 == 5) {
			System.out.println("-----------------------------");
			System.out.println("	     Deu Velha!!		 ");
			System.out.println("-----------------------------");
		} else {
			if (cont1 > cont2) {
				System.out.println("-----------------------------");
				System.out.println("Parab�ns o player [1] ganhou!");
				System.out.println("-----------------------------");
			} else {

				System.out.println("-----------------------------");
				System.out.println("Parab�ns o player [2] ganhou!");
				System.out.println("-----------------------------");
			}
		}
		
		
	}

}