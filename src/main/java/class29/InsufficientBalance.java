package class29;

public class InsufficientBalance extends RuntimeException {
   /*
   This exception is thrown when there is not enough balance in the
   users account & he tries to withdraw more money
    */
   public InsufficientBalance (String errorMsg){
       super(errorMsg);
   }
}
