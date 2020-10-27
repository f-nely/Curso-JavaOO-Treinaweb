package com.nelynely.javaoo.main;

import com.nelynely.javaoo.classes.Carro;
import com.nelynely.javaoo.classes.Moto;
import com.nelynely.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import com.nelynely.javaoo.excecoes.ChassiInvalidoException;

public class Main {

	public static void main(String[] args) {
		try {
			Carro corsa = new Carro("Corsa", "GM");
			corsa.setChassi("ABCDE");
			corsa.abastecer(10);
			corsa.setQuantidadePortas(4);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			System.out.println(String.format("O veículo %s está ligado? %b", corsa.getNome(), corsa.IsLigado()));
			corsa.abastecer(10);
			corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("A velocidade do veículo: %.2f ", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("A velocidade do veículo: %.2f ", corsa.getVelocidade()));
			Moto fazer = new Moto();
			fazer.setMarca("Yamaha");
			fazer.setNome("Fazer");
			fazer.ligar();
			fazer.acelerar();
			System.out.println(String.format("A velocidade do veículo: %.2f ", fazer.getVelocidade()));
			fazer.frear();
			System.out.println(String.format("A velocidade do veículo: %.2f ", fazer.getVelocidade()));
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado");
		} catch (ChassiInvalidoException e) {
			System.out.println("O chassi é inválido " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		
	}

}
