package pojo;

public class Estudiante extends Persona {

	private float notaMedia;

	public Estudiante() {
		super();
		this.notaMedia = notaMedia;
	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Estudiante [notaMedia=" + notaMedia + "]";
	}

}
