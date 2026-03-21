/*public class For_each_loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Using for loop
        for(int e : arr) {
            System.out.print(e + " ");
            // No index variable is required
        } 




        // Finding Maximum in an Array using for-each Loop
        int[] marks = {125, 13, 95, 116, 110};
        int max = findMax(marks);
 
        System.out.println();
        System.out.println("Finding maximum in an array");
        System.out.println(max);
    }
    static int findMax(int[] arr) {
        int maximum = arr[0];

        for (int value : arr) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }
} */






// Iterating in a list using For-each_loop
import java.util.*;
public class For_each_loop {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(6);
        list.add(7);

        int max = Integer.MIN_VALUE;

        for(int num : list) {
            if(num > max);
            max = num;
        }
        System.out.println();
        System.out.println("Iterating in a List");
        System.out.println("Integers List: " + list);
        System.out.println("Maximum ekement: " + max);
    }
}