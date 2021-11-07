/*how to find max or min in list*/
public class Prog1 {
    public static void main(String args[]){
        int a[]={4,2,7,8,3,1,5};
        int max=a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        
        }
        System.out.println("Maximum element is" + max);
    }
    
}
