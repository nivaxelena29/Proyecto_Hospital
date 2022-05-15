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
	 * M�todo constructor de la clase Manager Aadministrador
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
	 * M�todo crea un nuevo administrador
	 * @param name Par�metro se refiere al nombre de la administrador
	 * @param lastName Par�metro se refiere al apellido del administrador
	 * @param typeDocument Par�metro se refiera al tipo de documento del administardor
	 * @param documentNumber Par�metro se refiere al n�mero de docuemnto del administrador
	 * @param user Par�metro se refiere al usuario del administardor
	 * @param password Par�metro se refiere a la constrase�a dl administrador
	 * @param state Par�metro se refiere al estado en el que se encuentra la persona
	 * @param phone Par�metro se refiere al n�mero de tel�fono del administrador
	 * @param address Par�metro se refiere a la direcci�n del administrador
	 * @param mail Par�metro se refiere al correo del administrador
	 * @return Retorna un objeto de tipo administrador
	 */
	
	public static Administrator createAdministrator(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,String user, String password, ModelState state){
		return new Administrator(name, lastName, typeDocument, documentNumber, phone, address, mail, user, password, state);
	}
	
	/**
	 * M�todo agrega un admnistrador a la lista de administradorres
	 * @param administrator Par�metro se refiere a un objeto de tipo administrador
	 */
	
	public void addAdministrator(Administrator administrator){
		administratorList.add(administrator);
	}
	
	/**
	 * M�todo busca un administrador por su n�mero de documento 
	 * @param id Par�metro se refiere al n�mero de documento del administrador
	 * @return Retorna un objeto de tipo administrador si se llega a encontrar en la lista
	 * @throws AdministratorNotFound Excepci�n en el caso de que no se encuentre el administrador
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
	 * M�todo cambia el estado de un administrador a falso
	 * @param id Par�metro se refiere al n�mero de documento del admnistrador
	 * @throws AdministratorNotFound Excepeci�n en el caso de que no se encuentre el administrador
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
