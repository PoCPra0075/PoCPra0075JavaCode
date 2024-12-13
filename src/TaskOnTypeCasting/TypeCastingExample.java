package TaskOnTypeCasting;

public class TypeCastingExample {
        public static void main(String[] args) {

            // Implicit Type Casting (Widening Conversion)
            int intNum = 100; // 4 bytes
            double doubleNum = intNum; // int is automatically converted to double (8 bytes)

            System.out.println("Implicit Type Casting:");
            System.out.println("Integer value: " + intNum);
            System.out.println("Converted to Double: " + doubleNum);

            System.out.println();

            // Explicit Type Casting (Narrowing Conversion)
            double originalDouble = 99.99; // 8 bytes
            int narrowInt = (int) originalDouble; // explicit cast is required to convert double to int

            System.out.println("Explicit Type Casting:");
            System.out.println("Original Double value: " + originalDouble);
            System.out.println("Narrow to Integer: " + narrowInt);
            System.out.println();

            // Note: Narrowing may result in data loss
            double largeDouble = 12345.6789;
            int truncatedInt = (int) largeDouble;

            System.out.println("Data Loss Example:");
            System.out.println("Original Double: " + largeDouble);
            System.out.println("Truncated Integer: " + truncatedInt);
        }
    }