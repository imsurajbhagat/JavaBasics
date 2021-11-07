public class Prog2 {
    public static void main(String[] args) {
        int b[]={3,9,4,1,2,7};
        int min=b[0];
        for(int i=1;i<=b.length-1;i++){
            if(min>b[i]){
                min=b[i];

            }
        }
        System.out.println("Minimum number is" + min);
    }
    
}
