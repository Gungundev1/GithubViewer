import java.util.ArrayList;
import java.util.Scanner;
class primeNumber {
    public static void main(String args[]) {
        ArrayList<Boolean> prime = new ArrayList<>();
        prime.add(0, false);
        prime.add(1, false);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no. to print prime no.");
        int n =scanner.nextInt();
        int i = 2;
        while (i <=n) {
            prime.add(i, true);
            i++;
        }
        for (i = 2; i <= n ; i++) {
            if (prime.get(i)) {
                for (int j = i * i; j <=n ; j = j + i) {
                    prime.set(j, false);
                }
            }
        }
        System.out.println("1 to "+n+ " prime numbers are:)");
        System.out.println();
        for (i = 0; i <=n; i++) {
            if (prime.get(i)) {
                System.out.println(i);
            }
        }
    }
}







