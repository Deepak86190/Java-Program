public class TowerHanoi {
    public static void Th(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println(n + src + dest);
            return;
        }
        Th(n - 1, src, dest, help);
        System.out.println(n + src + dest + help);

        Th(n - 1, help, src, dest);
    }

    public static void main(String args[]) {
        int n = 5;
        Th(n, "A", "B", "C");
    }
}
