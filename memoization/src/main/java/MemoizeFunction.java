//import java.util.function.Function;
//
//public class MemoizeFunction {
//
//  public static void main(String[] args) {
//    Function<Integer, Double> avg = MemoizeFunction::average;
//    Function<Integer, Double> avgMemoized = Memo.memoize(avg);
//    Function<Integer, Double> avgMemoized2 = Memo.memoize(avg);
//
//    int n = 1_000_000_000;
//
//    long startTime = System.currentTimeMillis();
//    System.out.println(avgMemoized.apply(n));
//    System.out.println("Total execution time avgMemoized: " + (System.currentTimeMillis() - startTime) + "ms");
//
//    startTime = System.currentTimeMillis();
//    System.out.println(avgMemoized.apply(n));
//    System.out.println("Total execution time avgMemoized: " + (System.currentTimeMillis() - startTime) + "ms");
//
//    startTime = System.currentTimeMillis();
//    System.out.println(avgMemoized2.apply(n));
//    System.out.println("Total execution time avgMemoized: " + (System.currentTimeMillis() - startTime) + "ms");
//  }
//
//}