class MyHashMap {
HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
public MyHashMap() {

}

public void put(int key, int value) {
    map.put(key,value);
}

public int get(int key) {
  return (map.get(key) == null)?-1:map.get(key);
}

public void remove(int key) {
  map.remove(key) ; 
}
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */