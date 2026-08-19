package practice;
import java.util.*;
public class LFUCache {
    static class Node {
        int key,value,frequency;
        Node(int key,int value) {
            this.key=key;
            this.value=value;
            frequency=1;
        }
    }
    int capacity,minFrequency;
    HashMap<Integer,Node> map=new HashMap<>();
    HashMap<Integer,LinkedHashSet<Integer>> frequencyMap=new HashMap<>();
    public LFUCache(int capacity) {
        this.capacity=capacity;
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        increaseFrequency(node);
        return node.value;
    }
    public void put(int key,int value) {
        if(capacity==0) return;
        if(map.containsKey(key)) {
            Node node=map.get(key);
            node.value=value;
            increaseFrequency(node);
            return;
        }
        if(map.size()==capacity) {
            LinkedHashSet<Integer> keys=frequencyMap.get(minFrequency);
            int removeKey=keys.iterator().next();
            keys.remove(removeKey);
            map.remove(removeKey);
        }
        Node node=new Node(key,value);
        map.put(key,node);
        frequencyMap.computeIfAbsent(1,k->new LinkedHashSet<>()).add(key);
        minFrequency=1;
    }
    private void increaseFrequency(Node node) {
        int oldFrequency=node.frequency;
        LinkedHashSet<Integer> keys=frequencyMap.get(oldFrequency);
        keys.remove(node.key);
        if(oldFrequency==minFrequency&&keys.isEmpty()) {
            minFrequency++;
        }
        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency,k->new LinkedHashSet<>()).add(node.key);
    }
    public static void main(String[] args) {
        LFUCache cache=new LFUCache(2);
        cache.put(1,10);
        cache.put(2,20);
        System.out.println(cache.get(1));
        cache.put(3,30);
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
    }
}