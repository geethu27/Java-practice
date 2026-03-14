public class operators {
    public static void main(String[] args) {
        // ARITHMETIC OPERATOR

        int a=10; int b=20;

        // Addition
        int sum = a + b;
        // Subtraction
        int difference = a - b;
        // Multiplication
        int multiplication = a * b;
        // Division
        int division = a / b;
        // Modulus
        int modulus = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);



        // UNARY OPERATOR
        int c = 10;
        int d =10;

        // Using Unary operator
        System.out.println();
        System.out.println("Unary opearots:");
        System.out.println("postincrement: " + (c++));
        System.out.println("preincrement: " + (++c));

        System.out.println("postdecrement: " + (d--));
        System.out.println("predecrement: " + (--d));


        
        // ASSIGNMENT OPERATOR
        int n = 5;
        System.out.println();
        System.out.println("Assignment operators : ");

        // n = n + 5
        n += 5;
        System.out.println("After += : " + n);
        
        
        
        // n = n * 5
        n *= 2;
        System.out.println("After *= : " + n);

        // n = n - 5
        n -= 10;
        System.out.println("After -= : " + n);

        // n = n / 1
        n /= 1;
        System.out.println("After /= : " + n);

        // n = n % 2
        n %= 2;
        System.out.println("After %= : " + n);


        // Relational operator (It will print boolean values in result)
        int x = 8;
        int y = 4;
        // comparision operator
        System.out.println();
        System.out.println("Relational operators:");
        System.out.println("x > b: " + (x > y));
        System.out.println("a < b: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));


        // TERNARY OPERATOR
        int n1 = 20;
        int n2 = 40;
        int n3 = 80;
        System.out.println();
        System.out.println("Ternary operators ");
        // result holds max 3 numbers
        int result;
        if (n1 > n2) {
            if (n1 > n3) {
                result = n1;
            }
            else {
                result = n3;
            }
        }
        else {
            if (n2 > n3) {
                result = n2;
            }
            else {
                result = n3;
            }
        }
        System.out.println("Maximum number = " + result);
    

        
        // Bitwise operator
        int a1 = 5;
        int b1 = 7;

        // Bitwise and
        // 0101 & 0111 = (0101 = 5)
        System.out.println("a1& b1= " + (a1 & b1));

        // bitwise or
        // 0101 | 0111 = (0111 = 7)
        System.out.println("a1|b1 = " + (a1 | b1));

        // bitwise xor
        // 0101 ^ 0111 = (0010 =2 )
        System.out.println("a1^b1 = " + (a1^b1));

        //bitwise not
        // ~ 0000000 00000 = 111111 11111
        System.out.println("~a1= " + ~a1);

        // assignment operator to provide shorthand
        // a &= b;
        System.out.println("a1= " +a1);


        // SHIFT OPERATOR
        int e = 0b1010;
        int f = 0b1100;

        System.out.println("e << 2: " + (e << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (f >>> 1));


        // INSTANCE OPERATOR
        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
       
