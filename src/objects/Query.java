package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Query extends QMFObject implements ICreateable, IRunnable {
	
	private String sqlText;
	
	public Query(String name, String sqlText) {
		super(name);
		this.sqlText = sqlText;
	}

	@Override
	public String getType() {
		return "queries";
	}
	
	public String getSQLText() {
		return this.sqlText;
	}

	@Override
	public void create() {
		System.out.println(getKey() + " with SQL '" + getSQLText() + "' is created");		
	}
	
	@Override
	public void run() {
		System.out.println(getKey() + " is run");
	}

}
