package practice;
public class MagicalString {
    public int magicalString(int n) {
        if(n<=0) return 0;
        if(n<=3) return 1;
        int[] arr=new int[n+2];
        arr[0]=1;
        arr[1]=2;
        arr[2]=2;
        int index=2;
        int next=1;
        int count=1;
        for(int i=3;i<n;) {
            for(int j=0;j<arr[index]&&i<n;j++) {
                arr[i]=next;
                if(next==1) count++;
                i++;
            }
            next=3-next;
            index++;
        }
        return count;
    }
    public static void main(String[] args) {
        MagicalString obj=new MagicalString();
        System.out.println(obj.magicalString(6));
    }
}