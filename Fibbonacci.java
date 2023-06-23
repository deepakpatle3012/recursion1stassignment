import java.util.Scanner;

public class Fibbonacci {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int a =fib(n-1);
        int b=fib(n-2);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
}

