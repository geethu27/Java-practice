public class For_loop {
    public static void main(String[] args) {
        // sum of first n natural numbers
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }


        // To print hello world 5 times
        for(int i=1; i<=5; i++)
            System.out.println("print hello world 5 times");
            System.out.println("Hello World!");


        // Calculating sum from 1 to 20
        int sum = 0;
        for(int i=1; i<=20; i++) {
            sum += i;
        }
        System.out.println("Calculating sum from 1 to 20");
        System.out.println("Sum is: " + sum);
    }
}