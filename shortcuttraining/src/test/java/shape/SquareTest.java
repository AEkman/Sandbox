package shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.IntSupplier;
import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void getNumberOfCorners_shouldReturn_4() {
    Shape square = new Square();

    assertValues(4, square::getNumberOfCorners);
  }

  @Test
  void getNumberOfEdges_shouldReturn_4() {
    Square square = new Square();

    assertValues(4, square::getNumberOfEdges);
  }

  private void assertValues(int expectedValue, IntSupplier intSupplier) {
    assertEquals(expectedValue, intSupplier.getAsInt());
  }

}