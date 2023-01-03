package leetcode;

import java.util.TreeSet;

/**
 * @author wht
 * @date 2022/12/30 11:23
 */
public class ExamRoom {
    public TreeSet<Integer> stu;
    public int n;

    public ExamRoom(int n) {
        stu = new TreeSet<Integer>();
        this.n = n;
    }

    public int seat() {
        int ans = 0;
        if(stu.size() != 0) {
            int dist = stu.first();
            Integer prev = null;
            for (Integer s : stu) {
                if(prev != null){
                    int d = (s - prev) / 2;
                    if(d > dist){
                        ans = prev + d;
                        dist = d;
                    }
                }
                prev = s;
            }
            if(n - 1 - stu.last() > dist){
                ans = n - 1;
            }
        }
        stu.add(ans);
        return ans;
    }

    public void leave(int p) {
        stu.remove(p);
    }
}
