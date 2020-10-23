package com.nelynely.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	public ChassiInvalidoException(String chassi) {
		super(String.format("Esse chassi é inválido [%s] ", chassi));
	}
}
