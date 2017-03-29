package objects;
import objects.interfaces.*;

public class Query extends QMFObject implements ICreateable, IRunnable{
	
	private String sql;
	
	public Query(String name) {
		super(name);
	}
	
	public Query(String name, String sql) {
		super(name);
		this.sql = sql;
	}

	@Override
	public String getType() {
		return "queries";
	}
	
	public void create() {
		System.out.println(super.getKey() + " with SQL '" + sql + "' is created");

	}
	
	public void run() {
		System.out.println(super.getKey() + " is run");

	}
}
