import java.util.ArrayList;

public class StringOperator {
    public static int Task1(String in){
        int index = -1;
        String[] words = in.split(" ");
        for (int i =0;i< words.length;i++) {
            if(words[i].length() > 2){
                if(words[i].equals((new StringBuilder(words[i])).reverse().toString())){
                    index = i;
                    return(index);
                }
            }
        }
        return index;
    }
    public  static ArrayList<String> Task2(String in){
        ArrayList<String> out = new ArrayList<>();
        String[] words = in.split(" ");
        for(int i =0;i<words.length;i++){
            if(words[i].length() > 2){
                if(words[i].equals((new StringBuilder(words[i])).reverse().toString())){
                    out.add(words[i]);
                }
            }
        }
        return out;

    }
}
