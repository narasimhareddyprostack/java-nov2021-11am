public class Bank_Customer{
    int id;
    String name;
    int amount;

    Bank_Customer(int a, String b, int c){
        this.id = a;
        this.name = b;
        this.amount = c;
        System.out.println("Parameter Constructor");
    }
  
    public static void main(String[] args){
    Bank_Customer c1=  new Bank_Customer(101, "Teju",50000);
    System.out.println(c1.name);

    }
}