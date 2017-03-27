package objects;

//import objects.interfaces.ICreateable;
//import objects.interfaces.IRunnable;

public class Query extends QMFObject implements objects.interfaces.ICreateable, objects.interfaces.IRunnable {
	private String queryText;
	
	public Query(String name, String queryText) {
		// TODO Auto-generated constructor stub
		super (name);
		this.queryText = queryText;
	}

	public void create () {
		System.out.println(getKey()+" with SQL '"+ getQueryText() + "' is created");
	}
	
	public void run () {
		System.out.println(getKey()+" is run");
	}
	
	public String getQueryText () {
		return queryText;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "queries";
	}
}
