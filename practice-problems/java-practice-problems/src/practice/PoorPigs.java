package practice;
public class PoorPigs {
    public int poorPigs(int buckets,
                        int minutesToDie,
                        int minutesToTest) {
        int rounds = minutesToTest / minutesToDie;
        int pigs = 0;
        int states = 1;
        while (states < buckets) {
            pigs++;
            states *= (rounds + 1);
        }
        return pigs;
    }
    public static void main(String[] args) {
        PoorPigs obj = new PoorPigs();
        System.out.println(
                obj.poorPigs(1000, 15, 60)
        );
    }
}