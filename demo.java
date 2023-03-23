public class demo {
    public static void main(String[] args) {
        demo d = new demo();
        d = null;
        System.gc();
        System.out.println("Garbage Collected");
    }
    protected void finalize() {
        System.out.println("Finalize method is called");
    }
}
