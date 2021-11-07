import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome");
        int no=sc.nextInt();
        int temp=no;
        int res=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            res=res*10+rem;
            temp=temp/10;
        }
        if(no==res){
            System.out.println("Number is palindrome"+ " "+res);
            
        }
        else{
            System.out.println("No is not palindrome"+ " "+res);
        
        }
        
    }
    
}
