package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wht
 * @date 2023/3/3 9:21
 */
public class 保证文件名唯一 {
    public static void main(String[] args) {
        String[] names = {"gta","gta(1)","gta","avalon"};
        String[] ans = new String[names.length];
        int cnt = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            Integer t = map.getOrDefault(name, 0);
            if(t == 0){
                ans[cnt++] = name;
                map.put(name,1);
            }else{
                int k = map.get(name);
                while(map.containsKey(name + "(" + k + ")")){
                    k++;
                }
                ans[cnt++] = name + "(" + k + ")";
                map.put(name,k+1);
                map.put(name + "(" + k + ")",1);
            }

        }
        for (String an : ans) {
            System.out.println(an);
        }
    }
}
