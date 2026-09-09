class Permutation {
    public static void main(String[] args) {

        int n = 5, r = 2;
        int f1 = 1, f2 = 1, f3 = 1;

        for (int i = 1; i <= n; i++)
            f1 = f1 * i;

        for (int i = 1; i <= n-r; i++)
            f2 = f2 * i;

        for (int i = 1; i <= r; i++)
            f3 = f3 * i;

        System.out.println("Permutation = " + f1/f2);
        System.out.println("Combination = " + f1/(f3*f2));
    }
}