public class bubblesort_refinemethod {
    public static void main(String args[]) {
        int a[]={19,67,32,2,3,34,50,15};
        int temp;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.printf(a[i]+" ");
        }
        
    }
    
}
