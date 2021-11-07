public class Reverse_string {
  public static void main(String[] args) {
        
        String n="geeksforgeeks";
        int s=n.length();
        String rev="";
        for(int i=s-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        System.out.println("reverse string is" + rev);
        
    }
    
}
