package pojo;

public class Profesor extends Persona {

	private String asignatura;

	public Profesor() {
		super();
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + "]";
	}

}
