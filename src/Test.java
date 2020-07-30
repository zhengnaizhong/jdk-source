public class Test {

    public static void main(String[] args) {
        String key = "Hello World!";
        int h;
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }
}
