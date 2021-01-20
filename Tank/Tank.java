public class Tank {
    int x;

    public void goForward(int i) {
        x += i;
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d now. \n", x);
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
