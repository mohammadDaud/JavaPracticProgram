package PolymarphismExample;

public class ExCalcu extends Calculation{

	public int add(int a,int b,int c, int d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		ExCalcu calcu=new ExCalcu();
		System.out.println(calcu.add(1, 4,5,6));
		System.out.println(calcu.add(1, 4));
		System.out.println(calcu.add(1, 4,6));
	}

}
