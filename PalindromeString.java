import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String x=sc.nextLine();
        String x1="";
        for(int i=x.length()-1;i>=0;i--){
            x1=x1+x.charAt(i);
        }
        if(x1.equals(x)){
            System.out.println("The string is matched: It's a palindrome" + ":"+x1);
        }
        else{
            System.out.println("The string is not a Palindrome");
        }
        


        
    }
    
}
