package practice;
public class Base7 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean negative=num<0;
        num=Math.abs(num);
        StringBuilder result=new StringBuilder();
        while(num>0) {
            result.append(num%7);
            num/=7;
        }
        if(negative) result.append("-");
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Base7 obj=new Base7();
        System.out.println(obj.convertToBase7(100));
    }
}