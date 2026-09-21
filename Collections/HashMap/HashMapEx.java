import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(101, "Yogesh");
        map.put(102, "Gaurav");
        map.put(103, "Shivraj");
        map.put(104, "Patil");

        System.out.println(map.get(104));
        System.out.println(map.containsKey(map));
        System.out.println(map.remove(map));

        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}