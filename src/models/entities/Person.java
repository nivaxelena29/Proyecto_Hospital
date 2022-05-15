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
	 * M�todo constructor de la clase Persona sin par�metros
	 */
	
	public Person() {
		
	}
	
	/**
	 * M�todo constructor de la clase Persona
	 * @param name Par�metro se refiere al nombre de la persona
	 * @param lastName Par�metro se refiere al apellido de la persona
	 * @param typeDocument Par�metro se refiera al tipo de documento de la persona
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto de la persona
	 * @param phone Par�metro se refierte al tel�no de la persona
	 * @param address Par�metro se refiere a la direcci�n de la casa de la perosna
	 * @param mail Par�metro se refiere al correo electr�nico de la perosna
	 * @param state Par�metro se refiere al estado en el que se encuentra la persona
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
	 * M�todo constructor de la clase Persona
	 * @param name Par�metro se refiere al nombre de la persona
	 * @param lastName Par�metro se refiere al apellido de la persona
	 * @param typeDocument Par�metro se refiera al tipo de documento de la persona
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto de la persona
	 * @param state Par�metro se refiere al estado en el que se encuentra la persona
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
	 * M�todo toString 
	 */
	
	@Override
	public String toString() {
		return name + "," + lastName + "," + typeDocument
				+ "," + documentNumber + "," + phone + "," + address + "," + mail+","+state
				;
	}
}
