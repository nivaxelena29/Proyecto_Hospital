package models.entities;
/*
 * Trabajo realizado por Angela Yurani Vargas
 */
public enum ModelTypeUser {
	ADMINISTRADOR("Administrador"),FUNCIONARIO("Funcionario");
	private String user;

	public String getUser() {
		return user;
	}

	private ModelTypeUser(String user) {
		this.user = user;
	}
	

}
