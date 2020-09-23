package shape;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleTest {

  @Test
  void getNumberOfCorners() {
    Circle circle = new Circle();

    assertEquals(0, circle.getNumberOfCorners());
  }

  @Test
  @DisplayName("new circle test")
  void newCircleTest() {
    
    fail("Not implemented");
  }
}