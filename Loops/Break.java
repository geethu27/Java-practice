public class Break {
    public static void main(String[] args) {
        int n = 2;
        switch(n) {

            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Geethika");
                break;

            case 3:
                System.out.println("Welcome to Java Course");
                break;

            default:
                System.out.println("Default case");
             
            // output if n=1 , it will print case 1.  if n=2, it will print case 2.
        }



        // Break loop
        System.out.println(); 
        for(int i=1; i<=10; i++) {

            // terminate loop when i is 5
            if(i == 5)
                break;

            System.out.println("i is: " + i);
            
        }
        System.out.println("Loop is completed");









        // Break Statement in labeled Blocks
        System.out.println();
        System.out.println("Break using labeled blocks");
        boolean t = true;

        // label first
        first: {
            second: {
                third: {
                    System.out.println("Before break Statement");

                    if (t) {
                        break second;  // Exit the second label block
                    }

                    System.out.println("This won't execute.");
                }
                System.out.println("This won't execute.");               
            }
            System.out.println("After second block.");
        }





        // Break statement inside while loop
        System.out.println();
        int i = 35;
        while(i >= 10) {
            if(i == 15) {
                // loop when i become 15

                i--; // Decrementing variable
                break;
            }
            System.out.print(i + " ");
            i--;
        }
    }
    
}
