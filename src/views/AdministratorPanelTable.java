package views;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JPanel - Panel Administrador
 */

public class AdministratorPanelTable extends JPanel{
	private static final long serialVersionUID = 1L;

	private DefaultTableModel administratorModel;
	private JTable administratorList;
	
	public AdministratorPanelTable() {
		setLayout(new BorderLayout());
		administratorModel= new DefaultTableModel();
		administratorModel.setColumnIdentifiers(new Object[]{"NOMBRE","APELLIDO","TIPO DE DOCUMENTO","NÚMERO DE DOCUMENTO"});
		administratorList= new JTable(administratorModel);
		UtilitiesEdit.editTableAdministrator(administratorList);
		add(new JScrollPane(administratorList), BorderLayout.CENTER);
	}
	
	
}
