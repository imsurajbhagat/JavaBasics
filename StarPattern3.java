public class StarPattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<=4;k++){
            for(int L=4;L>=k;L--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
/*   *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     
*/
