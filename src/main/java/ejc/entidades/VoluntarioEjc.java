package ejc.entidades;

import java.util.Date;

public class VoluntarioEjc {
	
	private String nome;
	
	private String telefone;
	
	private String urlFoto;
	
	private Date dataNascimento;
	
	private Endereco endereco;
	
	private boolean casado;
	
	private String conjuge;
	
	private boolean fezEcc;
	
	private boolean temCarro;
	
		
	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public boolean isFezEcc() {
		return fezEcc;
	}

	public void setFezEcc(boolean fezEcc) {
		this.fezEcc = fezEcc;
	}

	public boolean isTemCarro() {
		return temCarro;
	}

	public void setTemCarro(boolean temCarro) {
		this.temCarro = temCarro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
		

}
