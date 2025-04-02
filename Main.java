public class Main {

   public static void main(String []args) {
      System.out.println("Methods that are recursive");
      // neverEnd(); causes stack overflow error
      System.out.println(factorial(25));
   }

   // methods that are recursive call themselves (to repeat code)

   public static void neverEnd() {
      System.out.println(":)");
      // contains at least one call to itself in the method body :D :) D: >:O
      neverEnd(); // if method name is in method body it is recursive
   }

   public static int factorial(int n) {
      if (n == 1) {
         return 1;
      }
      else {
         return n * factorial(n-1);
      }
   }   
}