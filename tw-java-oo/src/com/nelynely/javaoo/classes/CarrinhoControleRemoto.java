package com.nelynely.javaoo.classes;

import com.nelynely.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import com.nelynely.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import com.nelynely.javaoo.interfaces.Andador;
import com.nelynely.javaoo.interfaces.Ligador;

public class CarrinhoControleRemoto implements Ligador, Andador{

	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear() throws FrenagemVeiculoDesligadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

}
