import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("No. of Elements : ");
        int n = scn.nextInt();
        System.out.println("Enter Elements");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) nums[i] = scn.nextInt();
        System.out.print("Enter Target : ");
        int target = scn.nextInt();

        int[] res = solution(nums, target);
        for (int re : res) System.out.println(re);

    }

    public static int[] solution(int[] nums, int target) {

    }
}
