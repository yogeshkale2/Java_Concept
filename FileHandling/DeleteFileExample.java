import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Deleted Successfully...");
            } else {
                System.out.println("Unable To Delete File");
            }
        } else {
            System.out.println("Not Found File ");
        }
    }
}
