public class function_overloading {

/////////////// number of parameters
  public static int sum(int a, int b) {
    
     int c = a + b;
     return c;

  }

  public static int sum(int a , int b, int c) {
    return a + b + c;
  }




  public static float add(float a, float b) {
    return a + b;
  }

  public static int add(int a , int b ) {
    return a + b;
  }
 

  public static void main(String args[]) {
  System.out.println(sum(5, 3));
  System.out.println(sum(5, 3, 6));

  System.out.println("float");

  System.out.println(add(5, 3));
  System.out.println(add(5.0f,3.0f));




  }



}
