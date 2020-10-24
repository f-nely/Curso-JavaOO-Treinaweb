package com.nelynely.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	private static final long serialVersionUID = 2056228056904801283L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Esse chassi é inválido [%s] ", chassi));
	}
}
