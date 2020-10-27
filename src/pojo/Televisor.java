package pojo;

public class Televisor extends Electrodomestico {

	private int pulgadas;

	public Televisor() {
		super();
	}

	public Televisor(String nombre, float precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + " Televisor [pulgadas=" + pulgadas + "]";
	}

}
