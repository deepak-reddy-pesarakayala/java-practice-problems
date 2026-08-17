package practice;
import java.util.LinkedList;
import java.util.Queue;
public class DesignHitCounter {
    Queue<Integer> queue = new LinkedList<>();
    public void hit(int timestamp) {
        queue.add(timestamp);
    }
    public int getHits(int timestamp) {
        while (!queue.isEmpty() &&
                timestamp - queue.peek() >= 300) {
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args) {
        DesignHitCounter counter = new DesignHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println(counter.getHits(4));
        counter.hit(300);
        System.out.println(counter.getHits(300));
        System.out.println(counter.getHits(301));
    }
}