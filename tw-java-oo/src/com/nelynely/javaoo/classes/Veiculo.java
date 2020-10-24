package com.nelynely.javaoo.classes;

import com.nelynely.javaoo.excecoes.ChassiInvalidoException;

public class Veiculo {
	private String nome;
	private String marca;
	private String chassi;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) throws Exception{
		if (chassi.length() == 5) {
			this.chassi = chassi;
		} else {
			throw new ChassiInvalidoException(chassi);
		}
		
	}
	
	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}
	
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public void ligar() {
		System.out.println("O ve�culo ligou: ");
	}
	
	public void desligar() {
		System.out.println("O ve�culo desligou: ");
	}
	
	public void abastecer(float litros) {
		quantidadeCombustivel += litros;
	}
}
