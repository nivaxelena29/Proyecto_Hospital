package models.entities;

/**
 * Clase Funcionario desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */
public class Employee extends Person {
	
	private String user;
	private String password;
	
	/**
	 * M�todo constructor de la clase Funcionario
	 * @param name Par�metro se refiere al nombre del funcionario
	 * @param lastName Par�metro se refiere al apellido del funcionario
	 * @param typeDocument Par�metro se refiera al tipo de documento del funcionario
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto del funcionario
	 * @param phone Par�metro se refierte al tel�no del funcionario
	 * @param address Par�metro se refiere a la direcci�n de la casa del funcionario
	 * @param mail Par�metro se refiere al correo electr�nico del funcionario
	 * @param user Par�metro se refiere al usuario del funcionario
	 * @param password Par�metro se refiere a la constrase�a del funcionario
	 * @param state Par�metro se refiere al estado en el que se encuentra un funcionario
	 */
	
	public Employee(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,String user, String password,ModelState state) {
		super(name, lastName, typeDocument,documentNumber,phone,address,mail,state);
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
		return  user + "," + password ;
	}
	
}
