public class WrapperExample {
    public static void main(String[] args) {
        // Convert between primitive types and wrapper classes
        int x = 10;
        Integer i = Integer.valueOf(x); // convert int to Integer
        int y = i.intValue(); // convert Integer to int

        double d = 3.14;
        Double dObj = Double.valueOf(d); // convert double to Double
        double e = dObj.doubleValue(); // convert Double to double

        // Parse string representations of primitive types
        int a = Integer.parseInt("10"); // parse "10" to int
        double b = Double.parseDouble("3.14"); // parse "3.14" to double

        // Compare wrapper objects
        Integer i1 = 10;
        Integer i2 = 20;
        boolean b1 = i1.equals(i2); // check if i1 is equal to i2
        boolean b2 = i1.compareTo(i2) < 0; // check if i1 is less than i2

        // Convert to string representation
        String s1 = Integer.toString(10); // convert int to "10"
        String s2 = Double.toString(3.14); // convert double to "3.14"
        String s3 = i.toString(); // convert Integer to "10"

        // Other methods
        int c = Integer.max(10, 20); // get the maximum of two integers
        int d = Integer.parseInt("A", 16); // parse "A" as a hexadecimal number

        System.out.println(y);
        System.out.println(e);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(c);
        System.out.println(d);
    }
}
