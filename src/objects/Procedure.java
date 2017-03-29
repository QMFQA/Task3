package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable{

	private String sql;
	
	public Procedure(String name) {
		super(name);
	
	}
	
	public Procedure(String name, String sql) {
		super(name);
		this.sql = sql;
	}

	@Override
	public String getType() {
		return "procedures";
	}
	
	public void create() {
		System.out.println(super.getKey() + " with text '" + sql + "' is created");

	}
	
	public void run() {
		System.out.println(super.getKey() + " is run");

	}
}
