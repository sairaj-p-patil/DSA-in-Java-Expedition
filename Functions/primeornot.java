
public class primeornot {

    // public static boolean isPrime(int n) {
    //     // boolean isPrime = true;

    //     if (n == 2) {
    //         return true;
    //     }

    //     for (int i = 2; i <= n - 1; i++) {

    //         if (n % i == 0) {     //completely dividing
    //             return false;
    //         }

    //     }
    //     return true;

    // }

    public static boolean isPrime1(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
               return false;
            }

        }

        return true;
    }

    public static void primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime1(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    } 

    public static void main(String args[]) {
        // System.out.println(isPrime(5));
        primerange(20);
    }  

}
