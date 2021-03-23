import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("this program does fibonacci");
    wait(690);
    System.out.print("how many number u want: ");
    int termno = in.nextInt();
    long sum = 0;

    for (int i = 1; i <= termno; i++) {
      long f = fibby(i);

      System.out.println("f(" + i + ") = " + f);
      sum = f + sum;
    }
    System.out.println("the sum is " + sum);
  }

  public static long fibby(int termno) {
    System.out.println("Entering fibby: term number = " + termno);
    if (termno <= 2) {
      return 1;
    } else {
      System.out.println("Exiting fibby: term number = " + termno);
      return fibby(termno - 1) + fibby(termno - 2);
    }
  }
  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

}
