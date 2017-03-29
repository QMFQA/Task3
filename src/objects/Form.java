package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable {
	
	private String type;
	
	public Form(String name) {
		super(name);
		this.type = "forms";
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	public String create() {
		return getKey() + " is created";
	}
}
