package models.entities;

/*
 * Trabajo realizado por Angela Yurani Vargas
 */
public enum ModelTypeDocument {
	CEDULA("C�dula"),TARJETA_IDENTIDAD("Tarjeta de Identidad"),CEDULA_EXTRANJERIA("C�dula de extranjer�a"),
	REGISTRO_CIVIL("Registro Civil"),	CARNE_DIPLOMATICO("Carn� Diplomatico"),
	PASAPORTE("Pasaporte"),PERMISO_ESPECIAL_PERMANENCIA("Permiso especial de Permanencia"),
	SALVOCONDUCTO_PERMANENCIA("Salvoconducto de Permanencia"),PERMISO_PROTECCION_TEMPORAL("Permiso por Protecci�n Temporal"),
	NIT("Nit"),PASAPORTE_ONU("Pasaporte de la ONU"),CERTIFICADO_NACIDO_VIVO("Certificado Nacido Vivo");
	private String typeOfDocument;

	public String getTypeDocument() {
		return typeOfDocument;
	}

	private ModelTypeDocument(String typeOfDocument) {
		this.typeOfDocument = typeOfDocument;
	}
	

}
