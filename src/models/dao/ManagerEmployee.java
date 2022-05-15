package models.dao;

import java.util.ArrayList;

import models.entities.Employee;
import models.entities.ModelState;
import models.entities.ModelTypeDocument;
import myExceptions.AdministratorNotFound;
import myExceptions.EmployeeNotFound;

/**
 * Clase Manager Funcionarios desarrollada por
 * @author Angela Yurani Vargas Rodriguez
 *
 */

public class ManagerEmployee {
	
	private ArrayList<Employee> employeeList;

	/**
	 * Método constructor de la clase Manager funcionarios
	 */
	
	public ManagerEmployee() {
		this.employeeList=new ArrayList<Employee>();
		Employee employee= ManagerEmployee.createEmployee("Eliam4", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "Eliam1", "456", ModelState.ACTIVO);
		Employee employee2= ManagerEmployee.createEmployee("Eliam1", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "Eliam2", "456643er", ModelState.ACTIVO);
		Employee employee3= ManagerEmployee.createEmployee("Eliam23", "Gonzalez", ModelTypeDocument.CEDULA, "1234", "", "", "", "Eliam3", "456e1dsfr", ModelState.ACTIVO);
		employeeList.add(employee);
		employeeList.add(employee2);
		employeeList.add(employee3);
	}
	
	/**
	 * Método crea un objeto de tipo Funcionario
	 * @param name Parámetro se refiere al nombre del funcionario
	 * @param lastName Parámetro se refiere al apellido del funcionario
	 * @param typeDocument Parámetro se refiera al tipo de documento del funcionario
	 * @param documentNumber Parámetro se refiere al número de docuemnto del funcionario
	 * @param phone Parámetro se refierte al telóno del funcionario
	 * @param address Parámetro se refiere a la dirección de la casa del funcionario
	 * @param mail Parámetro se refiere al correo electrónico del funcionario
	 * @param user Parámetro se refiere al usuario del funcionario
	 * @param password Parámetro se refiere a la constraseña del funcionario
	 * @param state Parámetro se refiere al estado en el que se encuentra un funcionario
	 * @return Retorna un objeto de tipo Funcionario
	 */
	
	public static Employee createEmployee(String name, String lastName, ModelTypeDocument typeDocument, String documentNumber, String phone,
			String address, String mail,String user, String password,ModelState state){
		return new Employee(name, lastName, typeDocument, documentNumber, phone, address, mail, user, password, state);
	}
	
	/**
	 * Método agrega un funcionario a la lista de funcionarios
	 * @param employee Parámetro se refiere a un objeto de tipo funcionario
	 */
	
	public void addEmployee(Employee employee){
		employeeList.add(employee);
	}
	
	/**
	 * Método busca un funcionario por su número de documento 
	 * @param id Parámetro se refiere al número de documento del funcionario
	 * @return Retorna un objeto de tipo funcionario si se llega a encontrar en la lista
	 * @throws EmployeeNotFound Excepción en el caso de que no se encuentre el funcionario
	 */
	
	public Employee searchEmployeeById(String id)  throws EmployeeNotFound{
		for (Employee employee : employeeList) {
			if (employee.getDocumentNumber().compareTo(id)==0) {
				return employee;
			}
		}
		throw new EmployeeNotFound();

	}
	
	public Employee searchEmployeeByUser(String user)  throws EmployeeNotFound{
		for (Employee employee : employeeList) {
			if (employee.getUser().compareTo(user)==0) {
				return employee;
			}
		}
		throw new EmployeeNotFound();

	}
	
	
	/**
	 * Método cambia el estado de un funcioanrio a falso
	 * @param id Parámetro se refiere al número de documento del funcionario
	 * @throws AdministratorNotFound Excepción en el caso de que no se encuentre el funcionario
	 */
	
	public void deleteEmployee(String id) throws EmployeeNotFound{
		Employee employee = searchEmployeeById(id);
		employee.setState(ModelState.INACTIVO);
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
