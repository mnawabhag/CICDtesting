import java.util.Arrays;
import java.util.Comparator;

public class MaxStudentAvg {

    public static void main(String[] args) {
        String[][] input = {{"Alice", "450", "5"},{"Bob", "380", "4"},{"Charlie", "300", "3"},{"David", "300", "3"}};
        String[][] input1 = {{"Alice", "450"},{"Bob", "380"},{"Charlie", "500"},{"David", "300"}};

        usingThenComparing(input);
        getMaxMarksOnly(input1);
        getMaxAvgStudent(input);
        descendingOrderOfStudentsAlphabetically(input);
    }

    private static void usingThenComparing(String[][] input) {
        Arrays.stream(input)
                .map(arr->new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2])))
                .max(Comparator.comparingDouble((Student arr)->(double)arr.getMarks()/arr.getCount())
                        .thenComparing(Student::getName))
                .ifPresent(arr->{
                    System.out.println("1 Student with max average marks: "+arr.getName()+" has marks "+(double)arr.getMarks()/arr.getCount());
                });
    }

    private static void getMaxMarksOnly(String[][] input1) {
        Arrays.stream(input1)
                .map(arr->new Student(arr[0],Integer.parseInt(arr[1]),0))
                .max(Comparator.comparingInt(Student::getMarks))
                .ifPresent(arr->{
                    System.out.println("2 Student with max marks: "+arr.name+" has marks "+arr.marks);
                });
    }

    private static void getMaxAvgStudent(String[][] input) {
            Arrays.stream(input)
                    .map(arr->new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2])))
                    .max(Comparator.comparingDouble(arr->(double)arr.getMarks()/arr.getCount()))
                    .ifPresent(arr->{
                        System.out.println("3 Student with max avg: "+arr.getName()+" has avg "+(double)arr.getMarks()/arr.getCount());
                    });
    }

    private static void descendingOrderOfStudentsAlphabetically(String[][] input) {
        Arrays.stream(input)
                .map(arr->new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2])))
                .sorted(Comparator.comparing((Student s) -> s.name).reversed())
                .forEach(arr->{
                    System.out.println();
                    System.out.println("**************************");
                    System.out.println("Student Name: "+arr.name);
                    System.out.println("Marks: "+arr.marks);
                    System.out.println("Count: "+arr.count);
                });
    }



}
