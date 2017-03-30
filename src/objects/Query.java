package objects;

import objects.interfaces.*;

public class Query extends QMFObject implements ICreateable, IRunnable {

	protected String queryText;
	
	public Query(String name, String queryText) {
		super(name);
		this.queryText = queryText;
	}

	@Override
	public String getType() {
		return "queries";
	}

	@Override
	public void run() {
		System.out.println(getKey() + " is run.");
	}

	@Override
	public void create() {
		System.out.println(getKey() + " with SQL '" + queryText + "' is created.");
	}

}
