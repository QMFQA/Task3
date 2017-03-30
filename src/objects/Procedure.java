package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable
{
	protected String proc_text;
	
	public Procedure (String name, String text){
		super(name);
		proc_text = text;
	}
	
	public Procedure(String name) {
		super(name);
	}

	@Override
	public String getType() {
		return "procedures";
	}

	@Override
	public void create() {
		System.out.println(getKey() + " with text '" + proc_text + "' is created");
		
	}

	@Override
	public void run() {
		System.out.println(getKey() + " is run");		
	}

}
