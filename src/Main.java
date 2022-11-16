import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание 1.3");
        HashMap<String, Integer> str = new HashMap<>();
        str.put("иван", 6);
        str.put("павел", 9);
        str.put("сергей", 5);
        str.put("андрей", 4);
        addToMap(str, "123", 6);
        System.out.println(str.get("123"));

        System.out.println("Задание 2.1");
        Map<String, List<Integer>> collection = new HashMap<>();
        collection.put("строка", randomList());
        collection.put("строка2", randomList());
        collection.put("строка3", randomList());
        collection.put("строка4", randomList());
        collection.put("строка5", randomList());
        System.out.println(collection.entrySet());
        Map<String, Integer> string = convertMap(collection);
        System.out.println(string.entrySet());

        System.out.println("Задание 2.2");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 2);
        map.put("2", 7);
        map.put("3", 6);
        map.put("4", 8);
        map.put("5", 9);
        map.put("6", 7);
        map.put("7", 6);
        map.put("8", 3);
        map.put("9", 5);
        map.put("99", 3);
        System.out.println(map.entrySet());

    }

    public static void addToMap(HashMap<String, Integer> str, String a, Integer i) {
        if (str.containsKey(a) && !str.get(a).equals(i)) {
            str.put(a, i);
        }
        if (str.containsKey(a) && str.get(a).equals(i)) {
            throw new RuntimeException("Значения совпадают");
        }
        if (!str.containsKey(a)) {
            str.put(a, i);
        }
    }

    public static List<Integer> randomList() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            integers.add((int) (Math.random() * 1000));
        }
        return integers;
    }

    public static HashMap<String, Integer> convertMap(Map<String, List<Integer>> collection) {
        HashMap<String, Integer> string = new HashMap<>();
        for (String s : collection.keySet()) {
            int total = 0;
            for (Integer integer : collection.get(s)) {
                total = total + integer;
            }
            string.put(s, total);
        }
        return string;

    }


}