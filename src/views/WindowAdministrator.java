package views;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import controller.Controller;
import models.entities.Administrator;
import models.entities.Employee;
import models.entities.Patient;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JFrame- Ventana Administrador
 */

public class WindowAdministrator extends JFrame{

	private static final long serialVersionUID = 1L;
	private UsersPanelTable administratorPanelTable;
	private MenuBarAdministrator menuBarAdministrator;
	
	public WindowAdministrator(Controller controller) {
		setTitle("ADMINISTRADOR");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
//		setJMenuBar(new MenuBarAdministrator(controller));
		setIconImage(createImageIcon(UIConstants.ICON_APP).getImage());
		
		administratorPanelTable= new UsersPanelTable();
		add(administratorPanelTable, BorderLayout.CENTER);
		menuBarAdministrator= new MenuBarAdministrator(controller);
		add(menuBarAdministrator, BorderLayout.PAGE_END);
		
	}
	
	public void fillTableAdministrator(ArrayList<Administrator> list)  {
		administratorPanelTable.fillListAdministrator(list);
	}

	public void fillTableEmployee(ArrayList<Employee> list)  {
		administratorPanelTable.fillListEmployee(list);
	}
	
	public void fillTablePatient(ArrayList<Patient> list)  {
		administratorPanelTable.fillListPatient(list);
	}
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}
