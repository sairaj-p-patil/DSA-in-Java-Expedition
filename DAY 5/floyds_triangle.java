public class floyds_triangle {
 
  public static void main(String args[]) {

     int n = 5;
     int number = 1;

     for(int row = 1; row <= n; row++) {

        for(int col =1 ; col <= row; col++) {

          System.out.print(number +" ");
          number++;
        }

        System.out.println();

      }

  }

}
