package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wht
 * @date 2023/9/17 9:48
 */
public class 重新规划路线 {
    public static void main(String[] args) {
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        minReorder(6,connections );
    }
    public static int minReorder(int n, int[][] connections) {
        // 存放某个城市所在的connections中的index
        List<List<Integer>> cityPosIndexList = new ArrayList<>();
        int len = connections.length;
        for (int i = 0; i < n; i++) {
            cityPosIndexList.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            cityPosIndexList.get(connections[i][0]).add(i);
            cityPosIndexList.get(connections[i][1]).add(i);
        }
        // 存放数据的位置是否已经访问过
        boolean[] visited = new boolean[len];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int res = 0;
        while (!queue.isEmpty()) {
            // 站出队列
            int currentCity = queue.poll();
            // 获取所有包含当前城市的的所有数据索引
            List<Integer> currentCityAllPosIndex = cityPosIndexList.get(currentCity);
            for (Integer cityIndex : currentCityAllPosIndex) {
                if (!visited[cityIndex]) {
                    visited[cityIndex] = true;
                    int fromCity = connections[cityIndex][0];
                    int toCity = connections[cityIndex][1];
                    // 如果是from->to,则缺少反方向的路径，需要修改的路径+1
                    res += (fromCity == currentCity) ? 1 : 0;
                    // 如果当前站点是from，将下一个站点加入队列，否则将from加入队列
                    queue.offer(fromCity == currentCity ? toCity : fromCity);
                }
            }
        }
        return res;
    }
}
