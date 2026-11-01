public class solid_rhombus{
    public static void main(String args[]){

     
      int n = 6 ;

     for(int row = n ; row > 1; row--){
       
       for(int col = 1; col <= row ; col++){ 
        System.out.print("  ");
       }

       for(int col = 1; col < n; col++){ 
        System.out.print("*  ");
       }

      System.out.println();

     }
      

    }
}