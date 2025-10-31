import java.util.*;
public class E2{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        E2 obj = new E2();
        int[] result = obj.smallerNumbersThanCurrent(nums);
        System.out.println("Count of smaller numbers for each element:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) count++;
            }
            a[i] = count;
        }
        return a;
    }
}
