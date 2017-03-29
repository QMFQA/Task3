package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Query extends QMFObject implements ICreateable, IRunnable {

	private String value;
	private String type;

	public Query(String name, String value) {
		super(name);
		this.value = value;
		this.type = "queries";
	}
	
	public String getValue () {
		return value;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	public String create() {
		return getKey() + " with SQL " + getValue() + " is created";
	}
	
	public String run() {
		return getType() + ":/" + getName() + "is run";
	}

}

