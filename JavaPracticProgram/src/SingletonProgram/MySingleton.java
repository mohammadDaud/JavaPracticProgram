package SingletonProgram;

import java.util.Arrays;
import java.util.List;

public class MySingleton {

	private static MySingleton instance;
	

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	public static List<MySingleton> getMultiInstance() {
		List<MySingleton> lstinstance = Arrays.asList(new MySingleton(), new MySingleton(), new MySingleton());
		return lstinstance;
	}
}
