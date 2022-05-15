package models.dao;

import java.util.ArrayList;

import models.entities.Administrator;
import models.entities.ModelState;
import models.entities.ModelTypeDocument;
import myExceptions.AdministratorNotFound;

/**
 * Clase Manager Administrador desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */

public class ManagerAdministrator {
	
	private ArrayList<Administrator> administratorList;

	/**
	 * Método constructor de la clase Manager Aadministrador
	 */
	
	public ManagerAdministrator() {
		this.administratorList=new ArrayList<Administrator>();
		Administrator administrator= ManagerAdministrator.createAdministrator("Niva4", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "niva1", "123", ModelState.ACTIVO);
		Administrator administrator2= ManagerAdministrator.createAdministrator("Niva1", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "niva13", "123ar", ModelState.ACTIVO);
		Administrator administrator3= ManagerAdministrator.createAdministrator("Niva2", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "niva14", "123ir", ModelState.ACTIVO);
		Administrator administrator4= ManagerAdministrator.createAdministrator("Niva3", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "niva15", "123or", ModelState.ACTIVO);
		administratorList.add(administrator);
		administratorList.add(administrator2);
		administratorList.add(administrator3);
		administratorList.add(administrator4);
	}
	
	/**
	 * Método crea un nuevo administrador
	 * @param name Parámetro se refiere al nombre de la administrador
	 * @param lastName Parámetro se refiere al apellido del administrador
	 * @param typeDocument Parámetro se refiera al tipo de documento del administardor
	 * @param documentNumber Parámetro se refiere al número de docuemnto del administrador
	 * @param user Parámetro se refiere al usuario del administardor
	 * @param password Parámetro se refiere a la constraseña dl administrador
	 * @param state Parámetro se refiere al estado en el que se encuentra la persona
	 * @param phone Parámetro se refiere al número de teléfono del administrador
	 * @param address Parámetro se refiere a la dirección del administrador
	 * @param mail Parámetro se refiere al correo del administrador
	 * @return Retorna un objeto de tipo administrador
	 */
	
	public static Administrator createAdministrator(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,String user, String password, ModelState state){
		return new Administrator(name, lastName, typeDocument, documentNumber, phone, address, mail, user, password, state);
	}
	
	/**
	 * Método agrega un admnistrador a la lista de administradorres
	 * @param administrator Parámetro se refiere a un objeto de tipo administrador
	 */
	
	public void addAdministrator(Administrator administrator){
		administratorList.add(administrator);
	}
	
	/**
	 * Método busca un administrador por su número de documento 
	 * @param id Parámetro se refiere al número de documento del administrador
	 * @return Retorna un objeto de tipo administrador si se llega a encontrar en la lista
	 * @throws AdministratorNotFound Excepción en el caso de que no se encuentre el administrador
	 */
	
	public Administrator searchAdministratorById(String id)  throws AdministratorNotFound{
		for (Administrator administrator : administratorList) {
			if (administrator.getDocumentNumber().compareTo(id)==0) {
				return administrator;
			}
		}
		throw new AdministratorNotFound();

	}
	
	public Administrator searchAdministratorByUser(String user)  throws AdministratorNotFound{
		for (Administrator administrator : administratorList) {
			if (administrator.getUser().compareTo(user)==0) {
				return administrator;
			}
		}
		throw new AdministratorNotFound();

	}
	
	/**
	 * Método cambia el estado de un administrador a falso
	 * @param id Parámetro se refiere al número de documento del admnistrador
	 * @throws AdministratorNotFound Excepeción en el caso de que no se encuentre el administrador
	 */
	
	public void deleteClient(String id) throws AdministratorNotFound{
		Administrator administrator = searchAdministratorById(id);
		administrator.setState(ModelState.INACTIVO);
	}

	public ArrayList<Administrator> getAdministratorList() {
		return administratorList;
	}

	public void setAdministratorList(ArrayList<Administrator> administratorList) {
		this.administratorList = administratorList;
	}
	
	
}
