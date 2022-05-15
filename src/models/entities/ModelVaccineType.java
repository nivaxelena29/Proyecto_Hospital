package models.entities;

/*
 * Trabajo realizado por Angela Yurani Vargas
 */

public enum ModelVaccineType {
	JANSSEN("Janssen"),PFIZER("Pfizer"),ASTRAZENECA("Astrazeneca"),
	MODERNA("Moderna");
	private String vaccineType;

	public String getVaccineType() {
		return vaccineType;
	}

	private ModelVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}
	

}
