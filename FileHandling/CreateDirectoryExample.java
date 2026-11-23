import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        File folder = new File("C:\\github_project\\JS\\filedemo");
        if (folder.mkdir()) {
            System.out.println("Folder Create Successfullly .. ");
        } else {
            System.out.println("Folder Already Exited ");
        }
    }

}
