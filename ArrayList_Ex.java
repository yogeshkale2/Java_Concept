import java.util.ArrayList;

public class ArrayList_Ex {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Pranav");
        name.add("Gaurav");
        name.add("Piyush");
        name.add("Akshada");
        name.add("payal");
        System.out.println("Size of ArrayList: " + name.size()); // Get The Size of ArrayList

        System.out.println(name); // Print the ArrayList

        System.out.println("Print the index of 0 element: " + name.get(0)); // Get the index 0 element
        name.remove(1); // Remove the index 1 element
        System.out.println(name); // Print the ArrayList after removal

        System.out.println("Does the ArrayList contains 'payal'? " + name.contains("payal")); // Check if the ArrayList
                                                                                              // contains 'payal'

        System.out.println("Is the ArrayList empty? " + name.isEmpty()); // Check if the ArrayList is empty

        System.out.println("Index of 'Akshada': " + name.indexOf("Akshada")); // Get the index of 'Akshada'

        System.out.println("Last index of 'payal': " + name.lastIndexOf("payal")); // Get the last index of 'payal'
        System.out.println(name.removeAll(name)); // Remove all elements from the ArrayList
        System.out.println("Is the ArrayList empty after removing all elements? " + name.isEmpty()); // Check if the
                                                                                                     // ArrayList is
                                                                                                     // empty after
                                                                                                     // removing all
                                                                                                     // elements
        System.out.println("Size of ArrayList after removing all elements: " + name.size()); // Get the size of the
                                                                                             // ArrayList after removing
                                                                                             // all elements

        for (String num : name) { // Print the ArrayList using Enhanced For loop
            System.out.println(num);
        }

        System.out.println("...........");
        // ArrayList of Integer
        ArrayList<Integer> age = new ArrayList<>();
        age.add(21);
        age.add(18);
        age.add(20);
        age.add(16);
        System.out.println("Size of ArrayList: " + age.size()); // Get The Size of ArrayList
        System.out.println(age); // Print the ArrayList
    }
}
