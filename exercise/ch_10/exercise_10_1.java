class circle{
  double r;
  public void setR(double a){
    r = a;
  }
};

class cylinder extends circle{
  double h;
  public void setH(double b){
    h = b;
  } 

  public void area(){
    System.out.println("Area of cylinder is "+ (2*3.14*r*h)+(2*3.14*r*r));
  }
};

class exercise_10_1{
  public static void main(String[] args) {
    cylinder c1 = new cylinder();
    c1.setR(4.2);
    c1.setH(7.4);
    c1.area();
  }
}
