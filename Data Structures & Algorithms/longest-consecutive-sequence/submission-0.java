class Solution {
    public int longestConsecutive(int[] nums) {

        int maxL = 0;

        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(!hash.contains(num - 1)) {

                int currentL = 1;
                int currentnum = num;

                while(hash.contains(currentnum + 1)) {
                    currentL++;
                    currentnum++;
                }

                maxL = Math.max(currentL, maxL);
            }
        }

        return maxL;
    }
}