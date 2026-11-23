class Box<T> {
    private T value;

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericEx {
    public static void main(String[] args) {

        Box<String> obj = new Box<>();

        obj.setValue("Java");

        System.out.println("Value: " + obj.getValue());
    }
}