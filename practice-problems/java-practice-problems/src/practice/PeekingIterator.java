package practice;
import java.util.*;
public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextValue;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextValue = iterator.next();
        }
    }
    public Integer peek() {
        return nextValue;
    }
    @Override
    public Integer next() {
        Integer result = nextValue;
        if (iterator.hasNext()) {
            nextValue = iterator.next();
        } else {
            nextValue = null;
        }
        return result;
    }
    @Override
    public boolean hasNext() {
        return nextValue != null;
    }
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1, 2, 3);
        PeekingIterator obj =
                new PeekingIterator(list.iterator());
        System.out.println(obj.peek());
        System.out.println(obj.peek());
        System.out.println(obj.next());
        System.out.println(obj.next());
        System.out.println(obj.peek());
        System.out.println(obj.next());
        System.out.println(obj.hasNext());
    }
}