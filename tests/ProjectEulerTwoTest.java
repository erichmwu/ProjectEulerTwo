import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerTwo class with the numbers 10 and 100.
 *
 * @author Eric
 */
public class ProjectEulerTwoTest {

  /**
   * Tests computeSumOfEvenFibonacciTerms method with 10 and 100.
   * @throws Exception if a problem occurs while computing the sum.
   */
  @Test
  public void testComputeSumOfEvenFibonacciTerms() throws Exception {
    assertEquals("Testing sum of evens below 10", 10, ProjectEulerTwo.computeSumOfEvenFibonacciTerms(10));
    assertEquals("Testing sum of evens below 100", 44, ProjectEulerTwo.computeSumOfEvenFibonacciTerms(100));
  }
}