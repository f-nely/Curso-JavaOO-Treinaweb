package com.nelynely.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	public ChassiInvalidoException(String chassi) {
		super(String.format("Esse chassi � inv�lido [%s] ", chassi));
	}
}
