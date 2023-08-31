class rectangle{
  double l, b;
  public void setL(double x){
    l = x;
  }
  public void setB(double y){
    b = y;
  }

  public void area(){
    System.out.println("Area of rectangle is "+ l*b);
  }
};

class cuboid extends rectangle{
  double h;
  public void setH(double z){
    h = z;
  } 
  public void volume(){
    System.out.println("Volume of cuboid is "+ l*b*h);
  }
};

class exercise_10_2{
  public static void main(String[] args) {
    cuboid c1 = new cuboid();
    c1.setL(4.2);
    c1.setB(7.4);
    c1.setH(3.4);
    c1.volume();
  }
}
