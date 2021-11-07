import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row");
        int m=sc.nextInt();
        System.out.println("Enter the column");
        int n=sc.nextInt();
        int a[][]= new int[m][n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();  
            }
            
        }
        System.out.println("Elements are::");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" "); 
            }
        System.out.println();
            
        }
        
        
    }
    
}
