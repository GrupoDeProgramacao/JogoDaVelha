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
	
	String Player1 ;
	String Player2 ;
	
	Scanner leitura = new Scanner (System.in);
	
	System.out.println("Olá player [1] deseja jogar com [X] ou com [O]?");
	
	
	
	for (int i = 0; i < 9; i++) {
		
		matriz.posicoes[i] = ""+(i+1)+"  ";
		
			}	
		
	
	matriz.tela();
		
	}
			
}
