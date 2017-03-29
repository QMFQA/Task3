package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable
{

	public Form(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "forms";
	}

	@Override
	public void create() {
		System.out.println(getType() + ":/" + getName() + " is created");		
	}

}
