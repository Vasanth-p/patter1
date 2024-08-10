
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        int j = 1;
        while (j <= n) {
            int temp = 0;
            int tot = n - 1;
            int val = j;
            for (int i = 1; i <= j; i++) {
                System.out.print(val + " ");
                temp = tot;
                tot--;
                val = val + temp;
            }
            System.out.println();
            j++;
        }
    }

}
