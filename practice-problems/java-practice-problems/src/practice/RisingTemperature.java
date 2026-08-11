package practice;
public class RisingTemperature {
    public static void main(String[] args) {
        int[] temperature = {10, 25, 20, 30, 35};
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > temperature[i - 1]) {
                System.out.println(temperature[i]);
            }
        }
    }
}