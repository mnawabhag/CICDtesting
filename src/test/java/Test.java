import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

    static B b = new B();

    public static String getANameFromB(){
        return b.getAName();
    }


    public static void main(String[] args) {
        System.out.println(Test.getANameFromB());

       List<Integer> numbers= List.of(1, 4, 34, 64, 0, -1);

        int maxnumer = numbers.stream().max(Comparator.naturalOrder()).get();

        System.out.println(maxnumer);

    }

}
