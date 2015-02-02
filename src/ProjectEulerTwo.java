/**
 * Created by Eric on 2/1/2015.
 */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    double firstNum = 1;
    double secondNum = 1;
    double nextNum = 0;
    double sum = 0;

    while(firstNum < 4000000) {
      if (firstNum % 2 == 0) {
        sum += firstNum;
      }
      nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    }
    System.out.println(sum);
  }
}
