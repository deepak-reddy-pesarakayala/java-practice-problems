package practice;
import java.util.ArrayList;
public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("ArrayList: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));
        numbers.set(1, 25);
        System.out.println("After changing: " + numbers);
        numbers.remove(2);
        System.out.println("After removing: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 40: " + numbers.contains(40));
    }
}