package shape;

public class Square implements Shape {

  private static final int NUMBER_OF_EDGES = 4;
  private static final int NUMBER_OF_CORNERS = 4;

  public int getNumberOfCorners() {
    return NUMBER_OF_CORNERS;
  }

  int getNumberOfEdges() {
    return NUMBER_OF_EDGES;
  }

}
