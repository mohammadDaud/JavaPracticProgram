package ClosestValueInArray;

public class CombinationArray {
   public static void main(String[] args) {
	
	   int a[]= {1,2,3,4,5};
	   int aa=0;
	   for(int i=0;i<=a.length-1;i++) {
		   
		   for(int j=0;j<=a.length-1;j++) {
			   System.out.println(a[i]+","+a[j]);
			   aa++;
			   System.out.println("count = "+aa);
		   }
	   
}
   }
}

