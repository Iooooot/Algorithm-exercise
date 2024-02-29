package LeetCode1002刷;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wht
 * @date 2024/2/26 12:52
 */
public class LRU {
    public static void main(String[] args) {
    }
}
class LRUCache {
    LinkedHashMap<Integer,Integer> cache;
    public LRUCache(int capacity) {
        cache = new LRUTest(capacity);
    }

    public int get(int key) {
        if(!cache.containsKey(key))
        {
            return -1;
        }
        return cache.get(key);
    }

    public void put(int key, int value) {
        cache.put(key,value);
    }
}

class LRUTest extends LinkedHashMap<Integer, Integer>
{
    private int capacity;

    /**
     * 当LinkedHashMap的accessOrder参数为true时，即会按照访问顺序排序，最近访问的放在最前，最早访问的放在后面
     */
    public LRUTest(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }

    /**
     * LinkedHashMap自带的判断是否删除最老的元素方法，默认返回false，即不删除老数据
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
    {
        return size() > capacity;
    }
}