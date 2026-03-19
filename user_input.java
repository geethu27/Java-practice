import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
/*      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");   // number
        int num = sc.nextInt();
        System.out.println("Entered number: " + num);

        // using string
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Entered sentence :" + sentence);

        // Using Double
        System.out.println("Enter a double value:");
        double value = sc.nextDouble();
        System.out.println("Entered double value: " + value);

        // Using word
        System.out.println("Enter a word");
        String word = sc.next();
        System.out.println("Entered word: " + word);

        // using Float
        System.out.println("Enter a float number");
        float number = sc.nextFloat();
        System.out.println("Entered float value: " + number);

        sc.close(); */





        // Using hasNext()/ hasNextInt()
        Scanner sc = new Scanner(System.in);

        // Initializing values for int6d and count
        int sum = 0, count = 0;
        System.out.println("Enter integer values to calculate mean(type 'done' to finish):");

        // Loop to read input until done is read
        while (sc.hasNext()) {
            if(sc.hasNextInt()){

                // Read an int value
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            else {
                String input = sc.next();
                if(input.equalsIgnoreCase("done")) {
                    break;
                }
                else{
                    System.out.println("Invalid input. please enter an integer or type 'done' to finish.");
                }
            }
        }

        // Calculate and display the mean
        if(count > 0) {
            // Use double precise mean calculate
            double mean = (double) sum/count;
            System.out.println("Mean: " + mean);
        }
        else {
            System.out.println("No integer were input. Mean cannot be calculated");
            sc.close();
        }
    }
} 




