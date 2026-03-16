// LOCAL VARIABLES
public class variable_types {
    public static void main(String[] args) {
        // x is local variable
        int x = 10;
        // message is also a local variable
        String message = "Hello World!";

        System.out.println("X is : " + x);
        System.out.println("Message :" + message);

        if (x > 5) {
            String result = "x is greater than 5";
            System.out.println(result) ; 
        }

        for(int i=0; i<3; i++) {
            String loopMessage = "Iteration :" + i;
            System.out.println(loopMessage);
        }
    }
    
}  



// INSTANCE VARIABLE
class variable_types {
    public String Geeth;
    public int i;
    public Integer I;
    public variable_types() {
        this.Geeth = "Geethika chinni";
    }
    // main method
    public static void main(String[] args) {
        variable_types name = new variable_types();
        System.out.println("Geeth name is: " + name.Geeth);
        System.out.println("Default value is : " + name.i);
        System.out.println("Default value of Integer is : " + name.I);
    }
} 



// STATIC VARIABLES
class variable_types {
    static int number = 10;
    public static void main(String[] args) {
        System.out.println("The Number is : " + number);
    }

}