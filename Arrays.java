public class Arrays {
    public static void main(String[] args) {
        int[] example = new int[11];
        int value = 5;
        for (int i = 0; i < example.length; i++) {
            example[i] = value;
            value++;
            System.out.println(example[i]);
        }
    }
}
