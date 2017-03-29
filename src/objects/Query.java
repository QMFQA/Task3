package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Query extends QMFObject implements ICreateable, IRunnable
{
	protected String query_sql;

	public Query(String name, String sql){
		super(name);
		query_sql = sql;
	}
	
	public Query(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String getType() {
		return "queries";
	}

	@Override
	public void create() {
		
		System.out.println(getType() + ":/" + getName() + " with SQL '" + query_sql + "' is created");
		
	}

	@Override
	public void run() {
		System.out.println(getType() + ":/" + getName() + " is run");
		
	}

}
