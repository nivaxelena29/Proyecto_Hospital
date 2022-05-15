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
 * Clase JDialog - Editar administrador 
 */

public class DialogEditAdministrator extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelName;
	private JLabel labelLastName;
	private JLabel labelTypeDocument;
	private JLabel labelNumberDocument;
	private JLabel labelUser;
	private JLabel labelPassword;
	private JLabel labelState;

	private JTextField jTName;
	private JTextField jTLastName;
	private JTextField jTNumberDocument;
	private JTextField jTUser;
	private JTextField jTPassword;

	private JComboBox<String> boxTypeOfDocument;
	private JComboBox<String> boxState;

	private JButton buttonCancel ;
	private JButton buttonAdd;
	

	public DialogEditAdministrator( Controller controller, Administrator administrator) {
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
		
		
		JLabel labelTitle= new JLabel("Editar administrador", SwingConstants.CENTER);
		labelTitle.setBackground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setForeground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setFont(new Font("Helvetica", Font.BOLD, 28));
		UtilitiesEdit.editGridbag(d, 1, 0.5, 0, 12);
		add(labelTitle,d);

		JPanel p=panelFormulario(controller,administrator);
		UtilitiesEdit.editGridbag(d, 2, 9, 1, 10);
		add(p, d);

		JPanel panelTwo= new JPanel();
		panelTwo.setBackground(UIConstants.COLOR_TRANSPARENT);
		UtilitiesEdit.editGridbag(d,3, 0.5, 0, 12);
		add(panelTwo, d);
	}

	public JPanel panelFormulario( Controller controller, Administrator administrator){
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

		jTName= new JTextField(administrator.getName());
		UtilitiesEdit.editJTFAddAdministrator(jTName, " Andres Julian");
		UtilitiesEdit.editGridbag(d, 2, 0.6, 2, 8);
		panelOne.add(jTName,d);
		//-----------------------------------------------
		labelLastName= new JLabel("Apellido:");
		labelLastName.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 3, 0.6, 2, 8);
		panelOne.add(labelLastName,d);

		jTLastName= new JTextField(administrator.getLastName());
		UtilitiesEdit.editJTFAddAdministrator(jTLastName, " Gonzalez Ramirez");
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
		boxTypeOfDocument= new JComboBox<>();
		boxTypeOfDocument.setSelectedItem(administrator.getTypeDocument());
		boxTypeOfDocument.setBackground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 6, 0.6,2, 8);
		panelOne.add(boxTypeOfDocument,d);
		
		//-------------------------------------------------------
		labelNumberDocument= new JLabel("Número de Documento:");
		labelNumberDocument.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 7, 0.6, 2, 8);
		panelOne.add(labelNumberDocument,d);

		jTNumberDocument= new JTextField(administrator.getDocumentNumber());
		UtilitiesEdit.editJTFAddAdministrator(jTNumberDocument, " 40708972");
		UtilitiesEdit.editGridbag(d, 8, 0.6, 2, 8);
		panelOne.add(jTNumberDocument,d);
		
		//------------------------------------------------
		labelUser= new JLabel("Usuario:");
		labelUser.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 9, 0.6, 2, 8);
		panelOne.add(labelUser,d);

		jTUser= new JTextField(administrator.getUser());
		UtilitiesEdit.editJTFAddAdministrator(jTUser, " andresgonzalez01");
		UtilitiesEdit.editGridbag(d, 10, 0.6,2, 8);
		panelOne.add(jTUser,d);
		//------------------------------------
		labelPassword= new JLabel("Contraseña:");
		labelPassword.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 11, 0.6, 2, 8);
		panelOne.add(labelPassword,d);

		jTPassword= new JTextField(administrator.getPassword());
		UtilitiesEdit.editJTFAddAdministrator(jTPassword, " *********");
		UtilitiesEdit.editGridbag(d, 12, 0.6, 2, 8);
		panelOne.add(jTPassword,d);
		//------------------------------------
		labelState= new JLabel("Estado:");
		labelState.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 13, 0.5, 2, 8);
		panelOne.add(labelState,d);

		String listAux2[]= new String[ModelState.values().length];
		for (int i = 0; i < ModelState.values().length; i++) {
			listAux2[i]=(ModelState.values()[i].getState());
		}
		boxState= new JComboBox<>(listAux2);
		boxState.setSelectedItem(administrator.isState());
		boxState.setBackground(UIConstants.COLOR_WHITE);
		UtilitiesEdit.editGridbag(d, 14, 0.5,2, 8);
		panelOne.add(boxState,d);
		//------------------------------------------
		JLabel label= new JLabel();
		UtilitiesEdit.editGridbag(d, 15, 0.5, 2, 8);
		panelOne.add(label,d);
	
		//------------------------------------
	
		buttonAdd= new JButton(("Actualizar"));
		buttonAdd.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonAdd.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonAdd, controller, Action.EDIT_ADMINISTRATOR);
		UtilitiesEdit.editGridbag(d, 16, 0.1, 2, 3);
		panelOne.add(buttonAdd,d);
		
		buttonCancel = new JButton("Cancelar");
		buttonCancel.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonCancel.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonCancel, controller, Action.CANCEL_BUTTON_DIALOG_EDIT_ADMINISTRATOR);
		UtilitiesEdit.editGridbag(d, 16, 0.1, 7, 3);
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
				jTNumberDocument.getText(), "","", "", jTUser.getText(),jTPassword.getSelectedText(), (ModelState)boxState.getSelectedItem());
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
