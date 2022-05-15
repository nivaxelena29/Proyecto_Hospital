package models.dao;

import java.util.ArrayList;

import models.entities.ModelPopulationGroup;
import models.entities.ModelState;
import models.entities.ModelTypeDocument;
import models.entities.ModelVaccineType;
import models.entities.Patient;
import myExceptions.AdministratorNotFound;
import myExceptions.PatientNotFound;

/**
 * Clase Manager Pacientes desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */

public class ManagerPatient {
	
	private ArrayList<Patient> patientList;

	/**
	 * Método constructor de la clase Manager Pacientes
	 */
	
	public ManagerPatient() {
		this.patientList=new ArrayList<Patient>();
		Patient patient1= ManagerPatient.createEmployee("Angela", "G", ModelTypeDocument.CEDULA_EXTRANJERIA, "123", "54452", "Calle20", "a4223ngela@gmail.com", ModelState.ACTIVO, "29/04/98", ModelVaccineType.JANSSEN, 1, "22/07/22", ModelPopulationGroup.INDIGENAS);
		Patient patient2= ManagerPatient.createEmployee("Angela321", "G", ModelTypeDocument.CEDULA_EXTRANJERIA, "12433", "54452", "Calle20", "ange432la@gmail.com", ModelState.ACTIVO, "29/04/98", ModelVaccineType.JANSSEN, 1, "22/07/22", ModelPopulationGroup.DESPLAZADOS);
		Patient patient3= ManagerPatient.createEmployee("Angelaewqq", "G", ModelTypeDocument.CEDULA_EXTRANJERIA, "14223", "54452", "Calle20", "angela@gmail.com", ModelState.INACTIVO, "29/04/98", ModelVaccineType.ASTRAZENECA, 1, "22/07/22", ModelPopulationGroup.INDIGENAS);
		Patient patient4= ManagerPatient.createEmployee("Angela4542", "G", ModelTypeDocument.CEDULA_EXTRANJERIA, "124233", "54452", "Calle20", "angela@4242gmail.com", ModelState.ACTIVO, "29/04/98", ModelVaccineType.JANSSEN, 1, "22/07/22", ModelPopulationGroup.INDIGENAS);
		patientList.add(patient1);
		patientList.add(patient2);
		patientList.add(patient3);
		patientList.add(patient4);
	}
	
	/**
	 * Método crea un objeto de tipo Paciente
	 * @param name Parámetro se refiere al nombre del paciente
	 * @param lastName Parámetro se refiere al apellido del paciente
	 * @param typeDocument Parámetro se refiera al tipo de documento del paciente
	 * @param documentNumber Parámetro se refiere al número de docuemnto del paciente
	 * @param phone Parámetro se refierte al telóno del paciente
	 * @param address Parámetro se refiere a la dirección de la casa del paciente
	 * @param mail Parámetro se refiere al correo electrónico del paciente
	 * @param birthday  Parámetro se refiere al cumpleaños del paciente
	 * @param vaccineType  Parámetro se refiere al tipo de vacuna del paciente
	 * @param numberOfDoses  Parámetro se refiere al número de dosis del paciente
	 * @param nextDateDoses  Parámetro se refiere a la fecha de la siguiente dosis del paciente
	 * @param populationGroup  Parámetro se refiere al grupo poblacional en el que se encuentra el paciente
	 * @param state Parámetro se refiere al estado en el que se encuentra el paciente
	 * @return Retorna un objeto de tipo paciente
	 */
	
	public static Patient createEmployee(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,ModelState state, String birthday, ModelVaccineType vaccineType,
			int numberOfDoses,String nextDateDoses, ModelPopulationGroup populationGroup){
		return new Patient(name, lastName, typeDocument, documentNumber, phone, address, mail,  state, 
				birthday, vaccineType, numberOfDoses, nextDateDoses, populationGroup);
	}
	
	/**
	 * Método agrega un paciente a la lista de pacientes
	 * @param patient Parámetro se refiere a un objeto de tipo paciente
	 */
	
	public void addPatient(Patient patient){
		patientList.add(patient);
	}
	
	/**
	 * Método busca un paciente por su número de documento 
	 * @param id Parámetro se refiere al número de documento del paciente
	 * @return Retorna un objeto de tipo paciente si se llega a encontrar en la lista
	 * @throws PatientNotFound Excepción en el caso de que no se encuentre el paciente
	 */
	
	public Patient searchPatientById(String id)  throws PatientNotFound{
		for (Patient patient : patientList) {
			if (patient.getDocumentNumber().compareTo(id)==0) {
				return patient;
			}
		}
		throw new PatientNotFound();

	}
	
	/**
	 * Método cambia el estado de un paciente a falso
	 * @param id Parámetro se refiere al número de documento del paciente
	 * @throws AdministratorNotFound Excepción en el caso de que no se encuentre el paciente
	 */
	
	public void deleteEmployee(String id) throws PatientNotFound{
		Patient patient = searchPatientById(id);
		patient.setState(ModelState.INACTIVO);
	}

	public ArrayList<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(ArrayList<Patient> patientList) {
		this.patientList = patientList;
	}
	
	
}
