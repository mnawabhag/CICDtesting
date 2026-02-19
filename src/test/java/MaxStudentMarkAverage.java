import java.util.HashMap;
import java.util.Map;

public class MaxStudentMarkAverage {

    public static void main(String[] args) {
        String [][] input={{"Bob","87"},{"Mike","52"},{"Bob","78"},{"Mike","99"},{"Jessi","87"},{"Jessi","99"},{"kalya","20"}};
        calculateMaxAverage(input);
    }

    public static void calculateMaxAverage(String[][] input){
        Map<String,Student> StudentMap = new HashMap<>();

        int maxAvg = Integer.MIN_VALUE;
        String maxStudentName = "";

        for(String[] s1:input){
            String name = s1[0];
            int marks = Integer.parseInt(s1[1]);
            if(StudentMap.containsKey(name)){
                Student repeatedStudent=StudentMap.get(name);
                repeatedStudent.marks += marks;
                repeatedStudent.count += 1;
//                StudentMap.put(name,new Student(name,repeatedStudent.marks+marks,repeatedStudent.count+1));
//                int maxavg1 = (repeatedStudent.marks + marks)/(repeatedStudent.count + 1);
//                maxAvg=Math.max(maxavg1,maxAvg);
            }else{
                StudentMap.put(name,new Student(name,marks,1));
//                maxAvg=Math.max(marks,maxAvg);
            }
        }


        for(Map.Entry<String, Student> entry : StudentMap.entrySet()){
            Student student=entry.getValue();
            int avg=student.getMarks()/student.getCount();
            if(avg>maxAvg){
                maxAvg=avg;
                maxStudentName=student.getName();
            }
        }
        System.out.println("Student with Maximum Average: " + maxStudentName);
        System.out.println("Maximum Average Marks: " + maxAvg);


    }
}
