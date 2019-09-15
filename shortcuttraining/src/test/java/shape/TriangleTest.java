package shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTest {

  @Test
  void getNumberOfCorners_shouldReturn_3() {
    Triangle triangle = new Triangle();

    assertEquals(3, triangle.getNumberOfCorners());
  }
}