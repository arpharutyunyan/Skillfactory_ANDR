package JavaCore.Module_4_5;

public class ExampleClass {
    public static void main(String[] args) {
        int [] arr = {
                15,27,3,344,17
        };
        int sum = 0;
        for (int i: arr){
            sum+=i;
        }
        System.out.println(sum/arr.length);
    }
}
