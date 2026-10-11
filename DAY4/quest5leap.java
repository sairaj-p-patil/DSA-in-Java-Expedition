
import java.util.*;

public class quest5leap {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

      if (year % 4 == 0) {
            //yes0 below :
          if (year % 100 == 0) {
                //yes1 below 
            if(year % 400== 0 ) {
                System.out.println("leap year");

            } else {
                System.out.println("not a leap year");
            }

        } else {
            System.out.println("leap year");
        }
        
    }

    else {
          System.out.println("not a leap year");
    }

//  //yes
//       if (year % 100 == 0) {
//           //yes1
//         } 
//          else {
//            System.out.println("leap year");
//         }
// //yes1
//       if(year % 400== 0 ) {
//      System.out.println("leap year");
//       }  else {
//         System.out.println("not a leap year");
//       }      
}

}


// if year is divided by 4 {
// if year is divided by 100 {
// if year is divided by 400} 
// }
// 

