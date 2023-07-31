public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Java is \"fun\"");
        String str = "hello";
//        System.out.printf("I will tell you: %s", str);
        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);
        String myString = "Hello";
        System.out.println(myString);
        myString = "goodbye";
        System.out.println(myString);
        long mySecondNumber = 123;
        System.out.println(mySecondNumber);
        double myNumber = 3.14;
        System.out.println(myNumber);
//        int y = 5;
//      y += 5;
//        System.out.println(y);
        int x = 3;
        int y = 4;
        y *= x;
        System.out.println(y);
        int a = 10;
        int b = 2;
        a/= b;
        b -= a;
        System.out.println(a);
        System.out.println(b);

//        byte exampleByte = -200;
        // throws compilation error

        byte exampleByte = 127;
        exampleByte += 2;
        System.out.println(exampleByte);
// when we increment past the type's capacity, it will loop to the lower (or upper if we're subtracting) bounds of what that data type holds.

    }
}
