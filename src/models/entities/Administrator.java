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
	 * M�todo constructor de la clase Administrador
	 * @param name Par�metro se refiere al nombre de la administrador
	 * @param lastName Par�metro se refiere al apellido del administrador
	 * @param typeDocument Par�metro se refiera al tipo de documento del administardor
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto del administrador
	 * @param user Par�metro se refiere al usuario del administardor
	 * @param password Par�metro se refiere a la constrase�a dl administrador
	 * @param state Par�metro se refiere al estado en el que se encuentra la persona
	 * @param phone Par�metro se refiere al n�mero de tel�fono del administrador
	 * @param address Par�metro se refiere a la direcci�n del administrador
	 * @param mail Par�metro se refiere al correo del administrador
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
	 * M�todo toString
	 */

	@Override
	public String toString() {
		return  user + password ;
	}
	
}
