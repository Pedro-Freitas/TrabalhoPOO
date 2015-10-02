package com.lzpf.Acervo;

public abstract class Documento {
	
	/** Numero acumulado de documentos. 
	 *  //TODO: Adicionar maneira de atualizar este numero com a leitura do arquivo.	
	 */
	private static long numDocs=0;
	
	/**
	 * Identifica��o UNICA do objeto
	 */
	private long ID;
	
	/** Titulo do documento */
	private String titulo;
	
	/** Autor do documento */
	private String autor;
	
	/** Assunto envolvido : Pode ser usado como uma "Tag" para pesquisas */
	private String assunto;
	
	/** Ano de publica��o */
	private int anoPub;
	/** Numero de paginas */
	private int numPags;
	
	//Construtores:
	/**
	 * Construtor padr�o de um documento - Recebe tudo menos ID. Deve sempre ser usado na cria��o de novos docs
	 */
	public Documento(String titulo, String autor, String assunto, int anoPub, int numPags) {
		
		this.ID = nextID();
		
		this.titulo = titulo;
		this.autor = autor;
		this.assunto = assunto;
		this.anoPub = anoPub;
		this.numPags = numPags;
	}

	//M�todos private:
	
	/**
	 * Retorna o proximo numero a ser utilizado como Identidade unica de um doc.
	 * ATUALIZA O NUMERO DE DOCUMENTOS EXISTENTES<p>
	 * @return nextID - proximo numero a ser usado como ID
	 */
	private static long nextID()
	{
		long nextID = numDocs;
		numDocs++;
		return nextID;
	}
	
	//M�todos publicos:
	
	
	
	//	Getters e setters:
	
	/**
	 * @return titulo - titulo do documento
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * @return autor - autor do documento
	 */
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * @return assunto - assunto do documento
	 */
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	/**
	 * @return anoPub - ano de publica��o do documento
	 */
	public int getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}
	
	/**
	 * @return numPags - numero de paginas do documento
	 */
	public int getNumPags() {
		return numPags;
	}

	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	/**
	 * @return numDocs - numero de documentos existentes
	 */
	public static long getNumDocs() {
		return numDocs;
	}
	
	/**
	 * @return ID - numero unico de identifica��o de um documento
	 */
	public long getID() {
		return ID;
	}
	
	
	
	
}
