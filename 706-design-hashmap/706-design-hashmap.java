class MyHashMap {
    int[] arr;
    public MyHashMap() {
        arr = new int[(int)Math.pow(10, 6)+1];
        Arrays.fill(arr, -1);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}