class Sphere{
  double r;

  public Sphere(double a){
    r = a;
  }

  public void area(){
    System.out.println("Area of sphere is ");
    System.out.println(4*3.14*r*r);
  }

  public void volume(){
    System.out.println("volume of sphere is ");
    System.out.println((4/3)*3.14*r*r*r);
  }

  
};


class exercise_8_5{
  public static void main(String[] args) {
    Sphere s1 = new Sphere(4.32);
    s1.area();
    s1.volume();
  }
}
