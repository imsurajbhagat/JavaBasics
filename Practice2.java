import java.util.Scanner;

public class Practice2 {
    public static void Prime(int n){

        if(n<0){
            System.out.println("Invalid Number");
        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in){
        System.out.println("Enter the number::")
            int n=sc.nextInt();
            int temp=0;
            Prime(n);

        }
        
    }
    
}
