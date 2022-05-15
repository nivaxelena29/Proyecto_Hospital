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
import models.dao.ManagerPatient;
import models.entities.ModelPopulationGroup;
import models.entities.ModelState;
import models.entities.ModelTypeDocument;
import models.entities.ModelVaccineType;
import models.entities.Patient;
import utilities.UtilitiesEdit;

/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase JDialog - Editar paciente
 */

public class DialogEditPatient extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelName;
	private JLabel labelLastName;
	private JLabel labelTypeDocument;
	private JLabel labelNumberDocument;
	private JLabel labelState;
	private JLabel labelPhone;
	private JLabel labelMail;
	private JLabel labelAddress;
	private JLabel labelBirthday;
	private JLabel labelVaccineType;
	private JLabel labelDoseNumber;
	private JLabel labelNextDose;
	private JLabel labelPopulationGroup;

	private JTextField jTName;
	private JTextField jTLastName;
	private JTextField jTNumberDocument;
	private JTextField jTPhone;
	private JTextField jTMail;
	private JTextField jTAddress;
	private JTextField jTBirthday;
	private JTextField jTDoseNumber;
	private JTextField jTNextDose;

	private JComboBox<String> boxTypeOfDocument;
	private JComboBox<String> boxState;
	private JComboBox<String> boxVaccineType;
	private JComboBox<String> boxPopulationGroup;

	private JButton buttonCancel ;
	private JButton buttonAdd;
	

	public DialogEditPatient( Controller controller, Patient patient) {
		setSize(600,700);
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
		
		
		JLabel labelTitle= new JLabel("Editar paciente", SwingConstants.CENTER);
		labelTitle.setBackground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setForeground(UIConstants.COLOR_BASE_AZUL);
		labelTitle.setFont(new Font("Helvetica", Font.BOLD, 28));
		UtilitiesEdit.editGridbag(d, 1, 0.5, 0, 12);
		add(labelTitle,d);

		
		JPanel p=panelFormulario(controller,patient);
		UtilitiesEdit.editGridbag(d, 2, 9, 1, 10);
		add(p, d);

		JPanel panelTwo= new JPanel();
		panelTwo.setBackground(UIConstants.COLOR_TRANSPARENT);
		UtilitiesEdit.editGridbag(d,3, 0.5, 0, 12);
		add(panelTwo, d);
	}

	public JPanel panelFormulario(  Controller controller, Patient patient){
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
		UtilitiesEdit.editGridbag(d, 1, 0.6, 1, 4);
		panelOne.add(labelName,d);

		jTName= new JTextField(patient.getName());
		//UtilitiesEdit.editJTFAddAdministrator(jTName, " Andres Julian");
		UtilitiesEdit.editGridbag(d, 2, 0.6, 1, 4);
		panelOne.add(jTName,d);
		//-----------------------------------------------
		labelLastName= new JLabel("Apellido:");
		labelLastName.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 1, 0.6, 7, 4);
		panelOne.add(labelLastName,d);

		jTLastName= new JTextField(patient.getLastName());
	//UtilitiesEdit.editJTFAddAdministrator(jTLastName, " Gonzalez Ramirez");
		UtilitiesEdit.editGridbag(d, 2, 0.6, 7, 4);
		panelOne.add(jTLastName,d);
		
		//----------------------------------------------
		labelTypeDocument= new JLabel("Tipo de documento:");
		labelTypeDocument.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 3, 0.6, 1, 4);
		panelOne.add(labelTypeDocument,d);

		String listAux[]= new String[ModelTypeDocument.values().length];
		for (int i = 0; i < ModelTypeDocument.values().length; i++) {
			listAux[i]=(ModelTypeDocument.values()[i].getTypeDocument());
		}
		boxTypeOfDocument= new JComboBox<>(listAux);
		boxTypeOfDocument.setSelectedItem(patient.getTypeDocument());
		boxTypeOfDocument.setBackground(Color.WHITE);
		UtilitiesEdit.editGridbag(d, 4, 0.6,1, 4);
		panelOne.add(boxTypeOfDocument,d);
		
		//-------------------------------------------------------
		labelNumberDocument= new JLabel("Número de Documento:");
		labelNumberDocument.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 3, 0.6, 7, 4);
		panelOne.add(labelNumberDocument,d);

		jTNumberDocument= new JTextField(patient.getDocumentNumber());
		//UtilitiesEdit.editJTFAddAdministrator(jTNumberDocument, " 40708972");
		UtilitiesEdit.editGridbag(d, 4, 0.6, 7, 4);
		panelOne.add(jTNumberDocument,d);
		
		//------------------------------------------------
		labelPhone= new JLabel("Teléfono:");
		labelPhone.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 5, 0.6, 1, 4);
		panelOne.add(labelPhone,d);

		jTPhone= new JTextField(patient.getPhone());
	//	UtilitiesEdit.editJTFAddAdministrator(jTPhone, " 3124567834");
		UtilitiesEdit.editGridbag(d, 6, 0.6, 1, 4);
		panelOne.add(jTPhone,d);
		//------------------------------------
		labelMail= new JLabel("Correo:");
		labelMail.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 5, 0.6, 7, 4);
		panelOne.add(labelMail,d);

		jTMail= new JTextField(patient.getMail());
	//	UtilitiesEdit.editJTFAddAdministrator(jTMail, " andres@gmail.com");
		UtilitiesEdit.editGridbag(d, 6, 0.6, 7, 4);
		panelOne.add(jTMail,d);
		//------------------------------------
		labelAddress= new JLabel("Dirección:");
		labelAddress.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 7, 0.6, 1, 4);
		panelOne.add(labelAddress,d);

		jTAddress= new JTextField(patient.getAddress());
	//	UtilitiesEdit.editJTFAddAdministrator(jTAddress, " Calle 10 #3-65");
		UtilitiesEdit.editGridbag(d, 8, 0.6, 1, 4);
		panelOne.add(jTAddress,d);
		//------------------------------------
		labelBirthday= new JLabel("Fecha nacimiento (DD/MM/AAAA):");
		labelBirthday.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 7, 0.6, 7, 4);
		panelOne.add(labelBirthday,d);

		jTBirthday= new JTextField(patient.getBirthday());
	//	UtilitiesEdit.editJTFAddAdministrator(jTBirthday, " 20/03/1995");
		UtilitiesEdit.editGridbag(d, 8, 0.6, 7, 4);
		panelOne.add(jTBirthday,d);
		//------------------------------------
		labelVaccineType= new JLabel("Tipo de vacuna:");
		labelVaccineType.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 9, 0.6, 1, 4);
		panelOne.add(labelVaccineType,d);

		String listAux2[]= new String[ModelVaccineType.values().length];
		for (int i = 0; i < ModelVaccineType.values().length; i++) {
			listAux2[i]=(ModelVaccineType.values()[i].getVaccineType());
		}
		boxVaccineType= new JComboBox<>(listAux2);
		boxVaccineType.setBackground(Color.WHITE);
		boxVaccineType.setSelectedItem(patient.getVaccineType());
		UtilitiesEdit.editGridbag(d, 10, 0.6,1, 4);
		panelOne.add(boxVaccineType,d);
		//------------------------------------
		labelDoseNumber= new JLabel("Número de dosis:");
		labelDoseNumber.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 9, 0.6, 7, 4);
		panelOne.add(labelDoseNumber,d);

		jTDoseNumber= new JTextField(patient.getNumberOfDoses());
	//	UtilitiesEdit.editJTFAddAdministrator(jTDoseNumber, " 1");
		UtilitiesEdit.editGridbag(d, 10, 0.6, 7, 4);
		panelOne.add(jTDoseNumber,d);
		//------------------------------------
		labelNextDose= new JLabel("Fecha siguiente dosis (DD/MM/AAAA):");
		labelNextDose.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 11, 0.6, 1, 4);
		panelOne.add(labelNextDose,d);

		jTNextDose= new JTextField(patient.getNextDateDoses());
	//	UtilitiesEdit.editJTFAddAdministrator(jTNextDose, " 02/08/2022");
		UtilitiesEdit.editGridbag(d, 12, 0.6, 1, 4);
		panelOne.add(jTNextDose,d);
		//------------------------------------
		
		labelPopulationGroup= new JLabel("Grupo poblacional:");
		labelPopulationGroup.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 11, 0.6, 7, 4);
		panelOne.add(labelPopulationGroup,d);

		String listAux3[]= new String[ModelPopulationGroup.values().length];
		for (int i = 0; i < ModelPopulationGroup.values().length; i++) {
			listAux3[i]=(ModelPopulationGroup.values()[i].getPopulationGroup());
		}
		boxPopulationGroup= new JComboBox<>(listAux3);
		boxPopulationGroup.setBackground(Color.WHITE);
		boxPopulationGroup.setSelectedItem(patient.getPopulationGroup());
		UtilitiesEdit.editGridbag(d, 12, 0.6,7, 4);
		panelOne.add(boxPopulationGroup,d);
		//------------------------------------
		
		labelState= new JLabel("Estado:");
		labelState.setForeground(Color.BLACK);
		UtilitiesEdit.editGridbag(d, 13, 0.5, 1, 4);
		panelOne.add(labelState,d);

		String listAux4[]= new String[ModelState.values().length];
		for (int i = 0; i < ModelState.values().length; i++) {
			listAux4[i]=(ModelState.values()[i].getState());
		}
		boxState= new JComboBox<>(listAux4);
		boxState.setBackground(UIConstants.COLOR_WHITE);
		UtilitiesEdit.editGridbag(d, 14, 0.5,1, 4);
		panelOne.add(boxState,d);
		//------------------------------------------
		JLabel label= new JLabel();
		UtilitiesEdit.editGridbag(d, 15, 0.5, 2, 8);
		panelOne.add(label,d);
	
		//------------------------------------
	
		buttonAdd= new JButton(("Actualizar"));
		buttonAdd.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonAdd.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonAdd, controller, Action.EDIT_PATIENT);
		UtilitiesEdit.editGridbag(d, 16, 0.1, 2, 3);
		panelOne.add(buttonAdd,d);
		
		buttonCancel = new JButton("Cancelar");
		buttonCancel.setBackground(UIConstants.COLOR_BASE_AZUL);
		buttonCancel.setForeground(Color.WHITE);
		UtilitiesEdit.addActionButton(buttonCancel, controller, Action.CANCEL_BUTTON_DIALOG_EDIT_PATIENT);
		UtilitiesEdit.editGridbag(d, 16, 0.1, 7, 3);
		panelOne.add(buttonCancel,d);
		return panelOne;
	}
	public void clearForm(){
		jTName.setText("");
		jTLastName.setText("");
	    jTNumberDocument.setText("");
		jTPhone.setText("");
		jTMail.setText("");
		jTAddress.setText("");
		jTBirthday.setText("");
		jTDoseNumber.setText("");
		jTNextDose.setText("");
	}
	
	public Patient createPatient() {
		return ManagerPatient.createEmployee(jTName.getText(), jTLastName.getText(), (ModelTypeDocument) boxTypeOfDocument.getSelectedItem(),
				jTNumberDocument.getText(), jTPhone.getText(),jTAddress.getText() , jTMail.getText(),(ModelState)boxState.getSelectedItem(), 
				jTBirthday.getText(), (ModelVaccineType) boxVaccineType.getSelectedItem(),
				Integer.parseInt(jTDoseNumber.getText()),jTNextDose.getText(), (ModelPopulationGroup) boxPopulationGroup.getSelectedItem());
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
