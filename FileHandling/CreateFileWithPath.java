import java.io.File;
import java.io.IOException;

public class CreateFileWithPath {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\github_project\\FilePathEx");
            if (file.createNewFile()) {
                System.out.println("Folder Created Successfully ... " + file.getName());
            } else {
                System.out.println("File Already Exit..");
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating file ");
            e.printStackTrace();
        }
    }

}
