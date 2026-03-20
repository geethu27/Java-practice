public class while_loop {
    public static void main(String[] args) {
      
      // Initialize the counter variable
      int c = 1; 

        // While loop to print numbers from 1 to 5
        while (c <= 5) {
          
          System.out.println(c); 
            
          // Increment the counter
          c++; 
        }



      // Repeating message with while Loop
      System.out.println("While loop message");
      int i = 1;
      while(i < 6) {
 
        System.out.println("Hello world");
        i++;  
      }



    // sum of nnumbers from 1 to 10
    int a = 1, s = 0;

        // loop continues until i becomes greater than 10
        while (a <= 10) {
            
            // add the current value of i to s
            s = s + a;

            // increment i for the next iteration
            i++;
        }
        System.out.println("Summation: " + s);
      

    }
}