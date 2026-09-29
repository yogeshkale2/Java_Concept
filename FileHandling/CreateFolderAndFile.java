import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
    public static void main(String[] args) {
        try {
            File folder = new File("C:\\github_project");
            if (!folder.exists()) {
                folder.mkdir();
            }
            File file = new File(folder, "FilePathExample");
            if (file.createNewFile()) {
                System.out.println("File Created Successfullly " + file.getAbsolutePath());
            } else {
                System.out.println("File Already exit");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
