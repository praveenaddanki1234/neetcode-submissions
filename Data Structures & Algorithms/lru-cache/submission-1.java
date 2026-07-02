

class LRUCache {
    int cap;
    Map<Integer, Integer> m;

    public LRUCache(int capacity) {
        this.cap = capacity;
        m = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if (m.containsKey(key)) {
            int value = m.get(key);
            // Move to the end to mark it as Most Recently Used
            m.remove(key);
            m.put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        // 1. If key already exists, remove it so the new value goes to the end
        if (m.containsKey(key)) {
            m.remove(key);
        } 
        // 2. If it's a new key and cache is full, evict the oldest (the first item)
        else if (m.size() == cap) {
            Map.Entry<Integer, Integer> e = m.entrySet().iterator().next();
            m.remove(e.getKey());
        }
        
        // 3. Insert the key-value pair
        m.put(key, value);
    }
}