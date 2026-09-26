import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet();
        hash.add("Java");
        hash.add("Python");
        hash.add("C++");
        hash.add("Java");

        for (String Hash : hash) {
            System.out.println(Hash);
        }

    }
}