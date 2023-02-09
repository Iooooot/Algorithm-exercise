package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wht
 * @date 2023/2/8 16:52
 */
public class 删除子文件夹 {
    public static void main(String[] args) {
        String[] folder = new String[]{"/ah/al/am","/ah/al"};
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        String st = folder[0]+"/";
        ans.add(folder[0]);
        int cnt = 1;
        for (int i = 1; i < folder.length; i++) {
            if(folder[i].startsWith(st)){
                continue;
            }
            st = folder[i]+"/";
            ans.add(folder[i]);
        }
        for (String an : ans) {
            System.out.println(an);
        }
    }
}
