public class StringBuilder_4_3_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("ABC");
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {

            sb.delete(0, 1);
        }
        System.out.println((System.currentTimeMillis() - startTime));

    }

}
