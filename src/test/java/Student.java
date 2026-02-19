public class Student {
    String name;
    int marks;
    int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Student(String name, int marks, int count) {
        this.name = name;
        this.marks = marks;
        this.count = count;
    }


}
