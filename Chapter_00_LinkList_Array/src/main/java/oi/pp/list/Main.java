package oi.pp.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author supanpan
 * @date 2024/01/15
 */
public class Main {
    public static void main(String[] args) {
        /* 初始化列表 */
        // 无初始值
        List<Integer> nums1 = new ArrayList<>();
        // 有初始值（注意数组的元素类型需为 int[] 的包装类 Integer[]）
        Integer[] numbers = new Integer[]{1, 3, 2, 5, 4};
        List<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
        // nums.forEach(System.out::println);

        System.out.println(nums.get(new Random().nextInt(nums.size())));

    }
}
