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
 * Clase JFrame - Ventana funcionario
 */
public class WindowEmployee extends JFrame{

	private static final long serialVersionUID = 1L;
	private UsersPanelTable employeePanelTable;
	
	public WindowEmployee(Controller controller) {
		setTitle("FUNCIONARIO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setJMenuBar(new MenuBarEmployee(controller));
		setIconImage(createImageIcon(UIConstants.ICON_APP).getImage());
		
		employeePanelTable= new UsersPanelTable();
		add(employeePanelTable, BorderLayout.CENTER);
		
	}
	
	public void fillTableAdministrator(ArrayList<Administrator> list)  {
		employeePanelTable.fillListAdministrator(list);
	}

	public void fillTableEmployee(ArrayList<Employee> list)  {
		employeePanelTable.fillListEmployee(list);
	}
	
	public void fillTablePatient(ArrayList<Patient> list)  {
		employeePanelTable.fillListPatient(list);
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
