package LeetCode;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        int k = -1;
        int[] help = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    help[i] = nums[i];
                    k++;
                }
            }
        }
        return k;
    }
}
