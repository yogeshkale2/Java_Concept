import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationEx {
    public static void main(String[] args) {

        Hashtable<Integer, String> map = new Hashtable<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        Enumeration<Integer> keys = map.keys();

        while (keys.hasMoreElements()) {
            Integer id = keys.nextElement();
            System.out.println(id);
        }
    }
}