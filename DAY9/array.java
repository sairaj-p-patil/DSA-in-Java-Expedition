import java.util.*;

public class array {

   public static void main(String args[]) {
     int marks[] = new int[50];

     int numbers[] = {1, 2, 3};

     String fruits[] = {"mango", "apple"};

     Scanner sc = new Scanner(System.in);

     marks[0] = sc.nextInt();//phy
     marks[1] = sc.nextInt();//chem
     marks[2] = sc.nextInt();//math

     System.out.println("phy :" + marks[0]);
     System.out.println("chem :" + marks[1]);
     System.out.println("math :" + marks[2]);

    marks[2] = marks[2] + 1;
    System.out.println("math :"+marks[2]);


   }

}