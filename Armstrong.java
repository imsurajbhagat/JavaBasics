import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you want to check");
        int no=sc.nextInt();
        int temp=no;
        int len=0;
        while(temp!=0){
            //temp=temp/10;
            len=len+1;
            temp=temp/10;

        }
        int t2=no;
        int rem;
        int arm=0;
        while(t2!=0){
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=len;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
      if(arm==no){
          System.out.println("It's a armstrong");
      }
      else{
          System.out.println("Not a armstrong number");
      }
    }
    
}
