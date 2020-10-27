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
			System.out.println(String.format("O ve�culo %s est� ligado? %b", corsa.getNome(), corsa.IsLigado()));
			corsa.abastecer(10);
			corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("A velocidade do ve�culo: %.2f ", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("A velocidade do ve�culo: %.2f ", corsa.getVelocidade()));
			Moto fazer = new Moto();
			fazer.setMarca("Yamaha");
			fazer.setNome("Fazer");
			fazer.ligar();
			fazer.acelerar();
			System.out.println(String.format("A velocidade do ve�culo: %.2f ", fazer.getVelocidade()));
			fazer.frear();
			System.out.println(String.format("A velocidade do ve�culo: %.2f ", fazer.getVelocidade()));
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Voc� n�o pode abastecer um ve�culo enquanto ele estiver ligado");
		} catch (ChassiInvalidoException e) {
			System.out.println("O chassi � inv�lido " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		
	}

}
