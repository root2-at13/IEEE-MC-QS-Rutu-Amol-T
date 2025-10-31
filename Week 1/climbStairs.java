
import java.util.Scanner;
public class climbStairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the steps:");
        int n = sc.nextInt();
        int ways= climbStairs(n);
        System.out.println("Number of ways :"+ways);
        sc.close();
    }
public static int climbStairs(int n) {
    if(n==0 ||n==1) return 1;
    int []steps = new int[n+1];
    steps[0]=steps[1]=1;
    for(int i=2;i<=n;i++){
        steps[i]=steps[i-1]+steps[i-2];
    }
    return steps[n];
    }
}
