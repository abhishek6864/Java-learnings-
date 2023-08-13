class Employee{
  public String name;
  public int salary;

  public void set(String n, int s){
    name = n;
    salary = s;
  }

  public String getName(){
    return name;
  }
  public int getSalary(){
    return salary;
  }
};
class Main{
 public static void main(String[] args){
    Employee E1 = new Employee();
   E1.set("Pritesh", 300000);
   System.out.println( E1.getName()+ " salary " + E1.getSalary());
  }
}
