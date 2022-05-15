package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import models.dao.ManagerAdministrator;
import models.dao.ManagerEmployee;
import models.dao.ManagerPatient;
import models.entities.Administrator;
import models.entities.Employee;
import myExceptions.AdministratorNotFound;
import myExceptions.EmployeeNotFound;
import views.DialogAddAdministrator;
import views.DialogAddEmployee;
import views.DialogAddPatient;
import views.DialogEditAdministrator;
import views.DialogEditEmployee;
import views.DialogEditPatient;
import views.DialogLogin;
import views.DialogSearchAdministrator;
import views.DialogSearchEmployee;
import views.DialogSearchPatient;
import views.WindowAdministrator;
import views.WindowEmployee;

public class Controller implements ActionListener{
	
	public DialogAddAdministrator dialogAddAdministrator;
	public DialogEditAdministrator dialogEditAdministrator;
	public DialogSearchAdministrator dialogSearchAdministrator;
	public DialogAddEmployee dialogAddEmployee;
	public DialogEditEmployee dialogEditEmployee;
	public DialogSearchEmployee dialogSearchEmployee;
	public DialogAddPatient dialogAddPatient;
	public DialogEditPatient dialogEditPatient;
	public DialogSearchPatient dialogSearchPatient;
	public WindowAdministrator windowAdministrator;
	public WindowEmployee windowEmployee;
	public DialogLogin dialogLogin;
	public ManagerAdministrator managerAdministrator;
	public ManagerEmployee managerEmployee;
	public ManagerPatient managerPatient;
	
	public Controller() {
		this.managerAdministrator= new ManagerAdministrator();
		this.managerEmployee=new ManagerEmployee();
		this.managerPatient = new ManagerPatient();
		this.windowAdministrator= new WindowAdministrator(null);
		this.windowEmployee= new WindowEmployee(this);
		this.dialogLogin= new DialogLogin(this);
		init();
//		this.dialogAddAdministrator= new DialogAddAdministrator(this);
//		dialogAddAdministrator.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Action.valueOf(e.getActionCommand())) {
		case GET_INTO:
			this.validateUser();
			this.dialogLogin.setVisible(false);
			break;
		case ADD_ADMINISTRATOR:
			
			
			break;
		case CANCEL_BUTTON_DIALOG_ADD_ADMINISTRATOR:
			
			break;
		case SEARCH_ADMINISTRATOR:
			break;
		case CANCEL_BUTTON_DIALOG_EDIT_ADMINISTRATOR:
			break;
		case EDIT_ADMINISTRATOR:
			break;
		case CANCEL_BUTTON_DIALOG_SEARCH_ADMINISTRATOR:
			break;
		case DELETE_ADMINISTRATOR:
			break;
		case CANCEL_BUTTON_DIALOG_DELETE_ADMINISTRATOR:
			break;
		case CANCEL_BUTTON_DIALOG_INFO_ADMINISTRATOR:
			break;
		case TABLE_ADMINISTRATOR:
			System.out.println("administratorr");
////			windowAdministrator.fillTableAdministrator(managerAdministrator.getAdministratorList());
////			
////			windowAdministrator.repaint();
			break;
		case SHOW_DIALOG_ADD_ADMINISTRATOR:
			System.out.println("hehhehehehheheheh");
			break;
		case SHOW_DIALOG_EDIT_ADMINISTRATOR:
			JOptionPane.showMessageDialog(null, "editar administrador");
			break;
		case SHOW_DIALOG_DELETE_ADMINISTRATOR:
			break;
		case SHOW_DIALOG_SEARCH_ADMINISTRATOR:
			break;
		//Funcionario
		case ADD_EMPLOYEE:
			break;
		case CANCEL_BUTTON_DIALOG_ADD_EMPLOYEE:
			break;
		case SEARCH_EMPLOYEE:
			break;
		case CANCEL_BUTTON_DIALOG_EDIT_EMPLOYEE:
			break;
		case EDIT_EMPLOYEE:
			break;
		case CANCEL_BUTTON_DIALOG_SEARCH_EMPLOYEE:
			break;
		case DELETE_EMPLOYEE:
			break;
		case CANCEL_BUTTON_DIALOG_DELETE_EMPLOYEE:
			break;
		case CANCEL_BUTTON_DIALOG_INFO_EMPLOYEE:
			break;
		case TABLE_EMPLOYEE:
			System.out.println("Employeee");
//			windowAdministrator.fillTableEmployee(managerEmployee.getEmployeeList());
//			windowAdministrator.repaint();
		
			break;
		case SHOW_DIALOG_ADD_EMPLOYEE:
			System.out.println("esta es una prueba");
			break;
		case SHOW_DIALOG_EDIT_EMPLOYEE:
			break;
		case SHOW_DIALOG_SEARCH_EMPLOYEE:
			break;
		case SHOW_DIALOG_DELETE_EMPLOYEE:
			break;
		//Paciente
		case ADD_PATIENT:
			break;
		case CANCEL_BUTTON_DIALOG_ADD_PATIENT:
			break;
		case SEARCH_PATIENT:
			break;
		case CANCEL_BUTTON_DIALOG_EDIT_PATIENT:
			break;
		case EDIT_PATIENT:
			break;
		case CANCEL_BUTTON_DIALOG_SEARCH_PATIENT:
			break;
		case DELETE_PATIENT:
			break;
		case CANCEL_BUTTON_DIALOG_DELETE_PATIENT:
			break;
		case CANCEL_BUTTON_DIALOG_INFO_PATIENT:
			break;
		case TABLE_PATIENT:
			System.out.println("patieeent");
				windowAdministrator.fillTablePatient(managerPatient.getPatientList());
				
				windowAdministrator.repaint();
	
			break;
		case SHOW_DIALOG_ADD_PATIENT:

			break;
		case
		SHOW_DIALOG_EDIT_PATIENT:
			System.out.println("que estrés");
			break;
		case SHOW_DIALOG_SEARCH_PATIENT:
			break;
		case SHOW_DIALOG_DELETE_PATIENT:
			break;
		//-----------------------ENTRAR
		
		default:
			break;
//		
		}
		
	}
	
	public void init() {
		this.dialogLogin.setVisible(true);
	}
	
	public void validateUser()   {
		String typeUser=dialogLogin.getTypeUser();
		String user=dialogLogin.getUser();
		String password=dialogLogin.getPassword();
		Administrator administrator=null;
		Employee employee=null;
		if(typeUser.compareToIgnoreCase("Administrador")==0) {
			try {
				administrator=managerAdministrator.searchAdministratorByUser(user);
				if(administrator.getPassword().compareTo(password)==0) {
					windowAdministrator.setVisible(true);
					fillInitTableAdministrator();
				}
			} catch (AdministratorNotFound e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
			
		}else {
			try {
				employee= managerEmployee.searchEmployeeByUser(user);
				if(employee.getPassword().compareTo(password)==0) {
					windowEmployee.setVisible(true);
					fillInitTableEmployee();
				}
			} catch (EmployeeNotFound e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}	
			
		}
	}
	
	public void fillInitTableAdministrator() {
		windowAdministrator.fillTableAdministrator(managerAdministrator.getAdministratorList());
	}
	
	public void fillInitTableEmployee() {
		windowEmployee.fillTablePatient(managerPatient.getPatientList());
	}

}
