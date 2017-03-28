package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable {
	
	private String procedureText;

	public Procedure (String name, String procedureText)
	{
		super(name);
		this.procedureText = procedureText;
		
	}
	
	public String getProcedureText ()
	{
		return procedureText;
	}
	
	@Override
	public String getType() {
		return "procedures";
	}
	
	@Override
	public void create()
	{
		System.out.println(getKey()+ " with text \'" + getProcedureText() +"\' is created");
	}

	@Override
	public void run()
	{
		System.out.println(getKey() +" is run");
	}
}
