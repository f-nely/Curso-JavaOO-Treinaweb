package com.nelynely.javaoo.interfaces;

import com.nelynely.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {
	
	void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;
	void preparar();
}
