package LeetCode100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wht
 * @date 2023/5/28 9:17
 */
public class LRU缓存 {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(2,1);
        cache.put(1,1);
        cache.put(2,3);
        cache.put(4,1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }
}

class LRUCache {
    public HashMap<Integer, Integer> map = new HashMap<>();
    public Queue<Integer> queue;
    public int capacity;
    public LRUCache(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            queue.remove(key);
            queue.offer(key);
            return map.get(key);
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            queue.remove(key);
            queue.offer(key);
        }else{
            if(queue.size() == capacity){
                Integer t = queue.poll();
                map.remove(t);
            }
            queue.offer(key);
            map.put(key, value);
        }
    }
}
