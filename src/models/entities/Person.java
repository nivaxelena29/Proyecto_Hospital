package models.entities;

/**
 * Clase Persona desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */

public class Person {
	
	
	private String name;
	private String lastName;
	private ModelTypeDocument typeDocument;
	private String documentNumber;
	private String phone;
	private String address;
	private String mail;
	private ModelState state;
	
	/**
	 * Método constructor de la clase Persona sin parámetros
	 */
	
	public Person() {
		
	}
	
	/**
	 * Método constructor de la clase Persona
	 * @param name Parámetro se refiere al nombre de la persona
	 * @param lastName Parámetro se refiere al apellido de la persona
	 * @param typeDocument Parámetro se refiera al tipo de documento de la persona
	 * @param documentNumber Parámetro se refiere al número de docuemnto de la persona
	 * @param phone Parámetro se refierte al telóno de la persona
	 * @param address Parámetro se refiere a la dirección de la casa de la perosna
	 * @param mail Parámetro se refiere al correo electrónico de la perosna
	 * @param state Parámetro se refiere al estado en el que se encuentra la persona
	 */
	
	public Person(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail, ModelState state) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.typeDocument = typeDocument;
		this.documentNumber = documentNumber;
		this.phone = phone;
		this.address = address;
		this.mail = mail;
		this.state=state;
	}
	
	/**
	 * Método constructor de la clase Persona
	 * @param name Parámetro se refiere al nombre de la persona
	 * @param lastName Parámetro se refiere al apellido de la persona
	 * @param typeDocument Parámetro se refiera al tipo de documento de la persona
	 * @param documentNumber Parámetro se refiere al número de docuemnto de la persona
	 * @param state Parámetro se refiere al estado en el que se encuentra la persona
	 */
	
	public Person(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, ModelState state) {
		this.name = name;
		this.lastName = lastName;
		this.typeDocument = typeDocument;
		this.documentNumber = documentNumber;
		this.state=state;
	}
	//----------------Getters and setters--------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ModelTypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(ModelTypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	

	public ModelState isState() {
		return state;
	}

	public void setState(ModelState state) {
		this.state = state;
	}

	/**
	 * Método toString 
	 */
	
	@Override
	public String toString() {
		return name + "," + lastName + "," + typeDocument
				+ "," + documentNumber + "," + phone + "," + address + "," + mail+","+state
				;
	}
}
