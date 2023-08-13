class Square{
  
   float side;
  
    public void setSide(float s){
      side = s;
    }
    
  public void perimeter(){
    System.out.printf("perimeter of square is %f \n", 4*side);
  }

  public void area(){
    System.out.printf("area of square is %f",side*side);
  }
};

class Main{
 public static void main(String[] args){
   Square s = new Square();
   s.setSide(5);
   s.perimeter();
   s.area();
  }
}
