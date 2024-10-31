package com.artamonov;

import java.util.ArrayList;
import java.util.List;

public class Permutator{
     
    private static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public static void permute(List<Integer> nums, int start, List<List<Integer>> result) {
        if (start == nums.size() - 1) {
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++) {
            swap(nums, start, i);
            permute(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    public static List<List<Integer>> perms(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }   
}
