import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionsEx {
    public static void main(String[] args) {
    // String Operation
        ArrayList<String> names = new ArrayList();
        names.add("Pranav");
        names.add("Yogesh");
        names.add("Gaurav");
        names.add("Shivraj");
        names.add("vijay");

        System.out.println(names.get(1)); // show the index 1 element
        System.out.println(names.get(2)); // show the index 2 element
        System.out.println(names.get(3)); // show the index 3 element
        names.remove("Pranav"); // Remove the element
        // System.out.println(names);
        System.out.println("......");
        System.out.println(names.contains("vijay")); // Check this element is present or not 
        System.out.println(names.isEmpty()); // Check empty or not
        for (String num : names) { // Print using Enhanced For loop
            System.out.println(num);
        }

        // Interger Operation

        ArrayList<Integer> age = new ArrayList();
        age.add(20);
        age.add(30);
        age.add(40);
        age.add(55);
        System.out.println(age);
        System.out.println(age.size()); // Check the Size of Array list
        System.out.println(age.lastIndexOf(age));
     
   
   
    }


}