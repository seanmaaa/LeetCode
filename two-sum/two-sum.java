class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> histMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer pair = histMap.get(nums[i]);
            if (pair == null) {
                histMap.put(target - nums[i], i);
            } else {
                return new int[]{pair, i};
            }
        }
        return new int[]{};
    }
}