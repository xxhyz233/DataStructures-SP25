/* Homework assignment 1: Fibonacci Race
 */
public class FibonacciRace {
  // Just some colored ANSI code so it's less boring in cmd
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[36m";
  public static void main(String[] args) {
    // Setting our index as the first argument from cmd
    int maxInput = Integer.parseInt(args[0]);
    long maxTime = Integer.parseInt(args[1]);

    // Exception for two arguments
    if (args.length < 2) {
      throw new IllegalArgumentException("Two arguments are required: <index> and <maxTime>.");
    }

    // Exceptions for non-integers, checks for NumberFormat exception then run the custom exception beforehand
    try {
      maxInput = Integer.parseInt(args[0]);
      maxTime = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Arguments must be integers.", e);
    }
    // Exceptions for negative integers 
    if(maxInput < 0 || maxTime < 0) {
      throw new IllegalArgumentException("Argument cannot be negative.");
    }
    
    // Recursive
    long startTime = System.currentTimeMillis();
    long recursiveResult = recursiveFib(maxInput);
    long endTime = System.currentTimeMillis();
    long timeToRun = endTime - startTime;
    if(timeToRun > maxTime) {
      System.out.println("RECURSE Algorithm exceeds maximum run time!");
    }
    System.out.println("RECURSE\t" + maxInput + "\t" + recursiveResult + "\t" + timeToRun);
    
    // Dynamic Programming
    startTime = System.currentTimeMillis();
    long dynamicResult = dynamicFib(maxInput);
    endTime = System.currentTimeMillis();
    timeToRun = endTime - startTime;
    if(timeToRun > maxTime) {
      System.out.println("DYNAMIC Algorithm exceeds maximum run time!");
    }
    System.out.println("DYNAMIC\t" + maxInput + "\t" + dynamicResult + "\t" + timeToRun);
    
    // Closed Formula
    startTime = System.currentTimeMillis();
    long formulaResult = formulaFib(maxInput);
    endTime = System.currentTimeMillis();
    timeToRun = endTime - startTime;
    if(timeToRun > maxTime) {
      System.out.println("FORMULA Algorithm exceeds maximum run time!");
    }
    System.out.println("FORMULA\t" + maxInput + "\t" + formulaResult + "\t" + timeToRun);
  }

  // RECURSIVE
  public static long recursiveFib (int n) {
    long result = 0;
    if (n==0) {
      result = 0;
    }
    if (n==1) {
      result = 1;
    }
    if (n>=2) {
      result = recursiveFib(n-1) + recursiveFib(n-2);
    }
    return result;
  }

  // DYNAMIC PROGRAMMING
  public static long dynamicFib (int n) {
    if (n==0) {
      return 0;
    }
    if (n==1) {
      return 0;
    }
    // Using a array to store the previous two values and the final result 
    long[] fibArr = new long[n+1];
    fibArr[0] = 0;
    fibArr[1] = 1;
    // Adds the previous two values for each index i up to n
    for (int i = 2; i <= n; i++) {
      fibArr[i] =  fibArr[i-1] + fibArr[i-2];
    }
    return fibArr[n];
  }

  // CLOSED FORMULA
  public static long formulaFib (int n) {
    final double GoldenRatio = (1 + Math.sqrt(5)) / 2;
    // Closed formula for the Fibonnaci sequence
    long result = (long) ((Math.pow(GoldenRatio, n) - Math.pow(1-GoldenRatio, n)) / Math.sqrt(5));
    return result;
  }
}