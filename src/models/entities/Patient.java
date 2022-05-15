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
	 * M�todo constructor de la clase Paciente
	 * @param name Par�metro se refiere al nombre del paciente
	 * @param lastName Par�metro se refiere al apellido del paciente
	 * @param typeDocument Par�metro se refiera al tipo de documento del paciente
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto del paciente
	 * @param phone Par�metro se refierte al tel�no del paciente
	 * @param address Par�metro se refiere a la direcci�n de la casa del paciente
	 * @param mail Par�metro se refiere al correo electr�nico del paciente
	 * @param user Par�metro se refiere al usuario del paciente
	 * @param password Par�metro se refiere a la constrase�a del paciente
	 * @param birthday  Par�metro se refiere al cumplea�os del paciente
	 * @param vaccineType  Par�metro se refiere al tipo de vacuna del paciente
	 * @param numberOfDoses  Par�metro se refiere al n�mero de dosis del paciente
	 * @param nextDateDoses  Par�metro se refiere a la fecha de la siguiente dosis del paciente
	 * @param populationGroup  Par�metro se refiere al grupo poblacional en el que se encuentra el paciente
	 * @param state Par�metro se refiere al estado en el que se encuentra el paciente
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
	 * M�todo toString
	 */
	
	@Override
	public String toString() {
		return birthday + ","
				+ vaccineType + "," + numberOfDoses + "," + nextDateDoses
				+ "," + populationGroup ;
	}
	
}
