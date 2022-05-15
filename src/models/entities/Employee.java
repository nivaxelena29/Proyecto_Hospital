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
	 * Método constructor de la clase Funcionario
	 * @param name Parámetro se refiere al nombre del funcionario
	 * @param lastName Parámetro se refiere al apellido del funcionario
	 * @param typeDocument Parámetro se refiera al tipo de documento del funcionario
	 * @param documentNumber Parámetro se refiere al número de docuemnto del funcionario
	 * @param phone Parámetro se refierte al telóno del funcionario
	 * @param address Parámetro se refiere a la dirección de la casa del funcionario
	 * @param mail Parámetro se refiere al correo electrónico del funcionario
	 * @param user Parámetro se refiere al usuario del funcionario
	 * @param password Parámetro se refiere a la constraseña del funcionario
	 * @param state Parámetro se refiere al estado en el que se encuentra un funcionario
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
	 * Método toString
	 */

	@Override
	public String toString() {
		return  user + "," + password ;
	}
	
}
