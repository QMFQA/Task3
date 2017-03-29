package objects;
import objects.interfaces.*;

public class Form extends QMFObject implements ICreateable  {

	public Form(String name) {
		super(name);
	}


	public void create() {
		System.out.println(super.getKey() + " is created");

	}


	@Override
	public String getType() {
		return "forms";
	}
	
	

}
