package views;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Action;
import controller.Controller;
import models.dao.ManagerAdministrator;
import models.entities.Administrator;
import models.entities.ModelState;
import models.entities.ModelTypeDocument;
import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JDialog - Agregar administrador 
 */

public class DialogAddAdministrator extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelName;
	private JLabel labelLastName;
	private JLabel labelTypeDocument;
	private JLabel labelNumberDocument;
	private JLabel labelUser;
	private JLabel labelPassword;

	private JTextField jTName;
	private JTextField jTLastName;
	private JTextField jTNumberDocument;
	private JTextField jTUser;
	private JPasswordField jTPassword;

	private JComboBox<String> boxTypeOfDocument;
//	private MenuBarAdministrator menuBarAdministrator;

	private JButton buttonCancel ;
	private JButton buttonAdd;
	

	public DialogAddAdministrator(Controller controller ) {
		setSize(450,600);
		setTitle((UIConstants.TITLE_APP));
		setIconImage(createImageIcon(UIConstants.ICON_APP).getImage());
		getContentPane().setBackground(UIConstants.COLOR_WHITE);
		setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();
		d.fill=GridBagConstraints.BOTH;
		d.gridheight=1;
		d.weightx = 1; 
		for (int i = 0; i < 12; i++) {
			d.gridx = i;
			add(new JLabel("" ), d);
		}
		
		
		JLabel labelTitle= new JLabel("Agregar administrador", SwingConstants.CENTER);
		labelTitle.setBackground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setForeground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setFont(new Font("Helvetica", Font.BOLD, 28));
		UtilitiesEdit.editGridbag(d, 1, 0.5, 0, 12);
		add(labelTitle,d);
		
		JPanel p=panelFormulario(controller);
		UtilitiesEdit.editGridbag(d, 2, 9, 1, 10);
		add(p, d);

		JPanel panelTwo= new JPanel();
		panelTwo.setBackground(UIConstants.COLOR_TRANSPARENT);
		UtilitiesEdit.editGridbag(d,3, 0.5, 0, 12);
		add(panelTwo, d);
//		
//		menuBarAdministrator= new MenuBarAdministrator(controller);
//		UtilitiesEdit.editGridbag(d,4, 0.5, 0, 12);
//		add(menuBarAdministrator, d);
	}

	public JPanel panelFormulario( Controller controller){
		JPanel panelOne= new JPanel();
		panelOne.setBackground(UIConstants.COLOR_WHITE);
		panelOne.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();
		d.fill=GridBagConstraints.BOTH;
		d.gridheight=1;
		d.weightx = 1; 
		for (int i = 0; i < 12; i++) {
			d.gridx = i;
			panelOne.add(new JLabel("" ), d);
		}

		labelName= new JLabel("Nombre:");
		labelName.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 1, 0.6, 2, 8);
		panelOne.add(labelName,d);

		jTName= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTName, " Por favor ingrese su nombre");
		UtilitiesEdit.editGridbag(d, 2, 0.6, 2, 8);
		panelOne.add(jTName,d);
		//-----------------------------------------------
		labelLastName= new JLabel("Apellido:");
		labelLastName.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 3, 0.6, 2, 8);
		panelOne.add(labelLastName,d);

		jTLastName= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTLastName, " Por favor ingrese su apellido");
		UtilitiesEdit.editGridbag(d, 4, 0.6, 2, 8);
		panelOne.add(jTLastName,d);
		
		//----------------------------------------------
		labelTypeDocument= new JLabel("Tipo de documento:");
		labelTypeDocument.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 5, 0.6, 2, 8);
		panelOne.add(labelTypeDocument,d);

		String listAux[]= new String[ModelTypeDocument.values().length];
		for (int i = 0; i < ModelTypeDocument.values().length; i++) {
			listAux[i]=(ModelTypeDocument.values()[i].getTypeDocument());
		}
		boxTypeOfDocument= new JComboBox<>(listAux);
		boxTypeOfDocument.setBackground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 6, 0.6,2, 8);
		panelOne.add(boxTypeOfDocument,d);
		
		//-------------------------------------------------------
		labelNumberDocument= new JLabel("Número de Documento:");
		labelNumberDocument.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 7, 0.6, 2, 8);
		panelOne.add(labelNumberDocument,d);

		jTNumberDocument= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTNumberDocument, " Por favor ingrese su número de documento");
		UtilitiesEdit.editGridbag(d, 8, 0.6, 2, 8);
		panelOne.add(jTNumberDocument,d);
		
		//------------------------------------------------
		labelUser= new JLabel("Usuario:");
		labelUser.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 9, 0.6, 2, 8);
		panelOne.add(labelUser,d);

		jTUser= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTUser, " Por favor ingrese un usuario");
		UtilitiesEdit.editGridbag(d, 10, 0.6,2, 8);
		panelOne.add(jTUser,d);
		//------------------------------------
		labelPassword= new JLabel("Contraseña:");
		labelPassword.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 11, 0.6, 2, 8);
		panelOne.add(labelPassword,d);

		jTPassword= new JPasswordField();
		UtilitiesEdit.editJTFAddAdministrator(jTPassword, " Por favor ingrese una contraseña");
		UtilitiesEdit.editGridbag(d, 12, 0.6, 2, 8);
		panelOne.add(jTPassword,d);
		//------------------------------------
		JLabel label= new JLabel();
		UtilitiesEdit.editGridbag(d, 13, 0.6, 2, 8);
		panelOne.add(label,d);
	
		//------------------------------------
	
		buttonAdd= new JButton(("Agregar"));
		buttonAdd.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonAdd.setForeground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 14, 0.6, 2, 3);
		UtilitiesEdit.addActionButton(buttonAdd, controller, Action.ADD_ADMINISTRATOR);
		panelOne.add(buttonAdd,d);
		
		buttonCancel = new JButton("Cancelar");
		buttonCancel.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonCancel.setForeground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 14, 0.1, 7, 3);
		UtilitiesEdit.addActionButton(buttonCancel, controller, Action.CANCEL_BUTTON_DIALOG_ADD_ADMINISTRATOR);
		panelOne.add(buttonCancel,d);
		return panelOne;
	}
	
	public void clearForm(){
		jTName.setText("");
		jTLastName.setText("");
	    jTNumberDocument.setText("");
		jTUser.setText("");
		jTPassword.setText("");
		
	}
	
	public Administrator createAdministrator() {
		return ManagerAdministrator.createAdministrator(jTName.getText(), jTLastName.getText(), (ModelTypeDocument)boxTypeOfDocument.getSelectedItem(),
				jTNumberDocument.getText(), "","", "", jTUser.getText(),jTPassword.getSelectedText(), ModelState.ACTIVO);
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
