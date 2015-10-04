package com.grupoprogramacaoej;

import java.util.Scanner;

public class Ulisses {
	
	String posicoes [] = new String[9];
	
	//metodo tela criado...
	public void tela(){
		
		System.out.println(posicoes[0]+""+posicoes[1]+""+posicoes[2]);	
		System.out.println(posicoes[3]+""+posicoes[4]+""+posicoes[5]);
		System.out.println(posicoes[6]+""+posicoes[7]+""+posicoes[8]);
	}
	
	
	public static void main(String[] args) {
	
	System.out.println("-----------------------------------------------");
	System.out.println("    BEM-VINDO AO JOGO DA VELHA VERSÃO 1.0");
	System.out.println("-----------------------------------------------");
	System.out.println("                                               ");
	
		// nome da classe + nome qualquer = new + nome da classe();	
	Ulisses matriz = new Ulisses();	
	
	String Player1, Player2, Escolha,nomeprimeirojogador,nomesegundojogador;
	int cont1 = 0 , cont2 = 0;
	
	Scanner leitura = new Scanner (System.in);
	
	for (int i = 0; i < 9; i++) {
		
		matriz.posicoes[i] = ""+(i+1)+"  ";
		}	
		
	System.out.println("Qual nome do primeiro jogador ?");
	nomeprimeirojogador = leitura.nextLine();
	System.out.println("Qual nome do segundo jogador ?");
	nomesegundojogador = leitura.nextLine();
	
	System.out.println("Olá "+nomeprimeirojogador+" você deseja jogar com [X] ou com [O]?");
	Escolha = leitura.nextLine();
	
	while (!(Escolha.equalsIgnoreCase("X") || Escolha.equalsIgnoreCase("O"))) {
		System.out.println(nomeprimeirojogador+" Escolha X ou O");
		Escolha = leitura.nextLine();
		}

		if (Escolha.equalsIgnoreCase("X")) {
			Player1 = "X";
			Player2 = "O";	
		} else {
		
			Player1 = "O";
			Player2 = "X";
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
				)
				
				{
			
			matriz.tela();
			
			if (cont1 <= cont2) {
			
			cont1++;
			
			System.out.println("                                   ");
			System.out.println(nomeprimeirojogador+" informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
			
			//Se o espaço já estiver preenchido ele repete a pergunta
			while (matriz.posicoes[Integer.parseInt(Escolha)-1].equalsIgnoreCase("X") || 
					matriz.posicoes[Integer.parseInt(Escolha)-1].equalsIgnoreCase("O")) {
			System.out.println(nomeprimeirojogador+" informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
			}
			
			
			matriz.posicoes[Integer.parseInt(Escolha)-1] = Player1+"  ";
			
			
			}else
			
			{
			cont2++;	
			System.out.println(nomesegundojogador+" informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
		
			//Se o espaço já estiver preenchido ele repete a pergunta
			while (matriz.posicoes[Integer.parseInt(Escolha)-1].equalsIgnoreCase("X") || 
					matriz.posicoes[Integer.parseInt(Escolha)-1].equalsIgnoreCase("O")) {
			System.out.println(nomesegundojogador+" informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
			}
			
			
			matriz.posicoes[Integer.parseInt(Escolha)-1] = Player2+ "  ";
			
			
			}
					
		
}
		
		matriz.tela();
		
		if (cont1 == 5) {
			System.out.println("-----------------------------");
			System.out.println("	    Deu Velha!!		 ");
			System.out.println("-----------------------------");
		} else {
			if (cont1 > cont2) {
				System.out.println("-----------------------------------------------------");
				System.out.println("Parabéns "+ nomeprimeirojogador+ " você ganhou a partida!");
				System.out.println("-----------------------------------------------------");
			} else {

				System.out.println("-----------------------------------------------------");
				System.out.println("Parabéns "+ nomesegundojogador+ " você ganhou a partida!");
				System.out.println("-----------------------------------------------------");
			}
		}
			
	}
}
