package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Query extends QMFObject implements ICreateable, IRunnable{

	
	private String queryText;
	
	public Query(String name, String queryText) 
	{
		super(name);
		this.queryText = queryText;
	}

	@Override
	public String getType() 
	{
		return "queries";
	}
	
	@Override
	public void create()
	{
	System.out.println(getKey()+ " with SQL \'" + getQueryText() +"\' is created");
	}
	
	@Override
	public void run ()
	{
		System.out.println(getKey() +" is run");
	}
	
	public String getQueryText()
	{
		return queryText;
	}

}
