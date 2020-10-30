package com.nelynely.javaoo.interfaces;

import com.nelynely.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import com.nelynely.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface Andador {
	
	void acelerar() throws AceleracaoVeiculoLigadoException;
	void frear() throws FrenagemVeiculoDesligadoException;
	

}
