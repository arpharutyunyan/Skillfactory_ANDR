public class MethodStringBilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i=0; i<2; i++) {
            sb.append("abc");
            sb.delete(0, 2);
            sb.insert(0, "A");
            sb.insert(sb.length()/2, "ARPINE" );
            sb.setCharAt(1, '@');
            sb.reverse();

        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(sb);
    }
}
