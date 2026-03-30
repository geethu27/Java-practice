public class multidimensional_array {
    public static void main(String[] args) {
        // initializing and declaring elements of 2D Array
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        
        };

        // Accessing 2D Array elements
        System.out.println("Accessing 2D Array elements: ");
        System.out.print(arr[0][0]); //1
        System.out.print(arr[0][1]); //2
        System.out.println(arr[0][2]); //3
        System.out.print(arr[1][0]); //4
        System.out.print(arr[1][1]); //5
        System.out.println(arr[1][2]); //6
        System.out.print(arr[2][0]); //7
        System.out.print(arr[2][1]); //8
        System.out.println(arr[2][2]); //9










        // Values can directly added to the array
        // Rows and columns in an array
        System.out.println();
        System.out.println("Using user input to initialize 2D array: ");
        int row = 3;
        int col = 3;
        // initializing and declaring values
        int[][] arr1 = new int[row][col];
        int it = 1;

        // assigning values to 2D array
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr1[i][j] = it;
                it++;

            }
        }
        // printing 2D array
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }





        // Array using indexing
        System.out.println();
        System.out.println("Using indexing to initialize 2D array: ");
        int[][] arr2 = {
                {1, 2},
                {3, 4}
        };
        System.out.println("arr2[1][1] = " + arr2[1][1]); //4

    }
    
}
