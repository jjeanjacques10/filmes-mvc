package br.com.fiap.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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

	public FilmeModel() {

	}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Size(min = 2, max = 100, message = "Nomes deve ter no mínimo 2 e no máximo 100 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Min(value = 1800, message = "Ano de lançamento deve ser no mínimo 1800")
	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	@Min(value = 0, message = "Classificação indicativa deve ser no mínimo 0")
	@Max(value = 18, message = "Classificação indicativa deve ser no máximo 18")
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	@Size(min = 2, max = 9, message = "Duracao deve ter no mínimo 2 e no máximo 9 caracteres")
	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Size(min = 2, max = 200, message = "Generos deve ter no mínimo 2 e no máximo 200 caracteres")
	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}

	@Size(min = 2, max = 200, message = "Diretores deve ter no mínimo 2 e no máximo 200 caracteres")
	public String getDiretores() {
		return diretores;
	}

	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}

	@Size(min = 2, max = 200, message = "Atores principais deve ter no mínimo 2 e no máximo 200 caracteres")
	public String getAtoresPrincipais() {
		return atoresPrincipais;
	}

	public void setAtoresPrincipais(String atoresPrincipais) {
		this.atoresPrincipais = atoresPrincipais;
	}

	@DecimalMin(value = "0.1", message = "Nota deve ser acima de 0.1")
	@Max(value = 10, message = "Nota deve ser no máximo 10")
	public Double getNotaImdb() {
		return notaImdb;
	}

	public void setNotaImdb(Double notaImdb) {
		this.notaImdb = notaImdb;
	}

	@Size(min = 1, max = 500, message = "Sinopse deve ter no mínimo 1 e no máximo 500 caracteres")
	public String getSinopse() {
		return sinopse;
	}

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