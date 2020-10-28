package com.nelynely.javaoo.classes;

import com.nelynely.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import com.nelynely.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public final class Moto extends Veiculo{
	
	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if (this.IsLigado()) {
			this.velocidade += 3;
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	
	@Override
	public void frear() throws FrenagemVeiculoDesligadoException {
		if (this.IsLigado()) {
			this.velocidade -= 3;
		} else {
			throw new FrenagemVeiculoDesligadoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Colocar o capacete: ");
		
	}

}
