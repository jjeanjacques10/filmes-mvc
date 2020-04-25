package br.com.fiap.model;

import java.util.Arrays;

public class FilmeModel {

	long id;
	String nome;
	int anoLancamento;
	int classificacaoIndicativa;
	String duracao;
	String generos;
	String diretores;
	String atoresPrincipais;
	Double notaImdb;
	String sinopse;
	String imagemCartaz;

	public FilmeModel(long id, String nome, int anoLancamento, int classificacaoIndicativa, String duracao,
			String generos, String diretores, String atoresPrincipais, Double notaImdb, String sinopse,
			String imagemCartaz) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.classificacaoIndicativa = classificacaoIndicativa;
		this.duracao = duracao;
		this.generos = generos;
		this.diretores = diretores;
		this.atoresPrincipais = atoresPrincipais;
		this.notaImdb = notaImdb;
		this.sinopse = sinopse;
		this.imagemCartaz = imagemCartaz;
	}

	public FilmeModel(long id, String nome, int anoLancamento, int classificacaoIndicativa, String duracao,
			String generos, String diretores, String atoresPrincipais, Double notaImdb, String sinopse) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.classificacaoIndicativa = classificacaoIndicativa;
		this.duracao = duracao;
		this.generos = generos;
		this.diretores = diretores;
		this.atoresPrincipais = atoresPrincipais;
		this.notaImdb = notaImdb;
		this.sinopse = sinopse;
	}

	@Override
	public String toString() {
		return "FilmeModel [id=" + id + ", nome=" + nome + ", anoLancamento=" + anoLancamento
				+ ", classificacaoIndicativa=" + classificacaoIndicativa + ", duracao=" + duracao + ", generos="
				+ generos + ", diretores=" + diretores + ", atoresPrincipais=" + atoresPrincipais + ", notaImdb="
				+ notaImdb + ", sinopse=" + sinopse + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}

	public String getDiretores() {
		return diretores;
	}

	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}

	public String getAtoresPrincipais() {
		return atoresPrincipais;
	}

	public void setAtoresPrincipais(String atoresPrincipais) {
		this.atoresPrincipais = atoresPrincipais;
	}

	public Double getNotaImdb() {
		return notaImdb;
	}

	public void setNotaImdb(Double notaImdb) {
		this.notaImdb = notaImdb;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

}