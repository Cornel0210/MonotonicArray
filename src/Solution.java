public class Solution {

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] {3,1,9}));
    }

    public static boolean isMonotonic(int[] nums) {
        if (nums.length < 1){
            return false;
        }
        if (nums.length == 1){
            return true;
        }
        int i = 1;
        while (i <= nums.length-1 && nums[i-1] == nums[i]){
            i++;
        }

        if (i == nums.length){
            return true;
        }

        if (nums[i-1]<nums[i]){
            while (i <= nums.length-1 && nums[i-1] <= nums[i]){
                i++;
            }
            return i == nums.length;
        }

        if (nums[i-1]>nums[i]){
            while (i <= nums.length-1 && nums[i-1] >= nums[i]){
                i++;
            }
            return i == nums.length;
        }
        return false;
    }
}
