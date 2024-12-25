package PolymarphismExample;

public class CPlExcep implements PLExecp{

	public static void main(String[] args) {
		PLExecp excep=new CPlExcep();
		excep.show();
	}

	@Override
	public void show() throws NullPointerException {
		System.out.println("Null Pointer");
	}

}
