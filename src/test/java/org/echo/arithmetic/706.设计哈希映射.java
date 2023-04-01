import java.util.Iterator;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=706 lang=java
 * @lcpr version=21901
 *
 * [706] 设计哈希映射
 */

// @lc code=start
class MyHashMap {
    private class Pair{
        private int key;
        private int value;
        public Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
        public int getKey(){
            return key;
        }
        public void setKey(int key){
            this.key=key;
        }
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value=value;
        }
    }

    private static final int BASE=769;
    private LinkedList[] data;

    public MyHashMap() {
        data= new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i]=new LinkedList<Pair>();
        }
    }
    
    public void put(int key, int value) {
        int h=hash(key);
        Iterator<Pair> iterator = data[h].iterator();
        while(iterator.hasNext()){
            Pair next = iterator.next();
            if(next.getKey()==key){
                next.setValue(value);
                return;
            }
        }
        data[h].offerLast(new Pair(key, value));
    }
    
    public int get(int key) {
        int h=hash(key);
        Iterator<Pair> iterator = data[h].iterator();
        while(iterator.hasNext()){
            Pair next = iterator.next();
            if(next.getKey()==key){
                return next.getValue();
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int h=hash(key);
        Iterator<Pair> iterator = data[h].iterator();
        while(iterator.hasNext()){
            Pair next = iterator.next();
            if(next.getKey()==key){
                data[h].remove(next);
                return;
            }
        }
    }

    private static int hash(int key){
        return key%BASE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end



/*
// @lcpr case=start
// 
// @lcpr case=end

 */


