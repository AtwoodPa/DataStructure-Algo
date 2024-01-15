package oi.pp.leetcode;

import oi.pp.Stopwatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author supanpan
 * @date 2024/01/15
 */
public class SumOfTwoNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 13, 7, 15};
        Stopwatch.start();
        int[] solution = solution2(nums, 9);
        Stopwatch.stop();
        System.out.println(Arrays.toString(solution));

        // 获取执行时间
        long elapsedTime = Stopwatch.getTimeElapsedInMilliseconds();
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");

        // 重置计时器，准备进行新的计时
        Stopwatch.reset();



    }

    /**
     * 解法2：查找表法
     * 实现方式
     * 1、哈希表 （首选）
     * 2、平衡二叉搜索树
     *
     * @return O(n)
     */
    public static int[] solution2(int[] nums, int target) {
        int len = nums.length;
        // 初始化Hash表
        Map<Integer, Integer> hashMap = new HashMap<>(len - 1);// 初始化容量，避免Hash表扩容造成性能损耗
        // 第一个元素肯定不在哈希表中，直接放入
        hashMap.put(nums[0], 0);
        for (int i = 1; i < len; i++) {
            int key = target - nums[i];// key为目标值与当前值的差值
            if (hashMap.containsKey(key)) {
                return new int[]{ hashMap.get(key),i};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    /**
     * 解法1：暴力法
     *
     * @param nums
     * @param target
     * @return O(n ^ 2)
     */
    public static int[] solution1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
