package views;

import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Action;
import controller.Controller;
import utilities.UtilitiesEdit;


/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JDialog - Buscar administrador 
 */

public class DialogSearchAdministrator extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelNumberId;

	private JTextField jTNumberId;

	
	private JButton buttonSearch ;
	

	public DialogSearchAdministrator(Controller controller ) {
		setSize(360,210);
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
		
		
		JLabel labelTitle= new JLabel("Buscar administrador", SwingConstants.CENTER);
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

		labelNumberId= new JLabel("Número de identificación:");
		labelNumberId.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 1, 0.3, 2, 8);
		panelOne.add(labelNumberId,d);

		jTNumberId= new JTextField();
		UtilitiesEdit.editJTFAddAdministrator(jTNumberId, " Por favor ingrese el número de identificación");
		UtilitiesEdit.editGridbag(d, 2, 0.3, 2, 8);
		panelOne.add(jTNumberId,d);
		//-----------------------------------------------
		
		JLabel label= new JLabel();
		UtilitiesEdit.editGridbag(d, 3, 0.3, 2, 8);
		panelOne.add(label,d);
	
		//------------------------------------
	
		
		buttonSearch = new JButton("Buscar");
		buttonSearch.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonSearch.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonSearch, controller, Action.SEARCH_ADMINISTRATOR);
		UtilitiesEdit.editGridbag(d, 4, 0.1, 4, 4);
		panelOne.add(buttonSearch,d);
		return panelOne;
	}

	public String searchAadministrator() {
		return jTNumberId.getText();
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
