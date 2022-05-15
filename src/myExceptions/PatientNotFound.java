package myExceptions;

public class PatientNotFound extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public PatientNotFound() {
		super("Patient not found");
	}

}
