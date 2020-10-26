package com.nelynely.javaoo.main;

import com.nelynely.javaoo.classes.Carro;
import com.nelynely.javaoo.classes.Moto;

public class Main {

	public static void main(String[] args) {
		try {
			/*Carro corsa = new Carro();
			corsa.setMarca("GM");
			corsa.setNome("Corsa");*/
			Carro corsa = new Carro("Corsa", "GM");
			corsa.setChassi("ABCDE");
			corsa.abastecer(10);
			corsa.setQuantidadePortas(4);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			System.out.println(String.format("O veiculo %s está ligado? %b", corsa.getNome(), corsa.IsLigado()));
			corsa.ligar();
			Moto fazer = new Moto();
			fazer.setMarca("Yamaha");
			fazer.setNome("Fazer");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		
	}

}
