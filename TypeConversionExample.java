public class TypeConversionExample {
    public static void main(String[] args) {

        int numInt = 25;
        double numDouble = numInt;   

        System.out.println("Integer value: " + numInt);
        System.out.println("Converted to Double: " + numDouble);

        float numFloat = 12.75f;
        int numIntFromFloat = (int) numFloat;   

        System.out.println("Float value: " + numFloat);
        System.out.println("Converted to Integer: " + numIntFromFloat);
    }
}

