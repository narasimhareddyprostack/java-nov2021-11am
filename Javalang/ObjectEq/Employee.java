class Employee{
  String name;
  Employee(String name){
    this.name = name;
  }
  public static void main(String[] args){
    Employee e1 = new Employee("Rahul");
    Employee e2 = new Employee("Priyanka");
    Employee e3 = new Employee("Rahul");

    System.out.println(e1 == e2);
    System.out.println(e1 == e3);
    System.out.println(100 == 100);
    
    System.out.println(e1.equals(e2));
    System.out.println(e1.equals(e3));
    
  }
}