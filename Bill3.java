// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// שלושה שמות וחשבון אחד
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]);
		double a = 3;
		double check = bill / a ;
		check = Math.ceil(check);
		 System.out.println( "Dear " + name3 + ", " + name2 + " and " + name1 + ": pay " + check + "shekels each.");
	    
	}
}
