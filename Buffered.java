import java.io.*;

public class Buffered {
    public static void main(String[] args) {

        try {   // try-catch is used to handle errors safely so the program doesn’t crash.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // to read the input

        System.out.println("Enter your name");
        String name = br.readLine();

        System.out.print("Enter tour age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        br.close();
        }  // try used to run code and catch used to handle error
        catch (IOException e) {
            System.out.println("Error occurred");
    }

    }
}
