/**
 * Solution to ProjectEuler Problem 2.
 *
 * @author Eric
 */
public class ProjectEulerTwo {
  /**
   * Computes the sum of even numbers in the Fibonacci sequence below 4,000,000.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfEvenFibonacciTerms(4000000);
    System.out.println(sum);
  }

  /**
   * Computes and returns the sum of even numbers in the Fibonacci sequence.
   * @param upperLimit the upper limit for the summation.
   * @return the sum of the even numbers in the Fibonacci sequence below the upper limit.
   */
  public static int computeSumOfEvenFibonacciTerms(int upperLimit) {
    int firstNum = 1;
    int secondNum = 1;
    int nextNum = 0;
    int sum = 0;

    while (firstNum < upperLimit) {
      if (firstNum % 2 == 0) {
        sum += firstNum;
      }
      nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    }
    return sum;
  }
}
