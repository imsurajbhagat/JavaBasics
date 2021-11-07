public class Array1 {
    public static void main(String[] args) {
        int a[]={2,3,4,5,2,1,7};
        int b[]={5,3,2,6,4,7,1};
        
        //int n=a.length;
        int x=0;
        for(int i=0;i<=a.length-1;i++){
            if(a.length!=0){
                x=x+a[i]*b[b.length-1];/*+a[i+1]b[c-2]+a[i+2]*b[c-3]+a[i+3]*b[c-4]+a[i+4]*b[c-5]+a[i+5]*b[c-6];*/
            } 
        }
        System.out.println(x);
        
        
    }
}
