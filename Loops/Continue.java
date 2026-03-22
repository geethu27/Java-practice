public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++) {

            // skip the execution of loop
            if (i == 3) 
                continue;
            System.out.println(i + " ");
        }




        // Continue statement using while loop
        System.out.println("Contine statement using while Loop");
        int c = 0;
        while(c <= 5) {
            // continue used when c == 3
            if(c == 3) {
                c++;
            continue;
            }

            System.out.print(c + " ");
            c++;
        }    // output  0 1 2 4 5






        // Break and Continue statement
        for(int i = 1; i <= 10; i++) {
            // skip condition if i==3
            if(i == 3)
                continue;

            // Exit the loop when i == 7
            if(i == 7)
                break;

            System.out.println(i + " ");
        }


    }
}