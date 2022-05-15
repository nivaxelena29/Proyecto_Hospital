package views;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.entities.Administrator;
import models.entities.Employee;
import models.entities.Patient;
import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JPanel - Panel table de usuarios
 */
public class UsersPanelTable extends JPanel{
	private static final long serialVersionUID = 1L;

	private DefaultTableModel patientModel;
	private JTable patientList;
	
	public UsersPanelTable() {
		setLayout(new BorderLayout());
		patientModel= new DefaultTableModel();
		patientModel.setColumnIdentifiers(new Object[]{"NOMBRE","APELLIDO","TIPO DE DOCUMENTO","NÚMERO DE DOCUMENTO"});
		patientList= new JTable(patientModel);
		UtilitiesEdit.editTableAdministrator(patientList);
		add(new JScrollPane(patientList), BorderLayout.CENTER);
	}
	
	public void fillListPatient(ArrayList<Patient> patientList){
		patientModel.setRowCount(0);
		for (Patient patient  : patientList) {
			patientModel.addRow(new Object[]{ patient.getName(), patient.getLastName(), patient.getTypeDocument(),patient.getDocumentNumber()});
		}	
	}
	
	public void fillListEmployee(ArrayList<Employee> employeeList){
		patientModel.setRowCount(0);
		for (Employee employee  : employeeList) {
			patientModel.addRow(new Object[]{ employee.getName(), employee.getLastName(), employee.getTypeDocument(),employee.getDocumentNumber()});
		}	
	}
	
	public void fillListAdministrator(ArrayList<Administrator> administratorList){
		patientModel.setRowCount(0);
		for (Administrator administrator  : administratorList) {
			patientModel.addRow(new Object[]{ administrator.getName(), administrator.getLastName(), administrator.getTypeDocument(),administrator.getDocumentNumber()});
		}	
	}
	
}
