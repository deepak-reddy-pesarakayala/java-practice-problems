package practice;
import java.util.*;
public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                int count = Integer.bitCount(hour)
                        + Integer.bitCount(minute);
                if (count == turnedOn) {
                    result.add(
                            hour + ":" +
                                    String.format("%02d", minute)
                    );
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        BinaryWatch obj = new BinaryWatch();
        System.out.println(obj.readBinaryWatch(1));
    }
}