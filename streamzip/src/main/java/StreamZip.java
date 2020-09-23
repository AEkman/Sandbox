import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamZip {

  public static void main(String[] args) {
    Supplier<Stream<String>> s1 = () -> Stream.of("Good", "Bad");
    Supplier<Stream<String>> s2 = () -> Stream.of("Neutral", "Chaotic");

    Supplier<Stream<String>> reduced =
        () -> s1.get().flatMap(a -> s2.get().map(b -> a + b));

    reduced.get().forEach(System.out::println);
  }
}