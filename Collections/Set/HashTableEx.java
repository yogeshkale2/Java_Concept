import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {

        Hashtable<Integer, String> hash = new Hashtable<>();

        hash.put(1, "Java");
        hash.put(2, "Python");
        hash.put(3, "C++");
        hash.put(4, "Java");

        System.out.println(hash);
    }
}