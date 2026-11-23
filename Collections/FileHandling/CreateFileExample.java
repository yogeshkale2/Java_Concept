import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt"); // This line not creating file
            if (file.createNewFile()) { // CreateNewFile() is creating file , This Method Return boolean value
                System.out.println("Filead Created Successfully ...");
            } else {
                System.out.println("File Already Exit");
            }
        } catch (IOException e) {
            System.out.println("An Error occured while creating the file");
            e.printStackTrace();
        }
    }

}
