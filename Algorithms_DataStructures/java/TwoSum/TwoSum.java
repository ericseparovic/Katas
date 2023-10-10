import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No hay complemento");

        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hashNums.containsKey(complement)) {
                return new int[] { i, hashNums.get(complement) };
            }

            hashNums.put(nums[i], i);
        }

        return new int[] {};
    }

}