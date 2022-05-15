package run;

import controller.Controller;
import views.DialogAddAdministrator;
import views.DialogAddEmployee;
import views.DialogAddPatient;
import views.DialogEditAdministrator;
import views.DialogEditEmployee;
import views.DialogEditPatient;
import views.DialogInfAdministrator;
import views.DialogInfEmployee;
import views.DialogInfPatient;
import views.DialogLogin;
import views.DialogSearchAdministrator;
import views.DialogSearchEmployee;
import views.DialogSearchPatient;
import views.WindowAdministrator;
import views.WindowEmployee;


/*
 * Trabajo realizado por Angela Yurani Vargas
 * Clase Run
 */

public class Run {
	
	/**
	 * Método que corre la aplicación
	 * @param args
	 */
	
	public static void main(String[] args) {
		new Controller();
		
	}
	
	
}
