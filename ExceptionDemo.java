public class ExceptionDemo {
   public static void main(String[] args) {
        
        try{
            int k=7/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");  //Finally is block where if you're getting exception or not it will executed.
        }
    }
    
}
