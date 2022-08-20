package 搜索与图论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main_八数码 {
    private static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine().replace(" ", "");
        System.out.println(bfs(str));
    }

    private static int bfs(String str) {
        Queue<String> q = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        String end = "12345678x";

        q.add(str);
        map.put(str,0);
        while(q.size() != 0){
            String t = q.remove();
            if(t.equals(end)){
                return map.get(t);
            }
            int pos = t.indexOf("x");
            int x = pos / 3;
            int y = pos % 3;
            for (int i = 0; i < 4; i++) {
                int tx = x + dx[i];
                int ty = y + dy[i];

                if(tx >= 3 || tx < 0 || ty >= 3 || ty < 0) {
                    continue;
                }
                String newStr = getStr(t,pos,tx * 3 + ty);

                if(map.containsKey(newStr)){
                    continue;
                }

                map.put(newStr,map.get(t) + 1);
                q.add(newStr);
            }
        }
        return -1;
    }

    private static String getStr(String t, int pos, int newPos) {
        StringBuilder str = new StringBuilder(t);
        str.setCharAt(pos,t.charAt(newPos));
        str.setCharAt(newPos,'x');
        return str.toString();
    }


}
