package models.entities;

/**
 * Clase Paciente desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */
public class Patient extends Person {
	

	private String birthday;
	private ModelVaccineType vaccineType;
	private int numberOfDoses;
	private String nextDateDoses;
	private ModelPopulationGroup populationGroup;

	
	/**
	 * Método constructor de la clase Paciente
	 * @param name Parámetro se refiere al nombre del paciente
	 * @param lastName Parámetro se refiere al apellido del paciente
	 * @param typeDocument Parámetro se refiera al tipo de documento del paciente
	 * @param documentNumber Parámetro se refiere al número de docuemnto del paciente
	 * @param phone Parámetro se refierte al telóno del paciente
	 * @param address Parámetro se refiere a la dirección de la casa del paciente
	 * @param mail Parámetro se refiere al correo electrónico del paciente
	 * @param user Parámetro se refiere al usuario del paciente
	 * @param password Parámetro se refiere a la constraseña del paciente
	 * @param birthday  Parámetro se refiere al cumpleaños del paciente
	 * @param vaccineType  Parámetro se refiere al tipo de vacuna del paciente
	 * @param numberOfDoses  Parámetro se refiere al número de dosis del paciente
	 * @param nextDateDoses  Parámetro se refiere a la fecha de la siguiente dosis del paciente
	 * @param populationGroup  Parámetro se refiere al grupo poblacional en el que se encuentra el paciente
	 * @param state Parámetro se refiere al estado en el que se encuentra el paciente
	 */
	
	public Patient(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,ModelState state, String birthday, ModelVaccineType vaccineType,
			int numberOfDoses,String nextDateDoses, ModelPopulationGroup populationGroup) {
		super(name, lastName, typeDocument,documentNumber,phone,address,mail,state);
		
		this.birthday = birthday;
		this.vaccineType = vaccineType;
		this.numberOfDoses = numberOfDoses;
		this.nextDateDoses = nextDateDoses;
		this.populationGroup = populationGroup;
	}
	
	//-----------------getters and setters---------------
	
	

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public ModelVaccineType getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(ModelVaccineType vaccineType) {
		this.vaccineType = vaccineType;
	}

	public int getNumberOfDoses() {
		return numberOfDoses;
	}

	public void setNumberOfDoses(int numberOfDoses) {
		this.numberOfDoses = numberOfDoses;
	}

	public String getNextDateDoses() {
		return nextDateDoses;
	}

	public void setNextDateDoses(String nextDateDoses) {
		this.nextDateDoses = nextDateDoses;
	}

	public ModelPopulationGroup getPopulationGroup() {
		return populationGroup;
	}

	public void setPopulationGroup(ModelPopulationGroup populationGroup) {
		this.populationGroup = populationGroup;
	}

	/**
	 * Método toString
	 */
	
	@Override
	public String toString() {
		return birthday + ","
				+ vaccineType + "," + numberOfDoses + "," + nextDateDoses
				+ "," + populationGroup ;
	}
	
}
