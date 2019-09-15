package shape;

public class Triangle implements Shape {

  private static final int NUMBER_OF_CORNERS = 3;

  @Override
  public int getNumberOfCorners() {
    return NUMBER_OF_CORNERS;
  }
}
