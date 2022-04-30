package ejc.entidades;

public class VoluntarioEjc extends Pessoa {

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

}
