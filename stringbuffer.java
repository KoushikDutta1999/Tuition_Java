public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello ");
        s.append("World");
        s.insert(6, "Hi");
        // s.replace(o, 6, "Okey");
        // s.delete(0, 4);
        s.reverse();
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}
