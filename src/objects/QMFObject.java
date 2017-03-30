package objects;

public abstract class QMFObject {

	private String name;
	
	public QMFObject(String name) {
		this.name = name;
	}
	
	public String getKey() {
		return getType() + ":/" + getName();
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getType();
	
}

