package objects;

//import objects.interfaces.ICreateable;

public class Form extends QMFObject implements objects.interfaces.ICreateable {

	public Form(String name) {
		// TODO Auto-generated constructor stub
		super (name);
	}

	public void create () {
		System.out.println(getKey()+" is created");
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "forms";
	}
}
