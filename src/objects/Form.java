package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable {
	private static final String type = "forms";
	
	public Form(String name) {
		super (name);
	}

	public void create () {
		System.out.println(getKey()+" is created");
	}

	@Override
	public String getType() {
		return type;
	}
}
