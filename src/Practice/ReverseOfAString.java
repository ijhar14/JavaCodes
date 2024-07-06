package Practice;

public class ReverseOfAString {
 
	public static void main(String args[]) {
		// Reverse of a string using String Builder
        		
		reverseStringBuilder();
	}
	
   public static void reverseStringBuilder() {
	   System.out.println("Reverse of a string using string builder");
	   String one = "Ijhar";
	   System.out.println(one);
	   StringBuilder input = new StringBuilder();
	   input.append(one);
	   input.reverse();
	   System.out.println("Reverse of the string is :"+input);
   }
   
   public static void reverseStringLogic() {
	   String one = "Ijhar";
	   System.out.println(one);
	   
	   
	   
	   
	   
   }
}
