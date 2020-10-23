package com.nelynely.javaoo.main;

import com.nelynely.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		try {
			Veiculo corsa = new Veiculo();
			corsa.setMarca("GM");
			corsa.setNome("Corsa");
			corsa.setChassi("ABCE");
			corsa.abastecer(10);
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getNome());
			corsa.ligar();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		
	}

}
