package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Query extends QMFObject implements ICreateable, IRunnable {
    
	private String q_text;
	private String type;
	public Query(String name, String q_text) {
		super(name);
		this.q_text = q_text;
		type = "queries";
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void run() {
		System.out.println(getKey() + " " + "is run");
		
	}

	@Override
	public void create() {
		System.out.println(getKey() + " " + "with SQL" + " " + "'" + getText() + "'" + " " + "is created");
		
	}
	public String getText() {
		return q_text;
	}

}
