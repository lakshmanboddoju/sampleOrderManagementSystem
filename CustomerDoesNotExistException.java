package assessment1;

public class CustomerDoesNotExistException extends Exception {
	
	public String toString()
	{
		return "No such customer exists.\n";
	}

}
