import java.util.Scanner;

class EvenNatural {

    // Recursive function to compute sum of all even natural numbers ≤ n
    public static int evenNatural(int n) {
        if (n <= 0)
            return 0;
        if (n % 2 == 0)
            return n + evenNatural(n - 2); // Add current even number, recurse
        else
            return evenNatural(n - 1); // Skip odd, move to next lower number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = evenNatural(n);
            System.out.println("The number is: " + n);
            System.out.println("The sum of even natural numbers up to " + n + " is: " + sum);
        }

        sc.close(); // ✅ Close the Scanner to avoid resource leak
    }
}
