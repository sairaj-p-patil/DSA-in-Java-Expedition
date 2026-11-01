public class hollow_rhombus {

    public static void main(String args[]) {

        int n = 5;

        for (int row = n; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n; col++) {

                if(row == 1 || row == n || col == 1 || col== n ){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
               
            }
            System.out.println();
        }

    }
}
