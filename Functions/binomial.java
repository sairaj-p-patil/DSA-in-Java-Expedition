
public class binomial {

    public static int factorial(int num) {
        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }



    public static int binomial(int n, int r) {
       
    int nFact = factorial(n);
    // here we cannot we do n = n *i factorial
    // so we created a function 
    // that will calculate factorials 
    // for us 
    // n is passed to factorial function 
    // it behaves like n = num there
    // then factorial is calculated




    int rFact = factorial(r);
   // here we can not do r = r * i 
   // everytime to calculate that's why



    int nmrFact = factorial(n - r);

    return nFact/(rFact * nmrFact);

    }




    public static void main(String args[]) {
        System.out.println(binomial(5, 2));

    }
}
