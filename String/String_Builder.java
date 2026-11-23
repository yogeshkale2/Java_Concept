public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Pranav");
        sb.append(" patil");

        sb.insert(0, "Hello");

        sb.delete(4,6);

        System.out.println(sb.reverse());

        System.out.println(sb. length());

        System.out.println(sb.charAt(2));

        
        System.out.println(sb);

    }
    
}
