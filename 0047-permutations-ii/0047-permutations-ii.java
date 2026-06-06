class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        backtrack(nums, 0, result);

        return new ArrayList<>(result);
    }

    private void backtrack(int[] nums, int start, Set<List<Integer>> result) {

        if (start == nums.length) {

            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            result.add(temp);
            return;
        }

        for (int i = start; i < nums.length; i++) {

            swap(nums, start, i);

            backtrack(nums, start + 1, result);

            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}