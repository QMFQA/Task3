package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject 
implements ICreateable, IRunnable{

	private String procedureText;

	public Procedure(String name, String procedureText) 
	{
		super(name);	
		this.procedureText = procedureText;
	}
	
	public String getProcedureText()
	{
		return procedureText;
	}
	
	public void create ()
	{
		System.out.println(getKey() + " with text " + "'" + getProcedureText() + "' is created");
	}
	
	public void run()
	{
		System.out.println(getKey() + " is run");
	}
	
	@Override
	public String getType() 
	{		
		return "procedures";
	}
}
