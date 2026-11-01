public class butterfly1 {
    public static void main(String args[]) {
         
     int n = 4;

///////UPPER//////

     for(int row =1; row <= n; row ++) {


       for(int col = 1; col <= row ; col++) {
        System.out.print("* ");
       }

       int space = 2*(n-row);
       for(int col = 1;  col <= space; col++){
        System.out.print("  ");
       }

       for(int col = 1;  col <= row ; col++){
        System.out.print("* ");
       }
       System.out.println();
     }

//////LOWER////

     
    for(int row =n ; row >= 1 ; row-- ) {

      for(int col =1 ; col <= row ; col++){
       System.out.print("* ");
      }
      
      int space = 2*(n - row);
      for(int col =1 ; col <= space; col++){
        System.out.print("  ");
      }

      for(int col =1 ; col<= row; col++) {
        System.out.print("* ");
      }
     System.out.println();
    }

    }
}