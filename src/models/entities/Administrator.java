package models.entities;

/**
 * Clase Administrador desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */
public class Administrator extends Person {
	
	private String user;
	private String password;
	
	/**
	 * Método constructor de la clase Administrador
	 * @param name Parámetro se refiere al nombre de la administrador
	 * @param lastName Parámetro se refiere al apellido del administrador
	 * @param typeDocument Parámetro se refiera al tipo de documento del administardor
	 * @param documentNumber Parámetro se refiere al número de docuemnto del administrador
	 * @param user Parámetro se refiere al usuario del administardor
	 * @param password Parámetro se refiere a la constraseña dl administrador
	 * @param state Parámetro se refiere al estado en el que se encuentra la persona
	 * @param phone Parámetro se refiere al número de teléfono del administrador
	 * @param address Parámetro se refiere a la dirección del administrador
	 * @param mail Parámetro se refiere al correo del administrador
	 */
	
	public Administrator(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,String user, String password, ModelState state) {
		super(name, lastName, typeDocument,documentNumber,state);
		this.user = user;
		this.password = password;
	}
	
	
	//-----------------getters and setters---------------
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return  user + password ;
	}
	
}
