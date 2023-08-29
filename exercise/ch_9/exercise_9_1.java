class Cylinder{
  double r;
  double h;

  public void setter(double a, double b){
    r = a;
    h = b;
  }

  public void area(){
    System.out.println("Area of cylinder is ");
    System.out.println(2*3.14*r*h);
  }
  
};


class exercise_9_1{
  public static void main(String[] args) {
    Cylinder c1 = new Cylinder();
    c1.setter(4,8.2);
    c1.area();
  }
}
