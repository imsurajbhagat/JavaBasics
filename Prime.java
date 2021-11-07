import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number that you want to check");
        int no=sc.nextInt();
        int temp=0;
        for(int i=2;i<=no-1;i++){
            if(no%2==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("No is prime");
        }
        else{
            System.out.println("No. is not prime");
        }
        
    }
    
}
