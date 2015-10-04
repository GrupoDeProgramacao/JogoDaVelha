package com.grupoprogramacaoej;



public class Ulisses {

	String posicoes[] = new String[9];
	
	public void tela () {
		System.out.println(posicoes[0]+""+posicoes[1]+""+posicoes[2]);
		System.out.println(posicoes[3]+""+posicoes[4]+""+posicoes[5]);
		System.out.println(posicoes[6]+""+posicoes[7]+""+posicoes[8]);
	}
	
	
	public static void main(String[] args) {	

		Ulisses matriz = new Ulisses();
		
		for (int i = 0; i < 9; i++) {
			matriz.posicoes[i] = ""+(i+1);
		}
		
	}

}