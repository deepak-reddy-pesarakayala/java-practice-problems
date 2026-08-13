package practice;
public class ValidPhoneNumbers {
    public static void main(String[] args) {
        String[] numbers = {
                "987-654-3210",
                "123 456 7890",
                "123-45-6789",
                "9876543210"
        };
        for (String number : numbers) {
            if (number.matches("\\d{3}[- ]\\d{3}[- ]\\d{4}")) {
                System.out.println(number + " -> Valid");
            } else {
                System.out.println(number + " -> Invalid");
            }
        }
    }
}