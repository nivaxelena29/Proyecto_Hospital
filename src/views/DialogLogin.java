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
import models.entities.ModelTypeUser;
import utilities.UtilitiesEdit;


/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JDialog - Login
 */

public class DialogLogin extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelUser;
	private JLabel labelPassword;
	private JLabel labelTypeUser;

	private JTextField jTUser;
	private JPasswordField jTPassword;
	private JComboBox<String> boxUser;

	
	private JButton buttonGetInto ;
	

	public DialogLogin( Controller controller) {
		setSize(360,300);
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
		
		
		JLabel labelTitle= new JLabel("LOGIN", SwingConstants.CENTER);
		labelTitle.setBackground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setForeground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setFont(new Font("Helvetica", Font.BOLD, 20));
		UtilitiesEdit.editGridbag(d, 1, 0.5, 0, 12);
		add(labelTitle,d);

		JPanel p=panelFormulario(controller);
		UtilitiesEdit.editGridbag(d, 2, 9, 1, 10);
		add(p, d);

		JPanel panelTwo= new JPanel();
		panelTwo.setBackground(UIConstants.COLOR_TRANSPARENT);
		UtilitiesEdit.editGridbag(d,3, 0.5, 0, 12);
		add(panelTwo, d);
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

		labelUser= new JLabel("Usuario:");
		labelUser.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 1, 0.3, 2, 8);
		panelOne.add(labelUser,d);

		jTUser= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTUser, " Por favor ingrese su usuario");
		UtilitiesEdit.editGridbag(d, 2, 0.3, 2, 8);
		panelOne.add(jTUser,d);
		//-----------------------------------------------
		labelPassword= new JLabel("Contraseña:");
		labelPassword.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 3, 0.3, 2, 8);
		panelOne.add(labelPassword,d);

		jTPassword= new JPasswordField();
		UtilitiesEdit.editJTFAddAdministrator(jTPassword, " Por favor ingrese su contraseña");
		UtilitiesEdit.editGridbag(d, 4, 0.3, 2, 8);
		panelOne.add(jTPassword,d);
		//-----------------------------------------------
		

		
		//------------------------------------
	
		
		labelTypeUser= new JLabel("Tipo de usuario:");
		labelTypeUser.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 5, 0.3, 2, 8);
		panelOne.add(labelTypeUser,d);
		
		String listAux[]= new String[ModelTypeUser.values().length];
		for (int i = 0; i < ModelTypeUser.values().length; i++) {
			listAux[i]=(ModelTypeUser.values()[i].getUser());
		}
		boxUser= new JComboBox<>(listAux);
		boxUser.setBackground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 6, 0.3,2, 8);
		panelOne.add(boxUser,d);
		
		JLabel label= new JLabel();
		UtilitiesEdit.editGridbag(d, 7, 0.3, 2, 8);
		panelOne.add(label,d);
	
		
		//-----------------------
		buttonGetInto = new JButton("Ingresar");
		buttonGetInto.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonGetInto.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonGetInto, controller, Action.SHOW_DIALOG_ADD_PATIENT);
		UtilitiesEdit.editGridbag(d, 8, 0.1, 4, 4);
		panelOne.add(buttonGetInto,d);
		return panelOne;
	}

	public String getUser() {
		return jTUser.getText();
	}
	
	public String getPassword() {
		return String.valueOf(jTPassword.getPassword());
	}
	
	public String getTypeUser() {
		return boxUser.getSelectedItem().toString();
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
