package leetcode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author wht
 * @date 2023/12/1 10:03
 */
public class 字母异位词分组 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] t = strs[i].toCharArray();
            Arrays.sort(t);
            String s = new String(t);
            if(map.containsKey(s)){
                ans.get(map.get(s)).add(strs[i]);
            }else{
                map.put(s,ans.size());
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                ans.add(list);
            }
        }
        for (List<String> an : ans) {
            for (String s : an) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
