package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable {

	private String text;
	
	public Procedure(String name, String text) {
		super(name);
		this.text = text;
	}

	@Override
	public String getType() {
		return "procedures";
	}
	
	public String getText() {
		return this.text;
	}
	
	@Override
	public void create() {
		System.out.println(getKey() + " with text '" + getText() + "' is created");
		
	}

	@Override
	public void run() {
		System.out.println(getKey() + " is run");
	}

}
