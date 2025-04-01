public class Main {

   public static void main(String []args) {
      System.out.println("Methods that are recursive");
      // neverEnd(); causes stack overflow error
   }

   // methods that are recursive call themselves (to repeat code)

   public static void neverEnd() {
      System.out.println(":)");
      // contains at least one call to itself in the method body :D :) D: >:O
      neverEnd(); // if method name is in method body it is recursive
   }
}
