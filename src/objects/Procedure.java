package objects;

import objects.interfaces.*;

public class Procedure extends QMFObject implements ICreateable, IRunnable {

	protected String procText;
	
	public Procedure(String name, String procText) {
		super(name);
		this.procText = procText;
	}

	@Override
	public String getType() {
		return "procedures";
	}

	@Override
	public void create() {
		System.out.println(getKey() + " with text '" + procText + "' is created.");
	}

	@Override
	public void run() {
		System.out.println(getKey() + " is run.");
	}

}
