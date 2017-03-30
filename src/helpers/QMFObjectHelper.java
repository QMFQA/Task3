package helpers;

import objects.interfaces.ICreateable;
import objects.interfaces.IRunnable;

public class QMFObjectHelper {
	
	public static void create(ICreateable object) {
		object.create();
	}

	public static void run(IRunnable object) {
		object.run();
	}
}

