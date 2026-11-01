public class butterfly {
    public static void main(String args[]) {
        
    int n = 4 ;
  



/////////////////////////////UPPER/////////////////////////////

    for(int row = 1; row<=n ; row++ ){

       // 1 left
       for(int col = 1; col<=row; col++) {
        System.out.print("* ");
       }    
    
       // 2 middle
       int space = 2*(n-row);
       for(int col =1 ; col<=space; col++){
        System.out.print("  ");
       }

       // 3 right
        for(int col = 1; col<=row; col++) {
        System.out.print("* ");
       }    


     System.out.println();
    }






//////////////////////////////LOWER////////////////////////////

    for(int row = n; row>=1 ; row-- ){

       // 1 left
       for(int col = 1; col<=row; col++) {
        System.out.print("* ");
       }    
    
      // 2 middle
       int space = 2*(n-row);
       for(int col =1 ; col<=space; col++){
        System.out.print("  ");
       }

       // 3 right
        for(int col = 1; col<=row; col++) {
        System.out.print("* ");
       }    


     System.out.println();
    }



    }
}

