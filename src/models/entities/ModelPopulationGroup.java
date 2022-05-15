package models.entities;

/*
 * Trabajo realizado por Angela Yurani Vargas
 */

public enum ModelPopulationGroup {
	DESPLAZADOS("Desplazado"), INDIGENAS("Ind�gena");
	private String populationGroup;

	public String getPopulationGroup() {
		return populationGroup;
	}

	private ModelPopulationGroup(String populationGroup) {
		this.populationGroup = populationGroup;
	}
	

}
