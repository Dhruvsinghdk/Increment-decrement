public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b;
        b = a++ + ++ a;
        System.out.println(b);
        int c = 1;
        int ab = ++c + c++ + ++c;
        System.out.println(ab);
    }
}