import java.util.*;


public class three {

 public static  void main  (String args[]) {

    Scanner sc = new Scanner(System.in);

    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();

    double price  = pencil+ pen +eraser ;

    double gst = (price * 18)/ 100 ;
     
     double Total  = price+gst;


     System.out.println(price);
     System.out.println("with 18% gst:" + gst);
     System.out.println("Total is:" + Total);


 }
}