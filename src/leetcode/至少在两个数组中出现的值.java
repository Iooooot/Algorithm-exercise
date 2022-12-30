package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wht
 * @date 2022/12/29 14:46
 */
public class 至少在两个数组中出现的值 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        Set<Integer> ans = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Arrays.stream(nums1).forEach(set1::add);
        Arrays.stream(nums2).forEach(set2::add);
        Arrays.stream(nums3).forEach(set3::add);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : set1) {
            map.put(num,1);
        }
        for (Integer num : set2) {
            if(map.getOrDefault(num,0) != 0){
                ans.add(num);
            }else{
                map.put(num,1);
            }
        }
        for (Integer num : set3) {
            if(map.getOrDefault(num,0) != 0){
                ans.add(num);
            }
        }
        System.out.println(ans.stream().collect(Collectors.toList()).toString());
    }
}
