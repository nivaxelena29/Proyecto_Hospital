package views;


import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import controller.Action;
import controller.Controller;
import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JMenuBar - Menú administrador
 */

public class MenuBarAdministrator extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public MenuBarAdministrator(Controller controller) {
		
//		JMenu menuFile = new JMenu("Archivo");
		
//		JMenuItem itemListAdministrators= new JMenuItem("Lista Administradores");
//		itemListAdministrators.addActionListener(controller);
//		itemListAdministrators.setActionCommand(Action.TABLE_ADMINISTRATOR.toString());
//		UtilitiesEdit.addActionJItem(itemListAdministrators, controller, Action.TABLE_ADMINISTRATOR);
//		menuFile.add(itemListAdministrators);
		
		JButton itemListAdministrators= new JButton("Lista Administradores");
		UtilitiesEdit.addActionButton(itemListAdministrators, controller, Action.TABLE_ADMINISTRATOR);
		add(itemListAdministrators);
		
		
//		JMenuItem itemListEmployees= new JMenuItem("Lista Funcionarios");
//		itemListEmployees.addActionListener(controller);
//		itemListEmployees.setActionCommand(Action.TABLE_EMPLOYEE.toString());
//		//UtilitiesEdit.addActionJItem(itemListEmployees, controller, Action.TABLE_EMPLOYEE);
//		
//		menuFile.add(itemListEmployees);
//		
//		JMenuItem itemListPatients= new JMenuItem("Lista pacientes");
//		UtilitiesEdit.addActionJItem(itemListPatients, controller, Action.TABLE_PATIENT);
//		menuFile.add(itemListPatients);
//		
//		JMenuItem itemReports= new JMenuItem("Reportes");
//		menuFile.add(itemReports);
//		
//		JMenuItem itemGoOut= new JMenuItem("Salir");
//		menuFile.add(itemGoOut);
//		
//		add(menuFile);
//		
//		//-----------------------------------------------------
//		JMenu menuAdministrators = new JMenu("Administradores");
//		
//		JMenuItem itemAddAdministrator= new JMenuItem("Agregar");
//		UtilitiesEdit.addActionJItem(itemAddAdministrator, controller, Action.SHOW_DIALOG_ADD_ADMINISTRATOR);
//		
//		menuAdministrators.add(itemAddAdministrator);
//		
//		JMenuItem itemEditAdministrator= new JMenuItem("Editar");
//		UtilitiesEdit.addActionJItem(itemEditAdministrator, controller, Action.SHOW_DIALOG_EDIT_ADMINISTRATOR);
//		menuAdministrators.add(itemEditAdministrator);
//		
//		JMenuItem itemSearchAdministrator= new JMenuItem("Buscar");
//		UtilitiesEdit.addActionJItem(itemSearchAdministrator, controller, Action.SHOW_DIALOG_SEARCH_ADMINISTRATOR);
//		menuAdministrators.add(itemSearchAdministrator);
//		
//		JMenuItem itemInactivarAdministrator= new JMenuItem("Inactivar");
//		UtilitiesEdit.addActionJItem(itemInactivarAdministrator, controller, Action.SHOW_DIALOG_DELETE_ADMINISTRATOR);
//		menuAdministrators.add(itemInactivarAdministrator);
//
//		add(menuAdministrators);
//		//--------------------------------------------------------
//		JMenu menuEmployees = new JMenu("Funcionarios");
//		JMenuItem itemAddEmployee= new JMenuItem("Agregar");
//		UtilitiesEdit.addActionJItem(itemAddEmployee, controller, Action.SHOW_DIALOG_ADD_EMPLOYEE);
//		menuEmployees.add(itemAddEmployee);
//		
//		JMenuItem itemEditEmployee= new JMenuItem("Editar");
//		UtilitiesEdit.addActionJItem(itemEditEmployee, controller, Action.SHOW_DIALOG_EDIT_EMPLOYEE);
//		menuEmployees.add(itemEditEmployee);
//		
//		JMenuItem itemSearchEmployee= new JMenuItem("Buscar");
//		UtilitiesEdit.addActionJItem(itemSearchEmployee, controller, Action.SHOW_DIALOG_SEARCH_EMPLOYEE);
//		menuEmployees.add(itemSearchEmployee);
//		
//		JMenuItem itemInactivarEmployee= new JMenuItem("Inactivar");
//		UtilitiesEdit.addActionJItem(itemInactivarEmployee, controller, Action.SHOW_DIALOG_DELETE_EMPLOYEE);
//		menuEmployees.add(itemInactivarEmployee);
//		add(menuEmployees);
//		//--------------------------------------------------------
//		JMenu menuPatients = new JMenu("Pacientes");
//		JMenuItem itemAddPatient= new JMenuItem("Agregar");
//		UtilitiesEdit.addActionJItem(itemAddPatient, controller, Action.SHOW_DIALOG_ADD_PATIENT);
//		menuPatients.add(itemAddPatient);
//		
//		JMenuItem itemEditPatient= new JMenuItem("Editar");
//		UtilitiesEdit.addActionJItem(itemEditPatient, controller, Action.SHOW_DIALOG_EDIT_PATIENT);
//	
//		itemListEmployees.setActionCommand(Action.TABLE_EMPLOYEE.toString());
//		menuPatients.add(itemEditPatient);
//		
//		JMenuItem itemSearchPatient= new JMenuItem("Buscar");
//		UtilitiesEdit.addActionJItem(itemSearchPatient, controller, Action.SHOW_DIALOG_SEARCH_PATIENT);
//		menuPatients.add(itemSearchPatient);
//		
//		JMenuItem itemInactivarPatient= new JMenuItem("Inactivar");
//		UtilitiesEdit.addActionJItem(itemInactivarPatient, controller, Action.SHOW_DIALOG_DELETE_PATIENT);
//		menuPatients.add(itemInactivarPatient);
//		add(menuPatients);
		//--------------------------------------------------------
	}

	

}
