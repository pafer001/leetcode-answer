package com.leetcode.answer.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private static int maxSize;

    public LRU(int maxSize) {
        this.maxSize = maxSize;
    }

    static LinkedHashMap<String, Object> lru = new LinkedHashMap<String, Object>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {

            return size() > maxSize;
        }
    };

    public synchronized void put(String key, Object val) {
        lru.put(key, val);
    }

    public synchronized Object get(String key) {
        return lru.get(key);
    }

    public  synchronized int size() {
        return lru.size();
    }
}
