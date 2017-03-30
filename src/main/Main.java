package main;

import helpers.QMFObjectHelper;
import objects.Form;
import objects.Procedure;
import objects.Query;

public class Main {
	
	private static final Query query = new Query("Query1", "SELECT * FROM Q.STAFF");
	private static final Form form = new Form("Form1");
	private static final Procedure procedure = new Procedure("Procedure1", "DISPLAY QUERY");
	
	public static void main(String[] args)
	{
		QMFObjectHelper.create(query);
		QMFObjectHelper.create(form);
		QMFObjectHelper.create(procedure);
		QMFObjectHelper.run(query);
		QMFObjectHelper.run(procedure);
	}
	
}

