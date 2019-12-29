package com.algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    @Test
    public void testTwoSum() {
        int[] nums = {3, 2, 4};

        int[] ints = twoSum(nums, 6);
        System.out.println(Arrays.toString(ints));

    }


    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        if (result[1] == 0) {
            return null;
        } else {
            return result;
        }

    }

    @Test
    public void testFindMedianSortedArrays() {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;

        double n1 = 0.0;
        double n2 = 0.0;

        if (a % 2 > 0) {
            n1 = (double) nums1[a / 2];
        } else if (a != 0) {
            n1 = ((double) nums1[(a / 2) - 1] + (double) nums1[a / 2]) / 2;

        }

        if (b % 2 > 0) {
            n2 = (double) nums2[b / 2];
        } else if (b != 0) {
            n2 = ((double) nums2[(b / 2) - 1] + (double) nums2[b / 2]) / 2;

        }

        return (n1 + n2) / 2;
    }

    @Test
    public void testGames() {
        int[] nums = {4, 1, 8, 7};
        ArrayList A = new ArrayList<Double>();
        for (int v : nums) A.add((double) v);
        solve(A);
        System.out.println(solve(A));
    }

    public boolean solve(ArrayList<Double> nums) {
        if (nums.size() == 0) return false;
        if (nums.size() == 1) return Math.abs(nums.get(0) - 24) < 1e-6;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i != j) {
                    ArrayList<Double> nums2 = new ArrayList<Double>();
                    for (int k = 0; k < nums.size(); k++)
                        if (k != i && k != j) {
                            nums2.add(nums.get(k));
                        }
                    for (int k = 0; k < 4; k++) {
                        if (k < 2 && j > i) continue;
                        if (k == 0) nums2.add(nums.get(i) + nums.get(j));
                        if (k == 1) nums2.add(nums.get(i) * nums.get(j));
                        if (k == 2) nums2.add(nums.get(i) - nums.get(j));
                        if (k == 3) {
                            if (nums.get(j) != 0) {
                                nums2.add(nums.get(i) / nums.get(j));
                            } else {
                                continue;
                            }
                        }
                        if (solve(nums2)) return true;
                        nums2.remove(nums2.size() - 1);
                    }
                }
            }
        }
        return false;
    }


}


