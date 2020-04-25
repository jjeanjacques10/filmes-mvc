package br.com.fiap.model;

public class FilmeModel {
	private String nome;
	private String sinopse;
	private String duracao;
	private int classificacaoIndicativa;
	private int AnoLancamento;
	private String[] generos;
	private String[] atoresPrincipais;
	private String diretor;
	private Double notaImdb;

	public FilmeModel(String nome, String sinopse, String duracao, int classificacaoIndicativa, int anoLancamento,
			String[] generos, String[] atoresPrincipais, String diretor, Double notaImdb) {
		super();
		this.nome = nome;
		this.sinopse = sinopse;
		this.duracao = duracao;
		this.classificacaoIndicativa = classificacaoIndicativa;
		AnoLancamento = anoLancamento;
		this.generos = generos;
		this.atoresPrincipais = atoresPrincipais;
		this.diretor = diretor;
		this.notaImdb = notaImdb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public int getAnoLancamento() {
		return AnoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		AnoLancamento = anoLancamento;
	}

	public String[] getGeneros() {
		return generos;
	}

	public void setGeneros(String[] generos) {
		this.generos = generos;
	}

	public String[] getAtoresPrincipais() {
		return atoresPrincipais;
	}

	public void setAtoresPrincipais(String[] atoresPrincipais) {
		this.atoresPrincipais = atoresPrincipais;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Double getNotaImdb() {
		return notaImdb;
	}

	public void setNotaImdb(Double notaImdb) {
		this.notaImdb = notaImdb;
	}
}
