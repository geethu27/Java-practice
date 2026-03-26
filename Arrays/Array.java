public class Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.println("Primitive Array -> ");
        for(int i=0; i<n; i++)
            System.out.println(arr[i] + " ");


        // Non-primitive array (String objects)
        String[] names = {"Geethika", "Chinni", "Thanu"};

        System.out.println("Non-Primitive -> ");
        for(int i=0; i<names.length; i++)
            System.out.print(names[i] +" ");




        // Access array elements
        System.out.println();
        System.out.println("Access array elements: ");
        System.out.println(arr[3]);

        // Update Array elements
        arr[0] = 90;
        System.out.println("Array after update : " + arr[0]);


        // Using Traverse Array   (visiting every element)
        System.out.println("Traversing array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


        // Size of Array
        System.out.println();
        System.out.println("Size of an array: " + arr.length);


    }
}
