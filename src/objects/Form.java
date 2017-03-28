package objects;

import objects.interfaces.ICreateable;

public class Form extends QMFObject implements ICreateable{

	public Form(String name) {
		super(name);
	}

	@Override
	public String getType() {
		return "Form";
	}
	
	@Override
	public void create()
	{
		System.out.println(getKey()+ " is created");
	}
	

}
