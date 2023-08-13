class Rectangle{
  
   float length;
   float breadth;
  
    public void setSide(float l, float b){
      length = l;
      breadth = b;
    }
    
  public void perimeter(){
    System.out.printf("perimeter of recanagle is %f \n", 2*(length+breadth));
  }

  public void area(){
    System.out.printf("area of rectangle is %f",length*breadth);
  }
};

class Main{
 public static void main(String[] args){
   Rectangle r = new Rectangle();
   r.setSide(5,8);
   r.perimeter();
   r.area();
  }
}
