import java.util.*;

public class MaxAvgTraditional {

    public static void main(String[] args) {
        String [][] s1={{"Arun","100"},{"Malli","101"},{"Ballu","102"},{"kalya","104"},{"veerya","104"}};
        maxMarksTraditional(s1);
    }

    public static void maxMarksTraditional(String[][] s1){
        int maxMarks=Integer.MIN_VALUE;
        for(String[] s2:s1){
            if(Integer.parseInt(s2[1])>maxMarks){
                maxMarks= Integer.parseInt(s2[1]);
            }
        }
        for(String[] s2:s1){
            if(Integer.parseInt(s2[1])==maxMarks){
                System.out.println(s2[0]);
            }
        }
    }
}
