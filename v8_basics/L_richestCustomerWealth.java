
package v8_basics;

public class L_richestCustomerWealth {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {1, 2, 3, 4}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int[] row : arr) {
            int sum = 0;
            for (int i = 0; i < row.length; i++) {
                sum = sum + row[i];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
