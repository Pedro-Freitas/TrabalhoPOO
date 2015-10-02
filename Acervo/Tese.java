package com.lzpf.Acervo;

public class Tese 
extends Documento{
	
	private String area;
	private String universidade;
	
	
	public Tese(String titulo, String autor, String assunto, int anoPub, int numPags) {
		super(titulo, autor, assunto, anoPub, numPags);
	}

}
