
//  Instance variable
// Inside a class

class Student {
    int age;
    void display() {
        int age = 20;
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
} 




// STATIC VARIABLE    (Inside class with static keyword)

class Test {
    static int var = 10;
}

class Geeks {
    public static void main(String[] args) {
        System.out.println("Static Variable : " + Test.var);
    }
} 



// Local variable  ----> Method level
class Geeks {
    void show() {
        int number = 40;
        System.out.println(number);
    }
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.show();
    }
} 




// PARAMETER VARIABLE  ---->   Method parameters
class Geeks {
    void add (int a, int b){
        int result = a + b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.add(2, 3);
    }
    
}  


 
// BLOCK OF SCOPE VARIABLE  ---->  variable declared inside a block {}
class Geeks {
    public static void main(String[] args) {
        if(true) {
            char ch = 'h';
            System.out.println(ch);
        }
        // number cannot be used here
    }
} 