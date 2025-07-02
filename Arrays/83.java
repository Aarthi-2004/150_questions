//Given an array nums of distinct integers, return all the possible permutations. You
//can return the answer in any order
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
import java.util.*;
 class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);

        for (List<Integer> perm : result) {
            System.out.print(perm);
        }
    }
    public static void backtrack(int[] nums, List<Integer> tempList, boolean[] used, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; 
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(nums, tempList, used, result);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
