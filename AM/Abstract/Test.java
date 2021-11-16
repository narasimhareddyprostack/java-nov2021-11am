abstract class A{
   abstract  void getName();  // defined class
}
public class Test extends A{
    public  void getName(){
        System.out.println("getName Method");
    }
     public static void main(String[] args){
        System.out.println("Helllo......");
        Test t = new Test();
        t.getName();
    }
}