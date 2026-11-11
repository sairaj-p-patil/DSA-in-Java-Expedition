
public class io {


  public static void update(int marks[],int nonneg) {

    nonneg = 10;      

    for(int i =0; i<marks.length; i++) {
       marks[i] = marks[i] + 1;       
    }
  }

  public static void main(String args[]) {
    int nonneg= 5;
    int marks[] = {97, 98, 99};
    update(marks, nonneg);
    System.out.println(nonneg);

    for(int i = 0; i<marks.length; i++){
        System.out.print(marks[i] + " ");

    }

    // System.out.print(marks[0] + " ");
    // System.out.print(marks[1]+ " ");
    // System.out.print(marks[2]+ " ");
     System.out.println();
  }


}