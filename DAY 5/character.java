public class character {

    public static void main(String args[]) {

        int n = 4;
        char ch = 'A';

        // outer loop
        for (int line = 1; line <= n; line++) {

            //inner loop
            for (int chs = 1; chs <= line; chs++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
