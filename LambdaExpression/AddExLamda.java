interface Addition {
    int add(int a, int b);
}

public class AddExLamda {
    public static void main(String[] args) {
        Addition obj = (int num1, int num2) -> {
            int result = num1 + num2;
            return result;
        };
        obj.add(10, 10);
        System.out.println("Additon: " + obj.add(10, 10));
    }

}
