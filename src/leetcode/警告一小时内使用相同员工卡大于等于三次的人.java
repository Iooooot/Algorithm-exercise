package leetcode;

import java.util.*;

/**
 * @author wht
 * @date 2023/2/7 12:17
 */
public class 警告一小时内使用相同员工卡大于等于三次的人 {
    public static void main(String[] args) {
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        List<String> ans = new ArrayList<>();
        Map<String, List<Integer>> d = new HashMap<>();
        for (int i = 0; i < keyName.length; ++i) {
            String name = keyName[i];
            String time = keyTime[i];
            int t = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
            d.computeIfAbsent(name, k -> new ArrayList<>()).add(t);
        }
        for (Map.Entry<String, List<Integer>> e : d.entrySet()) {
            List<Integer> ts = e.getValue();
            int n = ts.size();
            if (n > 2) {
                Collections.sort(ts);
                for (int i = 0; i < n - 2; ++i) {
                    if (ts.get(i + 2) - ts.get(i) <= 60) {
                        ans.add(e.getKey());
                        break;
                    }
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
