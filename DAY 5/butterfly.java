public class butterfly {
    public static void main(String args[]) {
        
    int n = 4 ;
    int m = 1;




    for(int row = 1; row<=n ; row++ ){

       for(int col = 0; col< row  ; col++){

        System.out.print("*  ");

       }

 
       System.out.println();
       
    }




    for(int row = 0; row<=n ; row++ ){

       for(int col = 0; col< n- row  ; col++){

        System.out.print("*  ");

       }

 
       System.out.println();
       
    }




    }
}

