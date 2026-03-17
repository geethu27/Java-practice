class wrapper_classes {
    public static void main(String[] args) {

        /*  autoboxing with integer
        int b = 240;
        // autoboxing primitive int -> to Integer object
        Integer a = b;
        System.out.println("The primitive b is: " + b);
        System.out.println("The primitive Integer a is : " + a);



        // Autoboxing with character
        char ch = 'a';

        // Autoboxing: charr -> Character
        Character c = ch;

        ArrayList<Integer> list = new ArrayList<>();
        // Autoboxing: int -> Integer
        list.add(25);
        System.out.println(list.get(0)); */



        // wrapper classes
        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        int i = 10;
        Integer intObj = Integer.valueOf(i);

        float f = 5.43f;
        Float floatObj = Float.valueOf(f);

        double d = 240.3;
        Double doubleObj = Double.valueOf(d);

        char c = 'g';
        Character charObj = c;  // autoboxing

        System.out.println("Wrapper Objects:");
        System.out.println(byteObj);
        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);

        // Unboxing
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;

        System.out.println("\n Unwrapped values");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fv);
        System.out.println(dv);
        System.out.println(cv);

    }
}
