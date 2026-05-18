import java.util.function.IntBinaryOperator;

public class Lambdaexpression { // This MUST match the filename exactly

    public static void main(String[] args) {
        int[] arr = {5, 5, 5};
        
        IntBinaryOperator op = (a, b) -> a + b;
        
        int sum = 0;
        for (int x : arr) {
            sum = op.applyAsInt(sum, x);
        }
        
        System.out.println(sum);
    }
}
