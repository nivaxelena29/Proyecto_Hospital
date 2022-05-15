package models.entities;
/*
 * Trabajo realizado por Angela Yurani Vargas
 */
public enum ModelState {
	ACTIVO("Activo"),INACTIVO("Inactivo");
	private String state;

	public String getState() {
		return state;
	}

	private ModelState(String state) {
		this.state = state;
	}
	

}
