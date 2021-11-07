import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        System.out.println("Enter the range");
        int z=f.nextInt();
        int a=0;
        int b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=1;i<=z;i++){
            int c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;

        }

        
    }
    
}
