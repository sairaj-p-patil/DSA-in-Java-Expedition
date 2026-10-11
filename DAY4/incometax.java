import java.util.*;

public class incometax {
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);     
        
        int a = sc.nextInt();
        
//20%    
        int b = a * 20 % 100; 

//30%
        int c = a * 100 % 30;


        if(a < 500000){ 
          System.out.println(a);         
        }
        else if(a >= 500000 && a < 1000000) {
          System.out.println(b);          
        }
        else if(a > 1000000) {
          System.out.println(c);       

        }
        else {
          System.out.println("Invalid amount");         

        }
           
    }
}

















