package myExceptions;

public class AdministratorNotFound extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public AdministratorNotFound() {
		super("Administrator not found");
	}

}
