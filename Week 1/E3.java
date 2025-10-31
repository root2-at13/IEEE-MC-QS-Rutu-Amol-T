import java.util.*;
public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
            nums[i] = sc.nextInt();
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        E3 obj = new E3();
        int[] result = obj.twoSum(nums, target);
        if (result.length == 0) {
            System.out.println("No pair found that sums to " + target);
        } else {
            System.out.println("Indices of numbers that sum to target: " + result[0] + ", " + result[1]);
        }
        sc.close();
    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}