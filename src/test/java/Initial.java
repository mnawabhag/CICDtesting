

import java.util.*;

public class Initial {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("b");
        list.add("b");
        list.add("c");
        list.stream()
                .filter(set::add).forEach(System.out::println);

        System.out.println("********************************");

        String[] arr = {"A", "B", "C"};
        List<String> list1 = new ArrayList<>(Arrays.asList(arr));
        list1.add("D");
        list1.forEach(System.out::println);

        System.out.println("********************************");

        List<Integer> list3=Arrays.asList(1,2,3,2,3,4,5,5,6,7,8,8,9,9,10);
        ArrayList<Integer> result = new ArrayList<>(new LinkedHashSet<>(list3));
        System.out.println(result.stream().max(Comparator.naturalOrder()));

        System.out.println("********************************");

        int[] arr1 = {4, 6, 1, 9};
        String[]   arr2 = {"D", "B", "A", "C"};

        int max = Arrays.stream(arr1).max().getAsInt();
        int min = Arrays.stream(arr1).min().getAsInt();
        arr2 = Arrays.stream(arr2).sorted().toArray(String[]::new);
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("********************************");

        String s = "test automation framework";
        int count = s.split(" ").length;
        System.out.println("Number of words: " + count);

        System.out.println("********************************");


        Map<String, Integer> map = Map.of(
                "UI", 3,
                "API", 5,
                "DB", 2
        );

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("********************************");

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("********************************");

        for(String entry : map.keySet()) {
            System.out.println(entry + " : " + map.get(entry));
        }

        System.out.println("********************************");

        for(Integer values : map.values()) {
            System.out.println(values);
        }
        System.out.println("********************************");

        String str = "swiss";
        Map<Character, Integer> map2=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        System.out.println(map2.entrySet().stream().filter(s1->s1.getValue()==1).findFirst().get().getKey());

        System.out.println("********************************");

        String s3="d9dd*&*8ac@#%$#@!";
        StringBuilder sb=new StringBuilder();
        for(char c:s3.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                sb.append(c);
            }else {
                sb.append("");
            }
        }
        System.out.println(sb.toString());





    }


}
