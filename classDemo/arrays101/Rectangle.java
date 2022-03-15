package arrays101;

public class Rectangle{

  private int width; 
  private int height; 
  // private int area; 
  public void setDimensions(int newWidth, int newHeight) {
    width = newWidth;
    height = newHeight;
    // int area = width * height;
    } 
    public int getArea() {
    return width * height;
  }
	public static void main(String[] args) { 
	  Rectangle box = new Rectangle( );
    box.setDimensions(10, 5);
		box.width = 6;
    System.out.println("The area of our rectangle is " + 
    box.getArea());
	}
}
