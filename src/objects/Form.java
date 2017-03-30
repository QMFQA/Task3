package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable{

	public Form(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		System.out.println(getKey() + " is created.");
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Forms";
	}

}
