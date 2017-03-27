package objects;

import objects.interfaces.*;

public class Procedure extends QMFObject implements ICreateable, IRunnable {
	private String text;

	public Procedure(String name, String text) {
		super(name);
		this.text = text;
	}

	@Override
	public String getType() {
		return "procedures";
	}

	@Override
	public void run() {
		System.out.println(super.getKey() + " is run");

	}

	@Override
	public void create() {
		System.out.println(super.getKey() + " with text '" + text + "' is created");

	}

}
