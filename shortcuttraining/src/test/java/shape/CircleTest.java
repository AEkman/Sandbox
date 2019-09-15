package shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CircleTest {

  @Test
  void getNumberOfCorners() {
    Circle circle = new Circle();

    assertEquals(0, circle.getNumberOfCorners());
  }
}