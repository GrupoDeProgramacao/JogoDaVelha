package com.grupoprogramacaoej;

public class skill {
	
	String posicoes [] = new String[9];
	
	//metodo tela criado...
	public void tela(){
		
		System.out.println(posicoes[0]+""+posicoes[1]+""+posicoes[2]);	
		
	}
	
	
	public static void main(String[] args) {
		
	skill tela = new skill();	
		
	for (int i = 0; i < 9; i++) {
		
		tela.posicoes[i] = ""+(i+1);
		
			
		}	
		
		
	}
			
}
