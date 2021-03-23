import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("this program does fibonacci");
    wait(690);
    System.out.print("how many number u want: ");
    int n = in.nextInt();

    for (int i = 1; i <= n; i++) {
      long f = fib(i);
      System.out.println("fib(" + i + ") = " + f);
    }
  }

  public static long fib(int n) {
    if (n <= 2) {
      return 1;
    } else
      return fib(n - 1) + fib(n - 2);
  }

  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

}
