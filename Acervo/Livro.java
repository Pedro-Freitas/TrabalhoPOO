package com.lzpf.Acervo;

public class Livro 
extends Documento
{

	public Livro(String titulo, String autor, String assunto, int anoPub, int numPags) {
		super(titulo, autor, assunto, anoPub, numPags);
	}

	@Override
	public String toString() {
		return "Livro de ID " + getID() + "-> Titulo: " + getTitulo() + ", Autor: " + getAutor() + ", Assunto: " + getAssunto()
				+ ", Ano de publicação: " + getAnoPub() + ", Numero de Paginas: " + getNumPags();
	}
	

}
