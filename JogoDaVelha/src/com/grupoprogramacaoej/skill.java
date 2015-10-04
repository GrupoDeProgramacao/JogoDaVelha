package com.grupoprogramacaoej;

import java.util.Scanner;

public class skill {
	
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
	skill matriz = new skill();	
	
	String Player1, Player2, Escolha ;
	int cont1 = 0 , cont2 = 0;
	
	Scanner leitura = new Scanner (System.in);
	
	for (int i = 0; i < 9; i++) {
		
		matriz.posicoes[i] = ""+(i+1)+"  ";
		}	
		
	matriz.tela();
		
	
	System.out.println("Olá player [1] deseja jogar com [X] ou com [O]?");
	Escolha = leitura.nextLine();
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
				(!(matriz.posicoes[0].equals(matriz.posicoes[3]) && matriz.posicoes[3].equals(matriz.posicoes[5]))) &&
				(!(matriz.posicoes[1].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[7]))) &&
				(!(matriz.posicoes[2].equals(matriz.posicoes[5]) && matriz.posicoes[5].equals(matriz.posicoes[8]))) &&
				(!(matriz.posicoes[0].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[8]))) &&
				(!(matriz.posicoes[2].equals(matriz.posicoes[4]) && matriz.posicoes[4].equals(matriz.posicoes[8])))				
				)
				
				{
			
			
			if (cont1 <= cont2) {
			
			cont1++;
			
			System.out.println("Informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
			matriz.posicoes[Integer.parseInt(Escolha)-1] = Player1+"  ";
			
			matriz.tela();
			}else
			
			{
			cont2++;	
			System.out.println("Informe a posição que deseja marcar");
			Escolha = leitura.nextLine();
			matriz.posicoes[Integer.parseInt(Escolha)-1] = Player2+ "  ";
			matriz.tela();
			
			}
			
			if (cont1 > cont2) {
				
				System.out.println("-----------------------------");
				System.out.println("Parabéns o player [1] ganhou!");
				System.out.println("-----------------------------");
			} else {
				if (cont2 > cont1) {
					System.out.println("-----------------------------");
					System.out.println("Parabéns o player [2] ganhou!");
					System.out.println("-----------------------------");
				}else {
					if (cont1 == cont2) {
						
						System.out.println("-----------------------------");
						System.out.println("         Deu velha!");
						System.out.println("-----------------------------");
						
					}
				}
			}
		
		
}
			
}
}
