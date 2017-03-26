package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable {
    private String type;
	public Form(String name) {
		super(name);
		type = "forms";
	}

	@Override
	public String getType() {
		
		return type;
	}

	@Override
	public void create() {
		System.out.println(getKey() + " " + "is created");
	}
    
}
