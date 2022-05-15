package myExceptions;

public class EmployeeNotFound extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFound() {
		super("Employee not found");
	}

}
