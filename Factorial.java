
import java.util.Scanner;
class Factorial {
    public static int fact(int n){
         if(n==1){
            return 1;
        }
        int a=n*fact(n-1);
        if(n==1){
            return 1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial");
        int n=sc.nextInt();
        sc.close();
        int f=fact(n);
        System.out.println("The factorial is :" +f);
    }
}
