class Cylinder{
  double r;
  double h;

  public Cylinder(double a, double b){
    r = a;
    h = b;
  }

  public void volume(){
    System.out.println("Volume of cylinder is ");
    System.out.println(3.14*r*r*h);
  }

  public void surface(){
    System.out.println("Surface area of cylinder is ");
    System.out.println((2*3.14*r*h)+(2*3.14*r*r*r));
  }
  
};


class exercise_9_3{
  public static void main(String[] args) {
    Cylinder c1 = new Cylinder(4,7.2);
    
    c1.volume();
    c1.surface();
  }
}
