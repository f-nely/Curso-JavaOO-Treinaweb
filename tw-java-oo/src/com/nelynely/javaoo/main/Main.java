package com.nelynely.javaoo.main;

import com.nelynely.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo corsa = new Veiculo();
		corsa.setMarca("GM");
		corsa.setNome("Corsa");
		corsa.abastecer(10);
		System.out.println(corsa.getQuantidadeCombustivel());
		System.out.println(corsa.getNome());
		corsa.ligar();
		
		Veiculo celta = new Veiculo();
		celta.setMarca("GM");
		celta.setNome("Celta");
		System.out.println(celta.getNome());
		celta.desligar();
	}

}
