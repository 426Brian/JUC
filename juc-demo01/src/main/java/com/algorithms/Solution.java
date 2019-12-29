package com.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};

        int[] ints = twoSum(nums, 6);
        System.out.println(Arrays.toString(ints));

    }


    public static int[] twoSum(int[] nums, int target) {
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

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;

        if (a / 2 != 0) {
            a = nums1[a / 2];
        } else {
            a = (nums1[a / 2 - 1] + nums1[a / 2]) / 2;
        }

        if (b / 2 != 0) {
            b = nums2[b / 2];
        } else {
            b = (nums2[b / 2 - 1] + nums2[b / 2]) / 2;
        }

        return (a + b) / 2;
    }
}



