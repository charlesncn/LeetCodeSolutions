public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums){

        int max_seq_len = 0;
        for (int i = 0; i < nums.length; i++) {
            int current_num = arr[i];
            int current_seq_len = 1;

            while(numExist(nums, current_num +1)){
                current_num += 1;
                current_seq_len += 1;
            }
            max_seq_len = Math.max(max_seq_len, current_seq_len);

        }
        System.out.println(max_seq_len);
        return max_seq_len;
    }

    private static boolean numExist(int[] arr, int nums) {
        for (int j : arr) {
            if (j == nums)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] test = {1,2,4,3,6,7,5,23,21,22,23};
        longestConsecutive(test);
    }
}

