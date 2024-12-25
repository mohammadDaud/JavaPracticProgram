package SingletonProgram;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<MySingleton> multiInstance = MySingleton.getMultiInstance();
		for(MySingleton ms:multiInstance) {
			MySingleton singleton = ms;
			System.err.println(singleton);
		}
	}

}
