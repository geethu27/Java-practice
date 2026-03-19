public class if_else_if_ladder {
    public static void main(String[] args) {
        int marks = 84;
        if(marks >= 90) {
            System.out.println("A Grade");
        }
        else if(marks >= 80) {
            System.out.println("B Grade");
        }
        else if(marks >= 70) {
            System.out.println("C Grade");
        }
        else if(marks >= 60) {
            System.out.println("D Grade");
        }
        else {
            System.out.println("Fail");
        }

    }
}