package objects;

//import objects.interfaces.ICreateable;
//import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements objects.interfaces.ICreateable, objects.interfaces.IRunnable {
	private String procedureText;
	
	public Procedure(String name, String procedureText) {
		// TODO Auto-generated constructor stub
		super (name);
		this.procedureText = procedureText;
	}

	public void create () {
		System.out.println(getKey()+" with text '"+ getProcedureText() + "' is created");
	}
	
	public void run () {
		System.out.println(getKey()+" is run");
	}
	
	public String getProcedureText () {
		return procedureText;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "procedures";
	}
}
