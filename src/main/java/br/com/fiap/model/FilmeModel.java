package br.com.fiap.model;

import java.util.Arrays;

import javax.validation.constraints.Size;

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
	private String OPetilloDisseParaNaoZuarEntaoVamosFazerUmProjetoMuitoSerioSemPiadaDePintoParaManterOProfissionalismoGrato;

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
	
	@Size(min = 2, max = 40, message = "Nome deve ter no mínimo 2 e no máximo 40 caracteres")
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
	
	@Size(min = 1, max = 200, message = "Descricao deve ter no mínimo 1 e no máximo 200 caracteres")
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getImagemCartaz() {
		return imagemCartaz;
	}

	public void setImagemCartaz(String imagemCartaz) {
		this.imagemCartaz = imagemCartaz;
	}
	
}