package objects;

import objects.interfaces.*;

public class Query extends QMFObject implements ICreateable, IRunnable {

	private String text;

	public Query(String name, String text) {
		super(name);
		this.text = text;
	}

	@Override
	public String getType() {
		return "queries";
	}

	@Override
	public void run() {
		System.out.println(super.getKey() + " is run");
	}

	@Override
	public void create() {
		System.out.println(super.getKey() + " with SQL '" + text + "' is created");
	}

}
