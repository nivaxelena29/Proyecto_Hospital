package views;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Action;
import controller.Controller;
import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JMenuBar - Menú funcionario
 */

public class MenuBarEmployee extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	public MenuBarEmployee(Controller controller) {
		
		JMenu menuFile = new JMenu("Archivo");
		
		JMenuItem itemListPatients= new JMenuItem("Lista pacientes");
		UtilitiesEdit.addActionJItem(itemListPatients, controller, Action.TABLE_PATIENT);
		menuFile.add(itemListPatients);
		
		JMenuItem itemGoOut= new JMenuItem("Salir");
		menuFile.add(itemGoOut);
		
		add(menuFile);
		
		//--------------------------------------------------------
		JMenu menuPatients = new JMenu("Pacientes");
		JMenuItem itemAddPatient= new JMenuItem("Agregar");
		UtilitiesEdit.addActionJItem(itemAddPatient, controller, Action.SHOW_DIALOG_ADD_PATIENT);
		menuPatients.add(itemAddPatient);
		
		JMenuItem itemEditPatient= new JMenuItem("Editar");
		UtilitiesEdit.addActionJItem(itemEditPatient, controller, Action.SHOW_DIALOG_EDIT_PATIENT);
		menuPatients.add(itemEditPatient);
		
		JMenuItem itemSearchPatient= new JMenuItem("Buscar");
		UtilitiesEdit.addActionJItem(itemSearchPatient, controller, Action.SHOW_DIALOG_SEARCH_PATIENT);
		menuPatients.add(itemSearchPatient);
		
		JMenuItem itemInactivarPatient= new JMenuItem("Inactivar");
		UtilitiesEdit.addActionJItem(itemInactivarPatient, controller, Action.SHOW_DIALOG_DELETE_PATIENT);
		menuPatients.add(itemInactivarPatient);
		add(menuPatients);
		//--------------------------------------------------------
	}

}
