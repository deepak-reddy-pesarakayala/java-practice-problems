package practice;
public class FirstHighestSalary {
    public static int highestSalary(int[] salary) {
        int max = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] salary = {25000, 45000, 30000, 60000, 40000};
        System.out.println(highestSalary(salary));
    }
}