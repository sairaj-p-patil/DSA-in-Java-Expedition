
public class linear {

    public static int linearsearch(int numbers[], int key) { //import
      for(int i=0;i<numbers.length; i++){
        if(numbers[i] == key) {
           return i; //export from
        }
      }
         return -1; //export from
    }
    public static void main(String args[]) {

       int numbers[] = {2,3,4,5,10,7,8,9};
       int key = 10;
       
       int index  = linearsearch(numbers, key); //export

       if(index == -1) {
        System.out.println("NOT FOUND");
       } else {
         System.out.println("key is at index :" + index);
       }

    }
}


