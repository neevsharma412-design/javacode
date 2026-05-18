public class DynamicProgramming {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        
        int[] dp = new int[arr.length];

        
        dp[0] = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }

        
        System.out.println("The total sum stored in the last DP index is: " + dp[arr.length - 1]);
        
        
        System.out.print("DP Table (Prefix Sums): ");
        for (int value : dp) {
            System.out.print(value + " ");
        }
    }
}