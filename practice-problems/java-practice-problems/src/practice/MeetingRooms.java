package practice;
import java.util.*;
public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MeetingRooms obj = new MeetingRooms();
        int[][] intervals = {
                {0, 30},
                {5, 10},
                {15, 20}
        };
        System.out.println(obj.canAttendMeetings(intervals));
    }
}