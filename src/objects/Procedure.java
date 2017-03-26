package objects;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class Procedure extends QMFObject implements ICreateable, IRunnable {
    
	private String p_text;
	private String type;
	public Procedure(String name, String p_text) {
		super(name);
		this.p_text = p_text;
		type = "procedures";
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
		System.out.println(getKey() + " " + "with text" +  " " + "'" + getText() + "'" + " " + "is created");
		
	}
	public String getText() {
		return p_text;
	}

}
