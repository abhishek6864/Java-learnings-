class Rectangle{
  double b;
  double l;

  public Rectangle(){
    b = 5;
    l = 4;
  }

  public Rectangle(float x, float y){
    l = x;
    b = y;
  }

  public void area(){
    System.out.println("Area of rectangle is");
    System.out.println(l*b);
  }

  public void perimeter(){
    System.out.println("Perimeter of rectangle is");
    System.out.println(2*(l+b));
  }
  
};


class exercise_9_4{
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    
    r1.area();
    r1.perimeter();
  }
}
