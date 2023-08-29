class tommyVecetti{

  public void hit(){
    System.out.println("player is hitting bullets on enemy");
  }

  public void run(){
    System.out.println("player is running away from enemy");
  }

  public void fire(){
    System.out.println("player is firing gun");
  }
  
};

class exercise_8_5{
 public static void main(String[] args){
   tommyVecetti player1 = new tommyVecetti();
   player1.hit();
   player1.run();
   player1.fire();
   
  }
}
