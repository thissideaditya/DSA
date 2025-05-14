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
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        map.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }else map.put(nums[i], i);
        }

        return res;
    }
}
