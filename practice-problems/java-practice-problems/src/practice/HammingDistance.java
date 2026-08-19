package practice;
public class HammingDistance {
    public int hammingDistance(int x,int y) {
        int count=0;
        while(x!=0||y!=0) {
            if((x&1)!=(y&1)) {
                count++;
            }
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        HammingDistance obj=new HammingDistance();
        System.out.println(obj.hammingDistance(1,4));
    }
}