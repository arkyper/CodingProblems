import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    static String isTwoSum (int arr[], int size, int target) {
        int left = 0;
        int right = size-1;
        Arrays.sort(arr);
        while (left < right) {
            int sum = left + right;

            if (target == sum)
                return "YES";
            else if (left < right)
                left++;
            else
                right++;
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, 1};
        int target = 5;
        int size = arr.length;

//        Verity 1st
        System.out.println(isTwoSum(arr, size, target));

//        Verity 2nd
//        int[] arrNew = twoSum(arr, target);
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}