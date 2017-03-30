package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable {
	
	private String value;
	
	private String type;

	public Procedure(String name, String value) {
		super(name);
		this.value = value;
		this.type = "procedures";
	}
	
	public String getValue () {
		return value;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	public void create() {
		System.out.println(getKey() + " with text '" + getValue() + "' is created");
	}
	
	public void run() {
		System.out.println(getKey() + " is run");
	}
}

