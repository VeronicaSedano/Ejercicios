package pojo;

public class TelevisionPlana extends Televisor {

	private String tipoPantalla;

	public TelevisionPlana() {
		super();
		this.tipoPantalla = "tft";
	}

	public TelevisionPlana(String nombre, float precio, int pulgadas, String tipoPantalla) {
		super(nombre, precio, pulgadas);
		this.tipoPantalla = tipoPantalla;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return super.toString() + " TelevisionPlana [tipoPantalla=" + tipoPantalla + "]";
	}

}
