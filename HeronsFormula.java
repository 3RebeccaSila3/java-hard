public class HeronsFormula {
    public static void main( String[] args ) {
        double a, g;
        String tws = "A triangle with sides";

         a = triangleArea(3, 3, 3);
         System.out.println("A triangle with sides 3,3,3 has area " + a );

         a = triangleArea(3, 4, 5);
         System.out.println("A triangle with sides 3,4,5 has area " + a );
         g = triangleArea(7, 8, 9);
         System.out.println(tws + "7,8,9 has area " + g );

         System.out.println(tws + " " + "5,12,13 has area " + triangleArea(5, 12, 13) );
         System.out.println(tws + " " + "10,9,11 has area " + triangleArea(10, 9, 11) );
         System.out.println(tws + " " + "8,15,17 has area " + triangleArea(8, 15, 17) );

         }

    //This function computes the area of a triangle with side length a, b, & c.

    public static double triangleArea( int a, int b, int c ) {
        double s, A;

        s = (a+b+c) / 2;
        A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

        //After computing the area, you must "return" the computed value.

        return a;
    }
}

/*
    // a function defined this way will return a value that is an int
public static int triangleArea(int a, int b, int c)

// this one must return a value that is a String
public static String triangleArea(int a, int b, int c)

// this function must return either the value true or the value false
public static boolean triangleArea(int a, int b, int c)

// a function defined this way cannot return any value of any type
public static void triangleArea(int a, int b, int c)
*/