package practice;
import java.util.Arrays;
public class NthHighestSalary {
    public static int nthHighestSalary(int[] salary, int n) {
        Arrays.sort(salary);
        int count = 1;
        int previous = salary[salary.length - 1];
        if (n == 1) {
            return previous;
        }
        for (int i = salary.length - 2; i >= 0; i--) {
            if (salary[i] != previous) {
                count++;
                previous = salary[i];
                if (count == n) {
                    return salary[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] salary = {100, 300, 200, 500, 300};
        int n = 2;
        System.out.println(
                nthHighestSalary(salary, n)
        );
    }
}