// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
   public static void main(String[] var0) {
      int var1 = Integer.parseInt(var0[0]);
      int var2 = (int)(Math.random() * (double)var1);
      int var3 = (int)(Math.random() * (double)var1);
      int var4 = (int)(Math.random() * (double)var1);
	  int min = Math.min(var2,var3);
	  int mid1 = Math.max(var2,var3);
	  int minimum = Math.min(var3,var4);
	  int mid2 = Math.max(var3,var4);
	  int maximum = Math.max(mid1,mid2);
	  int middle = Math.min(mid1,mid2);
	   System.out.println( var2 + " " + var3 + " " + var4);
	  System.out.println(minimum + " " + middle + " " + maximum);

	}
}
