package utilities;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Action;
import controller.Controller;
import views.UIConstants;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase UtilitiesEdit - Métodos para editar interfaz gráfica
 */

public class UtilitiesEdit {
	
	public static Font fontTableContents(){
		return new Font("Arial", Font.BOLD, 13);
	}
	
	public static Font fontTableHeaderContents(){
		return new Font("Arial", Font.BOLD, 15);
	}
	
	public static void editGridbag(GridBagConstraints c, int fila, double height, int colIni, int ancho){
		c.gridy = fila; 
		c.weighty = height; 
		c.gridx = colIni; 
		c.gridwidth = ancho; 
	}
	public static void editJTFAddAdministrator(JTextField jTextField, String text){
		jTextField.setBackground(UIConstants.COLOR_WHITE);
		jTextField.setForeground(UIConstants.COLOR_FOREGROUND_JTF_DIALOG_INPUT);
//		jTextField.setBorder(null);
		jTextField.setText(text);
		jTextField.setFont(new Font("Arial", Font.PLAIN, 12));
	}
	public static void editJTFInfoAdministrator(JTextField jTextField, String text){
//		jTextField.setBackground(Color.decode("#D5DBDB"));
		jTextField.setBackground(Color.decode("#D5DBDB"));
		jTextField.setForeground(Color.BLACK);
		jTextField.setEditable(false);
//		jTextField.setBorder(null);
		jTextField.setText(text);
		jTextField.setFont(new Font("Arial", Font.PLAIN, 12));
	}
	
	public static void editTableAdministrator(JTable tableModel){
		tableModel.getTableHeader().setBackground(UIConstants.COLOR_BASE_AZUL);
		tableModel.getTableHeader().setFont(fontTableHeaderContents());
		tableModel.getTableHeader().setForeground(Color.WHITE);
		tableModel.setBackground(Color.WHITE);
		tableModel.setForeground(Color.BLACK);
		tableModel.setFont(fontTableContents());
	}
	
	public static void addActionButton(JButton button, Controller controller, Action action){
		button.addActionListener( controller);
		button.setActionCommand(action.toString());
	}
	public static void addActionJItem(JMenuItem button, ActionListener controller, Action action){
		button.addActionListener( controller);
		button.setActionCommand(action.toString());
	}
	
}
