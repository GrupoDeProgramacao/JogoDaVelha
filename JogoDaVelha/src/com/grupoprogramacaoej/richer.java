package com.grupoprogramacaoej;

public class richer {

	String posicoes[] = new String[9];
	
	public void tela () {
		System.out.println(posicoes[0]+""+posicoes[1]+""+posicoes[2]);
	}
	
	
	public static void main(String[] args) {	

		richer matriz = new richer();
		
		for (int i = 0; i < 9; i++) {
			matriz.posicoes[i] = ""+(i+1);
		}
		
	}

}
