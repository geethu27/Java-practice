public class Do_while_loop {
    public static void main(String[] args) {
        int c = 2;
        
        // Using do while loop
        do {
            System.out.println("Hello Geethika: " + c);
            c++;
        }
        while(c <= 5);



        // print Hello world 5 times
        int i = 1;
        do {
            System.out.println("Hello world");
            i++;
        }
        while(i <= 5);


        // Do while loop execute the block. Even the condition is false  (while(c >= 3))
        int a = 1;
        do {
            System.out.println("Welcome to java programming");
            a++;
        }
        while(a >= 3);  // here the condition is false but it will executes once
    }
}