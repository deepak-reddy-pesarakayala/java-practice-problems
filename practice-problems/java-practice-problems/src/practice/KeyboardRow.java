package practice;
import java.util.*;
public class KeyboardRow {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> result=new ArrayList<>();
        for(String word:words) {
            String w=word.toLowerCase();
            String row="";
            if(row1.indexOf(w.charAt(0))!=-1) row=row1;
            else if(row2.indexOf(w.charAt(0))!=-1) row=row2;
            else row=row3;
            boolean valid=true;
            for(char c:w.toCharArray()) {
                if(row.indexOf(c)==-1) {
                    valid=false;
                    break;
                }
            }
            if(valid) result.add(word);
        }
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        KeyboardRow obj=new KeyboardRow();
        String[] words={"Hello","Alaska","Dad","Peace"};
        String[] result=obj.findWords(words);
        System.out.println(Arrays.toString(result));
    }
}