

public class Test {
   public static void main(String[] args) {
      System.out.println(count());
   }
   public static int count() { 
	   /**
	    * return from finally override the return of catch and try and not allowed to return after finally
	    */
      try {
    	  //throw new Exception();
         //return 1;
      } catch(Exception e) {
         return 2;
      } finally {
         System.out.println("Finally block will execute even after a return statement in a method");
         //return 3;
      }
      
      return 4; //not be allowed if return from any one try, catch,finaly
   }
}