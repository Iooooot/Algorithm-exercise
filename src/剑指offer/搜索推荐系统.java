package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wht
 * @date 2023/10/15 10:30
 */
public class 搜索推荐系统 {
    public static void main(String[] args) {
        String[] products = {"havana"};
        String searchWord = "tatiana";
        suggestedProducts(products,searchWord);
    }

    public static List<List<String>> suggestedProducts(String[] ps, String w) {
        Arrays.sort(ps);
        int n = ps.length;
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            String cur = w.substring(0, i + 1);
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (ps[mid].compareTo(cur) >= 0) r = mid;
                else l = mid + 1;
            }
            List<String> list = new ArrayList<>();
            if (ps[r].compareTo(cur) >= 0) {
                for (int j = r; j <= Math.min(n - 1, r + 2); j++) {
                    if (ps[j].length() < cur.length()) break;
                    if (!ps[j].substring(0, i + 1).equals(cur)) break;
                    list.add(ps[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
